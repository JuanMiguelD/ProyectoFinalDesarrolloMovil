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

class ModulosActivity : AppCompatActivity() {

    private lateinit var recyclerViewModulos: RecyclerView
    private lateinit var nivel: Nivel
    private lateinit var user: User // Para almacenar el usuario logueado
    private var moduloActual: Int = 1 // Variable para almacenar el módulo actual
    private lateinit var niveltest: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulos)

        niveltest = findViewById(R.id.btn_prueba_nivel)

        // Acceder al nivel seleccionado desde el Singleton
        nivel = ContenidoSingleton.nivelSeleccionado ?: run {
            Log.e("ModulosActivity", "No se recibió ningún nivel")
            Toast.makeText(this, "Error al cargar el nivel", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        obtenerProgreso()
    }

    override fun onResume() {
        super.onResume()
        obtenerProgreso()
    }

    private fun obtenerProgreso() {
        // Obtener datos del usuario actual desde Firebase
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid != null) {
            FirebaseDatabase.getInstance().getReference("Usuarios/$uid").get().addOnSuccessListener { snapshot ->
                user = snapshot.getValue(User::class.java) ?: return@addOnSuccessListener

                // Obtener el módulo actual desde el progreso del usuario
                moduloActual = snapshot.child("Progreso").child(nivel.nombre).child("ModuloActual").getValue(Int::class.java) ?: 1

                // Configurar RecyclerView después de obtener los datos del usuario
                recyclerViewModulos = findViewById(R.id.lista_modulos)
                recyclerViewModulos.layoutManager = LinearLayoutManager(this)
                recyclerViewModulos.adapter = ModuloAdapter(nivel.modulos, moduloActual) { moduloSeleccionado ->
                    irATemas(moduloSeleccionado)
                }
            }.addOnFailureListener {
                Toast.makeText(this, "Error al cargar datos del usuario", Toast.LENGTH_SHORT).show()
            }
            niveltest.setOnClickListener(){
                val intent = Intent(this, PruebaNivel::class.java)
                startActivity(intent)
            }

            verificarProgresoDelUsuario()
        }
    }

    //verificar si los temas ya han sido completado para desbloquear la prueba de módulo
    private fun verificarProgresoDelUsuario() {
        // Obtener el UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid != null) {
            val dbRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

            // Obtener el progreso del usuario
            dbRef.child("Progreso").child(ContenidoSingleton.nivelSeleccionado?.nombre.toString()).child("ModuloActual").get()
                .addOnSuccessListener { snapshot ->
                    val moduloActual = snapshot.getValue(Int::class.java) ?: 1

                    niveltest.isEnabled = (moduloActual == 5)

                }
                .addOnFailureListener { e ->
                    Log.e("TemasActivity", "Error al obtener el progreso del usuario: ", e)
                }
        } else {
            Toast.makeText(this, "Error al cargar datos del usuario", Toast.LENGTH_SHORT).show()
        }
    }

    private fun irATemas(modulo: Modulo) {
        ContenidoSingleton.moduloSeleccionado = modulo
        val intent = Intent(this, TemasActivity::class.java)
        startActivity(intent)
    }
}


