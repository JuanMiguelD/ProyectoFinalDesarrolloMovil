package com.juanmd.proyectofinal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ClaseActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var botonSiguiente: Button
    private lateinit var tema: Tema

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase)

        tema = intent.getParcelableExtra("tema")!!

        videoView = findViewById(R.id.videoView)
        botonSiguiente = findViewById(R.id.boton_siguiente)

        // Cargar el video (asegúrate de tener la URL del video)
        val videoUri = Uri.parse("URL_DEL_VIDEO")
        videoView.setVideoURI(videoUri)

        // Configurar el botón para ir a las preguntas
        botonSiguiente.setOnClickListener {
            irAPreguntas(tema)
        }

        videoView.setOnCompletionListener {
            // Mostrar el botón cuando el video termina
            botonSiguiente.visibility = View.VISIBLE
        }

        videoView.start()
    }

    private fun irAPreguntas(tema: Tema) {
        //val intent = Intent(this, PreguntasActivity::class.java)
        //intent.putExtra("tema", tema) // Pasar el tema seleccionado
        //startActivity(intent)
    }
}
