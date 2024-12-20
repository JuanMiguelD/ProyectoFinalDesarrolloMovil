package com.juanmd.proyectofinal

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class ClaseActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var botonSiguiente: Button
    private lateinit var image: ImageView
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

        webView = findViewById(R.id.videoView)
        botonSiguiente = findViewById(R.id.boton_siguiente)
        preguntasLayout = findViewById(R.id.preguntas_layout)
        image = findViewById(R.id.imagen)


        mostrarcontenido()

        // Mostrar el botón al finalizar la carga de la página (opcional)
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                botonSiguiente.visibility = View.VISIBLE
            }
        }


        // Al hacer clic en el botón, mostrar preguntas
        botonSiguiente.setOnClickListener {
            image.visibility = View.GONE
            webView.visibility = View.GONE
            botonSiguiente.visibility = View.GONE
            mostrarPregunta()
        }


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
            val respuestaCorrecta =  pregunta.respuesta
            Toast.makeText(this, "Incorrecto, la respuesta correcta era: $respuestaCorrecta ", Toast.LENGTH_SHORT).show()
            vidas -= 1
            indicePreguntaActual++
            if (indicePreguntaActual < tema.ejercicios.size) {
                mostrarPregunta()
            } else {
                mostrarFelicitacion()
            }

            if (vidas <= 0){
                Toast.makeText(this, "No te preocupes, revisemos el contenido de nuevo ;)", Toast.LENGTH_SHORT).show()
                indicePreguntaActual = 0
                preguntasLayout.visibility = View.GONE
                mostrarcontenido()
                botonSiguiente.visibility = View.VISIBLE
            }
        }

    }

    private fun mostrarcontenido(){

        val url = tema.videoUrl // Extrae el ID del video de YouTube

        if (url.contains("youtube.com") || url.contains("youtu.be")) {
            // Cargar video de YouTube
            val videoId = url.substringAfterLast("v=")
            val videoHtml = """
                <iframe width="100%" height="100%"
                src="https://www.youtube.com/embed/$videoId"
                frameborder="0" allowfullscreen></iframe>
            """
            webView.settings.javaScriptEnabled = true
            webView.loadData(videoHtml, "text/html", "utf-8")
            webView.visibility = View.VISIBLE

        } else {
            image.visibility = View.VISIBLE
            val resId = resources.getIdentifier(url, "drawable", packageName)
            image.setImageResource(resId)
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
        progressBar.progress = indicePreguntaActual * (100/tema.ejercicios.size)
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
        progressBar.progress = indicePreguntaActual * (100/tema.ejercicios.size)
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
        progressBar.progress = indicePreguntaActual * (100/tema.ejercicios.size)
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
    //Final de preguntas
    private fun mostrarFelicitacion() {
        val builder = AlertDialog.Builder(this)
        marcarTemaComoCompletado()
        builder.setTitle("¡Felicitaciones!")
        builder.setMessage("Has completado todas las preguntas correctamente.")
        builder.setPositiveButton("Aceptar") { dialog, _ ->
            // Redirigir a TemasActivity
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
            dbRef.child("Progreso").child(ContenidoSingleton.nivelSeleccionado?.nombre.toString()).child("Modulos").child(ContenidoSingleton.moduloSeleccionado?.nombre.toString()).child("Temas").child(temaCompletado).setValue(true)
                .addOnSuccessListener {
                    Log.d("ClaseActivity", "Tema $temaCompletado completado.")
                }
                .addOnFailureListener { e ->
                    Log.e("ClaseActivity", "Error al marcar el tema como completado: ", e)
                }
        }
    }


}
