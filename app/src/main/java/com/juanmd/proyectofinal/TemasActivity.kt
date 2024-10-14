package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TemasActivity : AppCompatActivity() {

    private lateinit var recyclerViewTemas: RecyclerView
    private lateinit var modulo: Modulo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temas)

        modulo = intent.getParcelableExtra("modulo")!!

        // Configurar RecyclerView con el id lista_temas
        recyclerViewTemas = findViewById(R.id.lista_temas)
        recyclerViewTemas.layoutManager = LinearLayoutManager(this)
        recyclerViewTemas.adapter = TemaAdapter(modulo.temas) { temaSeleccionado ->
            irAVideo(temaSeleccionado)
        }
    }

    private fun irAVideo(tema: Tema) {
        val intent = Intent(this, ClaseActivity::class.java)
        intent.putExtra("tema", tema) // Pasar el tema seleccionado
        startActivity(intent)
    }
}