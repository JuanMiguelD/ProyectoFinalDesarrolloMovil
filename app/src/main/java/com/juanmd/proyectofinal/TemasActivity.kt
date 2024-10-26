package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class TemasActivity : AppCompatActivity() {

    private lateinit var recyclerViewTemas: RecyclerView
    private lateinit var modulo: Modulo
    private lateinit var modulotest: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temas)

        modulotest = findViewById(R.id.btn_prueba_modulo)

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

        modulotest.setOnClickListener {
            val intent = Intent(this, PruebaModulo::class.java)
            startActivity(intent)
        }

        // Verificar el progreso del usuario al crear la actividad
        verificarProgresoDelUsuario()
    }

    // Se llama cada vez que la actividad vuelve al primer plano
    override fun onResume() {
        super.onResume()
        // Verificar el progreso del usuario para asegurarnos de que los datos estén actualizados
        verificarProgresoDelUsuario()
    }

    // verificar si los temas ya han sido completados para desbloquear la prueba de módulo
    private fun verificarProgresoDelUsuario() {
        // Obtener el UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid != null) {
            val dbRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

            // Obtener el progreso del usuario
            dbRef.child("Progreso").child(ContenidoSingleton.nivelSeleccionado?.nombre.toString())
                .child("Modulos").child(ContenidoSingleton.moduloSeleccionado?.nombre.toString())
                .child("Temas").get()
                .addOnSuccessListener { snapshot ->
                    val temasCompletados = snapshot.value as? Map<String, Boolean> ?: emptyMap()
                    val totalTemas = modulo.temas.size // Obtener la cantidad total de temas

                    // Contar los temas completados
                    val countTemasCompletados = temasCompletados.values.count { it }

                    // Habilitar o deshabilitar el botón según el progreso
                    modulotest.isEnabled = countTemasCompletados == totalTemas
                }
                .addOnFailureListener { e ->
                    Log.e("TemasActivity", "Error al obtener el progreso del usuario: ", e)
                }
        } else {
            Toast.makeText(this, "Error al cargar datos del usuario", Toast.LENGTH_SHORT).show()
        }
    }

    private fun irAVideo(tema: Tema) {
        ContenidoSingleton.temaSeleccionado = tema
        val intent = Intent(this, ClaseActivity::class.java)
        startActivity(intent)
    }
}


