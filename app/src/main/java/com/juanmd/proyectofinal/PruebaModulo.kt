package com.juanmd.proyectofinal


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class PruebaModulo : AppCompatActivity() {

    private lateinit var preguntasLayout: LinearLayout
    private lateinit var modulo: Modulo
    private var indicePreguntaActual = 0
    private var vidas: Int = 3
    private lateinit var preguntas: List<Ejercicio>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_modulo)

        // Acceder al módulo seleccionado desde el Singleton
        modulo = ContenidoSingleton.moduloSeleccionado ?: run {
            Log.e("PruebaModulo", "No se recibió ningún módulo")
            Toast.makeText(this, "Error al cargar las preguntas", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Obtener preguntas del módulo
        preguntas = PreguntasModulo.obtenerPreguntas(modulo.nombre)

        preguntasLayout = findViewById(R.id.preguntas_container)

        // Mostrar la primera pregunta
        mostrarPregunta()
    }

    private fun mostrarPregunta() {
        preguntasLayout.removeAllViews()

        if (indicePreguntaActual < preguntas.size) {
            val pregunta = preguntas[indicePreguntaActual]

            when (pregunta) {
                is OpcionMultiple -> mostrarOpcionMultiple(pregunta)
                is CompletarFrase -> mostrarCompletarFrase(pregunta)
                is OrdenarPalabras -> mostrarOrdenarPalabras(pregunta)
            }
        } else {
            mostrarFelicitacion()
        }
    }

    private fun verificarRespuesta(pregunta: Ejercicio, respuestaUsuario: String) {
        if (pregunta.verificarRespuesta(respuestaUsuario)) {
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()
            indicePreguntaActual++
            mostrarPregunta()
        } else {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show()
            vidas--
            if (vidas <= 0) {
                Toast.makeText(this, "No te preocupes, revisemos las preguntas de nuevo ;)", Toast.LENGTH_SHORT).show()
                indicePreguntaActual = 0
                mostrarPregunta()
            }
        }
    }

    private fun mostrarOpcionMultiple(pregunta: OpcionMultiple) {
        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
        preguntasLayout.addView(preguntaTextView)

        pregunta.opciones.forEach { opcion ->
            val botonOpcion = Button(this)
            botonOpcion.text = opcion
            botonOpcion.setOnClickListener {
                verificarRespuesta(pregunta, opcion)
            }
            preguntasLayout.addView(botonOpcion)
        }
    }

    private fun mostrarCompletarFrase(pregunta: CompletarFrase) {
        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
        preguntasLayout.addView(preguntaTextView)

        val respuestaEditText = EditText(this)
        respuestaEditText.hint = "Completa la frase"
        preguntasLayout.addView(respuestaEditText)

        val botonVerificar = Button(this)
        botonVerificar.text = "Verificar"
        botonVerificar.setOnClickListener {
            val respuestaUsuario = respuestaEditText.text.toString()
            verificarRespuesta(pregunta, respuestaUsuario)
        }
        preguntasLayout.addView(botonVerificar)
    }

    private fun mostrarOrdenarPalabras(pregunta: OrdenarPalabras) {
        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
        preguntasLayout.addView(preguntaTextView)

        val respuestaEditText = EditText(this)
        respuestaEditText.hint = "Ordena las palabras"
        preguntasLayout.addView(respuestaEditText)

        // Lista de botones de palabras
        pregunta.palabrasDesordenadas.forEach { palabra ->
            val botonPalabra = Button(this)
            botonPalabra.text = palabra
            botonPalabra.setOnClickListener {
                val textoActual = respuestaEditText.text.toString().trim()
                respuestaEditText.setText("$textoActual $palabra")
                botonPalabra.isEnabled = false
            }
            preguntasLayout.addView(botonPalabra)
        }

        // Botón para verificar la respuesta
        val botonVerificar = Button(this)
        botonVerificar.text = "Verificar"
        botonVerificar.setOnClickListener {
            val respuestaUsuario = respuestaEditText.text.toString().trim()
            verificarRespuesta(pregunta, respuestaUsuario)
        }
        preguntasLayout.addView(botonVerificar)
    }

    private fun mostrarFelicitacion() {
        desbloquearSiguienteModulo()
        val builder = AlertDialog.Builder(this)
        builder.setTitle("¡Felicitaciones!")

        builder.setMessage("Has completado todas las preguntas correctamente.")
        builder.setPositiveButton("Aceptar") { dialog, _ ->
            // Redirigir a TemasActivity
            val intent = Intent(this, ModulosActivity::class.java)
            startActivity(intent)
            finish()
            dialog.dismiss()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }


    // Función para desbloquear el siguiente módulo
    private fun desbloquearSiguienteModulo() {
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid != null) {
            val dbRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

            dbRef.child("Progreso")
                .child(ContenidoSingleton.nivelSeleccionado?.nombre.toString())
                .child("ModuloActual")
                .get()
                .addOnSuccessListener { snapshot ->
                    val moduloActual = snapshot.getValue(Int::class.java) ?: 1
                    Log.d(
                        "PruebaModulo",
                        "El modulo que se seleccionó fue: ${ContenidoSingleton.nivelSeleccionado?.modulos?.get(moduloActual-1)?.nombre}"
                    )
                    if(ContenidoSingleton.moduloSeleccionado?.nombre == ContenidoSingleton.nivelSeleccionado?.modulos?.get(moduloActual-1)?.nombre) {


                        if (moduloActual <= 4) { // Verificar si aún no está en el último módulo
                            val siguienteModulo = moduloActual + 1
                            dbRef.child("Progreso")
                                .child(ContenidoSingleton.nivelSeleccionado?.nombre.toString())
                                .child("ModuloActual")
                                .setValue(siguienteModulo)
                                .addOnSuccessListener {
                                    Log.d(
                                        "PruebaModulo",
                                        "Se ha desbloqueado el módulo $siguienteModulo."
                                    )
                                }
                                .addOnFailureListener { e ->
                                    Log.e(
                                        "PruebaModulo",
                                        "Error al desbloquear el siguiente módulo: ",
                                        e
                                    )
                                }
                        }
                    }
                }
                .addOnFailureListener { e ->
                    Log.e("PruebaModulo", "Error al obtener el módulo actual: ", e)
                }
        }
    }



}


