package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ModulosActivity : AppCompatActivity() {

    private lateinit var recyclerViewModulos: RecyclerView
    private lateinit var nivel: Nivel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulos)

        // Acceder al nivel seleccionado desde el Singleton
        nivel = ContenidoSingleton.nivelSeleccionado ?: run {
            Log.e("ModulosActivity", "No se recibió ningún nivel")
            Toast.makeText(this, "Error al cargar el nivel", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Configurar RecyclerView
        recyclerViewModulos = findViewById(R.id.lista_modulos)
        recyclerViewModulos.layoutManager = LinearLayoutManager(this)
        recyclerViewModulos.adapter = ModuloAdapter(nivel.modulos) { moduloSeleccionado ->
            irATemas(moduloSeleccionado)
        }
    }

    private fun irATemas(modulo: Modulo) {
        ContenidoSingleton.moduloSeleccionado = modulo
        val intent = Intent(this, TemasActivity::class.java)
        startActivity(intent)
    }
}


