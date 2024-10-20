package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class InicioActivity : AppCompatActivity() {

    private lateinit var recyclerViewNiveles: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Inicializar niveles automáticamente desde el singleton
        val niveles = ContenidoSingleton.niveles

        // Configurar RecyclerView
        recyclerViewNiveles = findViewById(R.id.lista_niveles)
        recyclerViewNiveles.layoutManager = LinearLayoutManager(this)
        recyclerViewNiveles.adapter = NivelAdapter(niveles) { nivelSeleccionado ->
            irAModulos(nivelSeleccionado)
        }
    }

    private fun irAModulos(nivel: Nivel) {
        // Guardar el nivel seleccionado en el singleton
        ContenidoSingleton.nivelSeleccionado = nivel

        // Cambiar a la actividad ModulosActivity
        val intent = Intent(this, ModulosActivity::class.java)
        startActivity(intent)
    }
}


