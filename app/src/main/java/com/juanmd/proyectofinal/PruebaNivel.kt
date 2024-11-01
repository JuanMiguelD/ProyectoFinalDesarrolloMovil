package com.juanmd.proyectofinal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class PruebaNivel : AppCompatActivity() {


    private lateinit var preguntasLayout: LinearLayout
    private var indicePreguntaActual = 0
    private var vidas: Int = 3
    private lateinit var preguntas: List<Ejercicio>
    private lateinit var respuestaEditText: EditText // Definir como propiedad de la clase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_modulo)

        // Acceder al nivel seleccionado desde el Singleton
        val nivel = ContenidoSingleton.nivelSeleccionado!!.nombre


        // Obtener preguntas del módulo
        preguntas = PreguntasNivel.obtenerPreguntas(nivel)

        preguntasLayout = findViewById(R.id.preguntas_container)

        // Mostrar la primera pregunta
        mostrarPregunta()
    }

    private fun mostrarPregunta() {
        preguntasLayout.removeAllViews()
        preguntasLayout.visibility = View.VISIBLE

        if (indicePreguntaActual < preguntas.size) {
            val pregunta = preguntas[indicePreguntaActual]

            when (pregunta) {
                is OpcionMultiple -> mostrarOpcionMultiple(pregunta)
                is CompletarFrase -> mostrarCompletarFrase(pregunta)
                is OrdenarPalabras -> mostrarOrdenarPalabras(pregunta)
            }
        }
    }

    private fun verificarRespuesta(pregunta: Ejercicio, respuestaUsuario: String) {
        if (pregunta.verificarRespuesta(respuestaUsuario)) {
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()
            // Pasar a la siguiente pregunta
            indicePreguntaActual++
            if (indicePreguntaActual < preguntas.size) {
                mostrarPregunta()
            } else {
                mostrarFelicitacion()
            }
        } else {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show()
            vidas -= 1
            if (vidas == 0){
                Toast.makeText(this, "No te preocupes, revisemos el video de nuevo ;)", Toast.LENGTH_SHORT).show()
                indicePreguntaActual = 0
                finish()
            }

        }


    }


    private fun mostrarOpcionMultiple(pregunta: OpcionMultiple) {

        // Crear la barra de progreso programáticamente
        var progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal)
        progressBar.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        progressBar.max = 100
        progressBar.progress = indicePreguntaActual * (100/preguntas.size)
        preguntasLayout.addView(progressBar)

        val enunciado = TextView(this)
        enunciado.text = pregunta.enunciado
        enunciado.textSize = 18f

        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
        preguntasLayout.addView(enunciado)
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
        // Crear la barra de progreso programáticamente
        var progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal)
        progressBar.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        progressBar.max = 100
        progressBar.progress = indicePreguntaActual * (100/preguntas.size)
        preguntasLayout.addView(progressBar)


        val enunciadoTextView = TextView(this)
        enunciadoTextView.text = pregunta.enunciado
        enunciadoTextView.textSize = 18f
        preguntasLayout.addView(enunciadoTextView)

        val fraseTextView = TextView(this)
        fraseTextView.text = pregunta.pregunta
        preguntasLayout.addView(fraseTextView)

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
        // Crear la barra de progreso programáticamente
        var progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal)
        progressBar.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        progressBar.max = 100
        progressBar.progress = indicePreguntaActual * (100/preguntas.size)
        preguntasLayout.addView(progressBar)

        val enunciado = TextView(this)
        enunciado.text = pregunta.enunciado
        enunciado.textSize = 18f

        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
        preguntasLayout.addView(enunciado)
        preguntasLayout.addView(preguntaTextView)

        respuestaEditText = EditText(this)
        respuestaEditText.hint = "Ordena las palabras"
        preguntasLayout.addView(respuestaEditText)

        // Lista de botones de palabras
        val botonesPalabras = mutableListOf<Button>()

        pregunta.palabrasDesordenadas.forEach { palabra ->
            val botonPalabra = Button(this)
            botonPalabra.text = palabra
            botonPalabra.setOnClickListener {
                val textoActual = respuestaEditText.text.toString().trim()

                // Agregar la palabra seleccionada
                if (textoActual.isNotEmpty()) {
                    respuestaEditText.setText("$textoActual $palabra")
                } else {
                    respuestaEditText.setText(palabra)
                }

                // Deshabilitar el botón de la palabra
                botonPalabra.isEnabled = false
            }
            botonesPalabras.add(botonPalabra)
            preguntasLayout.addView(botonPalabra)
        }

        // Botón para borrar la última palabra
        val botonBorrar = Button(this)
        botonBorrar.text = "Borrar última palabra"
        botonBorrar.setOnClickListener {
            val textoActual = respuestaEditText.text.toString().trim()

            if (textoActual.isNotEmpty()) {
                // Separar las palabras
                val palabras = textoActual.split(" ").toMutableList()

                // Recuperar la última palabra y removerla
                val ultimaPalabra = palabras.removeAt(palabras.size - 1)

                // Actualizar el texto en el EditText
                respuestaEditText.setText(palabras.joinToString(" "))

                // Volver a habilitar el botón de la última palabra eliminada
                botonesPalabras.forEach { boton ->
                    if (boton.text == ultimaPalabra) {
                        boton.isEnabled = true
                    }
                }
            }
        }
        preguntasLayout.addView(botonBorrar)

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
        val nivelActual = ContenidoSingleton.nivelSeleccionado?.nombre.toString()

        val siguienteNivel = when (nivelActual) {
            "A1" -> "A2"
            "A2" -> "B1"
            "B1" -> "B2"

            else -> return // Salir si no hay siguiente nivel
        }

        dbRef?.child("Progreso")?.child(siguienteNivel)?.child("Disponible")?.setValue(true)

    }

}