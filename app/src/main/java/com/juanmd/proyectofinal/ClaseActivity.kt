package com.juanmd.proyectofinal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ClaseActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var botonSiguiente: Button
    private lateinit var preguntasLayout: LinearLayout
    private lateinit var tema: Tema

    private var indicePreguntaActual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase)

        tema = intent.getParcelableExtra("tema")!!

        videoView = findViewById(R.id.videoView)
        botonSiguiente = findViewById(R.id.boton_siguiente)
        preguntasLayout = findViewById(R.id.preguntas_layout)

        val videoUri = Uri.parse(tema.videoUrl)
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
        // Limpiar el layout de preguntas antes de mostrar la siguiente
        preguntasLayout.removeAllViews()
        preguntasLayout.visibility = View.VISIBLE

        if (indicePreguntaActual < tema.ejercicios.size) {
            val pregunta = tema.ejercicios[indicePreguntaActual] as OpcionMultiple

            // Crear un TextView para la pregunta
            val preguntaTextView = TextView(this)
            preguntaTextView.text = pregunta.pregunta
            preguntaTextView.textSize = 18f
            preguntasLayout.addView(preguntaTextView)


            // Crear botones de opción para cada respuesta
            pregunta.opciones.forEach { opcion ->
                val botonOpcion = Button(this)
                botonOpcion.text = opcion
                botonOpcion.setOnClickListener {
                    verificarRespuesta(pregunta, opcion)
                }
                preguntasLayout.addView(botonOpcion)
            }
        }
    }

    private fun verificarRespuesta(pregunta: OpcionMultiple, respuestaSeleccionada: String) {
        if (pregunta.respuestaCorrecta == respuestaSeleccionada) {
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show()
        }

        // Pasar a la siguiente pregunta
        indicePreguntaActual++
        if (indicePreguntaActual < tema.ejercicios.size) {
            mostrarPregunta()
        } else {
            Toast.makeText(this, "¡Completaste todas las preguntas!", Toast.LENGTH_LONG).show()
        }
    }
}
