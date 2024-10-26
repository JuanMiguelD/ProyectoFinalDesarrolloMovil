package com.juanmd.proyectofinal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.MediaController
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class ClaseActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var botonSiguiente: Button
    private lateinit var mediaController: MediaController
    private lateinit var preguntasLayout: LinearLayout
    private lateinit var tema: Tema
    private var vidas:Int = 3


    private var indicePreguntaActual = 0
    private lateinit var respuestaEditText: EditText // Definir como propiedad de la clase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase)

        tema = ContenidoSingleton.temaSeleccionado?: run {
            Log.e("ClaseActivity", "No se recibió ningún tema")
            Toast.makeText(this, "Error al cargar el tema", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        videoView = findViewById(R.id.videoView)
        botonSiguiente = findViewById(R.id.boton_siguiente)
        preguntasLayout = findViewById(R.id.preguntas_layout)

        mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val videoUri = Uri.parse(tema.videoUrl)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(videoUri)

        // Mostrar el botón al finalizar el video
        videoView.setOnCompletionListener {
            botonSiguiente.visibility = View.VISIBLE
        }

        // Al hacer clic en el botón, mostrar preguntas
        botonSiguiente.setOnClickListener {
            botonSiguiente.visibility = View.GONE
            mostrarPregunta()
        }

        videoView.start()
    }

    private fun mostrarPregunta() {
        preguntasLayout.removeAllViews()
        preguntasLayout.visibility = View.VISIBLE

        if (indicePreguntaActual < tema.ejercicios.size) {
            val pregunta = tema.ejercicios[indicePreguntaActual]

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
            if (indicePreguntaActual < tema.ejercicios.size) {
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
                preguntasLayout.visibility = View.GONE
                videoView.start()
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

        val fraseTextView = TextView(this)
        fraseTextView.text = pregunta.fraseIncompleta.replace("_", "_____")
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
        val preguntaTextView = TextView(this)
        preguntaTextView.text = pregunta.pregunta
        preguntaTextView.textSize = 18f
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
    //Final de preguntas
    private fun mostrarFelicitacion() {
        val builder = AlertDialog.Builder(this)
        marcarTemaComoCompletado()
        builder.setTitle("¡Felicitaciones!")
        builder.setMessage("Has completado todas las preguntas correctamente.")
        builder.setPositiveButton("Aceptar") { dialog, _ ->
            // Redirigir a TemasActivity
            val intent = Intent(this, TemasActivity::class.java)
            startActivity(intent)
            finish()
            dialog.dismiss()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }

    //marcar tema como completado en la base de datos
    private fun marcarTemaComoCompletado() {
        // Obtener el UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid != null) {
            // Obtener referencia a la base de datos
            val dbRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

            // Marcar el tema como completado en el nodo correspondiente
            val temaCompletado = tema.nombre // Asumiendo que la clase Tema tiene un atributo 'nombre'
            dbRef.child("Progreso").child(ContenidoSingleton.nivelSeleccionado?.nombre.toString()).child("TemasCompletados").child(temaCompletado).setValue(true)
                .addOnSuccessListener {
                    Log.d("ClaseActivity", "Tema $temaCompletado marcado como completado.")
                }
                .addOnFailureListener { e ->
                    Log.e("ClaseActivity", "Error al marcar el tema como completado: ", e)
                }
        }
    }



}
