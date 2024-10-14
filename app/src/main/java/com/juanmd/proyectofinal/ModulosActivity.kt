package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ModulosActivity : AppCompatActivity() {

    private lateinit var recyclerViewModulos: RecyclerView
    private lateinit var nivel: Nivel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulos)

        nivel = intent.getParcelableExtra("nivel")!!

        // Configurar RecyclerView
        recyclerViewModulos = findViewById(R.id.lista_modulos)
        recyclerViewModulos.layoutManager = LinearLayoutManager(this)
        recyclerViewModulos.adapter = ModuloAdapter(nivel.modulos) { moduloSeleccionado ->
            irATemas(moduloSeleccionado)
        }
    }

    private fun irATemas(modulo: Modulo) {
        val intent = Intent(this, TemasActivity::class.java)
        intent.putExtra("modulo", modulo) // Pasar el módulo seleccionado
        startActivity(intent)
    }
}