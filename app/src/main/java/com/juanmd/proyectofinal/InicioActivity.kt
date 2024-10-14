package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class InicioActivity : AppCompatActivity() {

    private lateinit var recyclerViewNiveles: RecyclerView
    private lateinit var niveles: List<Nivel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Inicializar niveles
        niveles = listOf(
            Nivel("A1", listOf(/* Módulos para A1 */)),
            Nivel("A2", listOf(/* Módulos para A2 */))
        )

        // Configurar RecyclerView
        recyclerViewNiveles = findViewById(R.id.lista_niveles)
        recyclerViewNiveles.layoutManager = LinearLayoutManager(this)
        recyclerViewNiveles.adapter = NivelAdapter(niveles) { nivelSeleccionado ->
            irAModulos(nivelSeleccionado)
        }
    }

    private fun irAModulos(nivel: Nivel) {
        val intent = Intent(this, ModulosActivity::class.java)
        intent.putExtra("nivel", nivel) // Pasar el nivel seleccionado
        startActivity(intent)
    }
}

