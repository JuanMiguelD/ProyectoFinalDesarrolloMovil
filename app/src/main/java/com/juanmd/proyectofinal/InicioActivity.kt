package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class InicioActivity : AppCompatActivity() {

    private lateinit var recyclerViewNiveles: RecyclerView
    private lateinit var niveles: List<Nivel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Inicializar niveles automáticamente
        niveles = crearNiveles()

        // Configurar RecyclerView
        recyclerViewNiveles = findViewById(R.id.lista_niveles)
        recyclerViewNiveles.layoutManager = LinearLayoutManager(this)
        recyclerViewNiveles.adapter = NivelAdapter(niveles) { nivelSeleccionado ->
            irAModulos(nivelSeleccionado)
        }
    }

    private fun crearNiveles(): List<Nivel> {
        val tema1 = Tema("Presentaciones", "urlVideo1", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello")
        ))
        val tema2 = Tema("Saludos", "urlVideo2", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye")
        ))
        val tema3 = Tema("Frases Comunes", "urlVideo3", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val modulo1 = Modulo("Introducción al Inglés", listOf(tema1, tema2, tema3))
        val modulo2 = Modulo("Vocabulario Básico", listOf(tema1, tema2, tema3))
        val modulo3 = Modulo("Frases Comunes", listOf(tema1, tema2, tema3))
        val modulo4 = Modulo("Gramática Inicial", listOf(tema1, tema2, tema3))

        val nivelA1 = Nivel("A1", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelA2 = Nivel("A2", listOf(modulo1, modulo2, modulo3, modulo4))

        return listOf(nivelA1, nivelA2)
    }

    private fun irAModulos(nivel: Nivel) {
        Log.d("InicioActivity", "Nivel seleccionado: ${nivel.nombre}")
        Log.d("InicioActivity", "Número de módulos en el nivel: ${nivel.modulos.size}")
        nivel.modulos.forEach { modulo ->
            Log.d("ModulosActivity", "Modulo recibido: ${modulo.nombre}")
            modulo.temas.forEach { tema ->
                Log.d("ModulosActivity", "Tema recibido: ${tema.nombre} con ${tema.ejercicios.size} ejercicios")
            }
        }

        val intent = Intent(this, ModulosActivity::class.java)
        intent.putExtra("nivel", nivel)
        startActivity(intent)
    }
}


