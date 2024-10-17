package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TemasActivity : AppCompatActivity() {

    private lateinit var recyclerViewTemas: RecyclerView
    private lateinit var modulo: Modulo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temas)

        // Acceder al módulo seleccionado desde el Singleton
        modulo = ContenidoSingleton.moduloSeleccionado ?: run {
            Log.e("TemasActivity", "No se recibió ningún módulo")
            Toast.makeText(this, "Error al cargar los temas", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Configurar RecyclerView con el id lista_temas
        recyclerViewTemas = findViewById(R.id.lista_temas)
        recyclerViewTemas.layoutManager = LinearLayoutManager(this)
        recyclerViewTemas.adapter = TemaAdapter(modulo.temas) { temaSeleccionado ->
            irAVideo(temaSeleccionado)
        }
    }

    private fun irAVideo(tema: Tema) {
        ContenidoSingleton.temaSeleccionado = tema
        val intent = Intent(this, ClaseActivity::class.java)
        startActivity(intent)
    }
}

