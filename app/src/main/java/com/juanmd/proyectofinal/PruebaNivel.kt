package com.juanmd.proyectofinal

import android.annotation.SuppressLint
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
import com.google.firebase.database.FirebaseDatabase

class PruebaNivel : AppCompatActivity() {


    private lateinit var preguntasLayout: LinearLayout
    private lateinit var nivel: Nivel
    private var indicePreguntaActual = 0
    private var vidas: Int = 3
    private lateinit var preguntas: List<Ejercicio>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_modulo)

        // Acceder al nivel seleccionado desde el Singleton
        val nivel = ContenidoSingleton.nivelSeleccionado?.let {
            it // Aquí puedes realizar operaciones adicionales con 'it' si es necesario
        } ?: run {
            Log.e("PruebaNivel", "No se recibió ningún nivel")
            Toast.makeText(this, "Error al cargar las preguntas", Toast.LENGTH_SHORT).show()
            finish() // Cierra la actividad si no hay nivel seleccionado
            return // Sale de la función
        }


        // Obtener preguntas del módulo
        preguntas = PreguntasNivel.obtenerPreguntas(nivel.nombre)

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

    @SuppressLint("SetTextI18n")
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

    @SuppressLint("SetTextI18n")
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
        desbloquearSiguienteNivel()
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


    // Función para desbloquear el siguiente Nivel
    private fun desbloquearSiguienteNivel() {
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        val dbRef = uid?.let { FirebaseDatabase.getInstance().getReference("Usuarios").child(uid) }

        // Obtener el nivel actual del usuario
        if (dbRef != null) {
            dbRef.child("NivelActual").get().addOnSuccessListener { snapshot ->
                val nivelActual = ContenidoSingleton.nivelSeleccionado?.nombre.toString()
                val siguienteNivel = when (nivelActual) {
                    "A1" -> "A2"
                    "A2" -> "B1"
                    "B1" -> "B2"

                    else -> return@addOnSuccessListener // Salir si no hay siguiente nivel
                }

                // Crear el mapa con los datos del nuevo nivel


                // Actualizar el nodo Progreso para incluir el nuevo nivel
                dbRef.child("Progreso").child(siguienteNivel).child("Disponible").setValue(true).addOnSuccessListener {
                    Log.d("ActualizarNodo", "Hijo $siguienteNivel agregado correctamente.")
                }.addOnFailureListener { e ->
                    Log.e("ActualizarNodo", "Error al agregar $siguienteNivel: ", e)
                }
            }.addOnFailureListener { e ->
                Log.e("ObtenerNivelActual", "Error al obtener el nivel actual: ", e)
            }
        }

    }

}