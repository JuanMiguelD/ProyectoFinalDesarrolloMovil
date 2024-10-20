package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Obtener UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid

        // Obtener la referencia a la base de datos de Firebase
        mDbref = FirebaseDatabase.getInstance().getReference("user").child(uid!!)

        // Recuperar el progreso del usuario de Firebase
        mDbref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                nivelActual = snapshot.child("nivelActual").getValue(String::class.java)
                configurarRecyclerView()
            }

            override fun onCancelled(error: DatabaseError) {
                // Manejo de errores
            }
        })
    }

    private fun configurarRecyclerView() {
        // Inicializar niveles automáticamente desde el singleton
        val niveles = ContenidoSingleton.niveles

        // Configurar RecyclerView
        recyclerViewNiveles = findViewById(R.id.lista_niveles)
        recyclerViewNiveles.layoutManager = LinearLayoutManager(this)

        // Adaptar los niveles en función del progreso del usuario
        adapter = NivelAdapter(niveles, nivelActual) { nivelSeleccionado ->
            if (esNivelDesbloqueado(nivelSeleccionado)) {
                irAModulos(nivelSeleccionado)
            }
        }
        recyclerViewNiveles.adapter = adapter
    }

    private fun irAModulos(nivel: Nivel) {
        // Guardar el nivel seleccionado en el singleton
        ContenidoSingleton.nivelSeleccionado = nivel

        // Cambiar a la actividad ModulosActivity
        val intent = Intent(this, ModulosActivity::class.java)
        startActivity(intent)
    }

    private fun esNivelDesbloqueado(nivel: Nivel): Boolean {
        val ordenNiveles = listOf("A1", "A2", "B1", "B2", "C1", "C2")
        val indiceNivelActual = ordenNiveles.indexOf(nivelActual)
        val indiceNivelSeleccionado = ordenNiveles.indexOf(nivel.nombre)

        // Solo se puede acceder a los niveles menores o iguales al nivel actual
        return indiceNivelSeleccionado <= indiceNivelActual
    }
}



