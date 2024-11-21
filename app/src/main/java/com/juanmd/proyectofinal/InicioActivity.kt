package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class InicioActivity : AppCompatActivity() {

    private lateinit var recyclerViewNiveles: RecyclerView
    private lateinit var mDbref: DatabaseReference
    private lateinit var adapter: NivelAdapter
    private var nivelActual: String? = null
    private var nivelesDisponibles: MutableMap<String, Boolean> = mutableMapOf() // Map para almacenar el estado de disponibilidad de cada nivel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid == null) {
            Log.e("InicioActivity", "UID es nulo, el usuario no está autenticado.")
            return
        }

        mDbref = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

        // Obtener el nivel actual y la disponibilidad de los niveles desde Firebase
        cargarProgresoUsuario()
    }

    private fun configurarRecyclerView() {
        val niveles = ContenidoSingleton.niveles

        recyclerViewNiveles = findViewById(R.id.lista_niveles)
        recyclerViewNiveles.layoutManager = LinearLayoutManager(this)

        adapter = NivelAdapter(niveles, nivelesDisponibles) { nivelSeleccionado ->
            if (esNivelDesbloqueado(nivelSeleccionado)) {
                irAModulos(nivelSeleccionado)
            }
        }
        recyclerViewNiveles.adapter = adapter
    }

    private fun irAModulos(nivel: Nivel) {
        ContenidoSingleton.nivelSeleccionado = nivel
        if (nivel.equals("B2") || nivel.equals("C1") || nivel.equals("C2")){
                val builder = AlertDialog.Builder(this)
                builder.setTitle("You don't have access!")

                builder.setMessage(" Para  desbloquear el contenido contáctate con informacion@universalcorp.edu.co y disfruta de la experiencia completa")
                builder.setPositiveButton("Aceptar") { dialog, _ ->
                    dialog.dismiss()

                val alertDialog = builder.create()
                alertDialog.show()
            }

        } else {
            val intent = Intent(this, ModulosActivity::class.java)
            startActivity(intent)
        }

    }

    private fun esNivelDesbloqueado(nivel: Nivel): Boolean {
        // Verifica si el nivel está marcado como disponible en la base de datos
        return nivelesDisponibles[nivel.nombre] == true
    }

    override fun onResume() {
        super.onResume()
        // Volver a cargar el progreso al regresar a la actividad
        cargarProgresoUsuario()
    }

    fun cargarProgresoUsuario(){
        mDbref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    nivelActual = snapshot.child("NivelActual").getValue(String::class.java)

                    snapshot.child("Progreso").children.forEach { nivelSnapshot ->
                        val nombreNivel = nivelSnapshot.key
                        val disponible = nivelSnapshot.child("Disponible").getValue(Boolean::class.java) ?: false
                        nombreNivel?.let { nivelesDisponibles[it] = disponible }
                    }

                    configurarRecyclerView()
                } else {
                    Log.e("InicioActivity", "No se encontró el usuario en la base de datos.")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("InicioActivity", "Error al recuperar datos: ${error.message}")
            }
        })
    }
}

