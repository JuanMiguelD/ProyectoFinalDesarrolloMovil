package com.juanmd.proyectofinal

import android.os.Bundle
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


class Prueba_Clasificacion : AppCompatActivity() {

    private lateinit var mensajePrueba: LinearLayout
    private lateinit var continuarButton: Button
    private lateinit var respuestaEditText: EditText // Definir como propiedad de la clase
    private lateinit var preguntasLayout: LinearLayout
    private var preguntas: List<Ejercicio> = listOf()  // Cargar preguntas de clasificación aquí
    private val niveles = listOf("A1", "A2", "B1", "B2", "C1", "C2")
    private var nivelActualIndex = 0
    private var preguntaActualIndex = 0
    private var preguntaprogressBarIndice = 0
    private var erroresPorNivel = mutableMapOf<String, Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_clasificacion)
        preguntasLayout = findViewById(R.id.preguntas_container)
        continuarButton = findViewById((R.id.iniciar_prueba))
        mensajePrueba = findViewById(R.id.mensaje_prueba)


        continuarButton.setOnClickListener(){
            mensajePrueba.visibility = View.GONE
            iniciarPrueba()
        }
    }

    private fun iniciarPrueba() {
        if (nivelActualIndex < niveles.size) {
            val nivelActual = niveles[nivelActualIndex]
            preguntas = PreguntasClasificación.obtenerPreguntas(nivelActual)
            erroresPorNivel[nivelActual] = 0 // Inicia el contador de errores en 0 para el nivel
            preguntaActualIndex = 0
            mostrarPregunta()
        } else {
            clasificarusuario()
            mostrarFelicitacion()
        }
    }

    private fun mostrarPregunta() {
        preguntasLayout.removeAllViews()
        preguntasLayout.visibility = View.VISIBLE

        if (preguntaActualIndex < preguntas.size) {
            val pregunta = preguntas[preguntaActualIndex]

            when (pregunta) {
                is OpcionMultiple -> mostrarOpcionMultiple(pregunta)
                is CompletarFrase -> mostrarCompletarFrase(pregunta)
                is OrdenarPalabras -> mostrarOrdenarPalabras(pregunta)
            }
        } else {
            nivelActualIndex++
            iniciarPrueba() // Pasa al siguiente nivel si todas las preguntas del nivel actual se han contestado
        }

    }

    private fun verificarRespuesta(pregunta: Ejercicio, respuestaUsuario: String) {
        if (pregunta.verificarRespuesta(respuestaUsuario)) {
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()
            // Pasar a la siguiente pregunta
            preguntaActualIndex++
            preguntaprogressBarIndice++
            if (preguntaActualIndex < preguntas.size) {
                mostrarPregunta()
            } else {
                nivelActualIndex++
                iniciarPrueba()
            }
        } else {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show()
            erroresPorNivel[niveles[nivelActualIndex]] = erroresPorNivel[niveles[nivelActualIndex]]!! + 1
            if (erroresPorNivel[niveles[nivelActualIndex]] == 3){
                nivelActualIndex--
                clasificarusuario()
                preguntaActualIndex = 0
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
        progressBar.progress = preguntaprogressBarIndice * (100/48)
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
        progressBar.progress = preguntaprogressBarIndice * (100/48)
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
        progressBar.progress = preguntaprogressBarIndice * (100/48)
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


    private fun clasificarusuario(){
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        var nivelActual = niveles[nivelActualIndex]
        val indexActual = niveles.indexOf(nivelActual)
        if (indexActual == -1) return // Si no se encuentra el nivel, salir de la función

        // Referencia a la base de datos de Firebase
        val databaseRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(userId).child("Progreso")

        FirebaseDatabase.getInstance().getReference("Usuarios").child(userId).child("NivelActual").setValue(niveles[nivelActualIndex])

        // Recorre los niveles hasta el actual y desbloquea cada uno
        for (i in 0..indexActual) {
            val nivel = niveles[i]
            databaseRef.child(nivel).child("Disponible").setValue(true)
                .addOnSuccessListener {
                    if (i == indexActual) { // Solo muestra el mensaje una vez cuando termina el bucle
                        Toast.makeText(this, "Nivel $nivelActual y niveles anteriores desbloqueados!", Toast.LENGTH_SHORT).show()
                    }
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(this, "Error al desbloquear el nivel $nivel: ${exception.message}", Toast.LENGTH_SHORT).show()
                }
        }

    }

}