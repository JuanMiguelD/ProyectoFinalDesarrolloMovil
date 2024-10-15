package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("DEPRECATION")
class ModulosActivity : AppCompatActivity() {

    private lateinit var recyclerViewModulos: RecyclerView
    private lateinit var nivel: Nivel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulos)

        // Asignar nivel a la propiedad global
        nivel = intent.getParcelableExtra<Nivel>("nivel") ?: run {
            Log.e("ModulosActivity", "No se recibió ningún nivel")
            Toast.makeText(this, "Error al cargar los módulos", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        Log.d("ModulosActivity", "Nivel recibido: ${nivel.nombre}")
        Log.d("ModulosActivity", "Número de módulos recibidos: ${nivel.modulos.size}")

        nivel.modulos.forEach { modulo ->
            Log.d("ModulosActivity", "Modulo recibido: ${modulo.nombre}")
            modulo.temas.forEach { tema ->
                Log.d("ModulosActivity", "Tema recibido: ${tema.nombre} con ${tema.ejercicios.size} ejercicios")
            }
        }


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
