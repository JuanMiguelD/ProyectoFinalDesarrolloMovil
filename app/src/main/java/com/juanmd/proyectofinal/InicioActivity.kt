package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log

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
    private var moduloActual: Int = 1 // Agregado para manejar el módulo actual

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Obtener UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid

        // Comprobar si UID es nulo
        if (uid == null) {
            Log.e("InicioActivity", "UID es nulo, el usuario no está autenticado.")
            return
        }

        // Obtener la referencia a la base de datos de Firebase
        mDbref = FirebaseDatabase.getInstance().getReference("Usuarios").child(uid)

        // Recuperar el progreso del usuario de Firebase
        mDbref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // Verificar si el usuario existe
                if (snapshot.exists()) {
                    // Obtener el nivel actual
                    nivelActual = snapshot.child("NivelActual").getValue(String::class.java)

                    // Verificar que el nivelActual no sea nulo antes de acceder a sus datos
                    if (nivelActual != null) {
                        // Obtener el módulo actual para el nivel correspondiente
                        moduloActual = snapshot.child("Progreso").child(nivelActual!!).child("ModuloActual").getValue(Int::class.java) ?: 1

                        // Llamar a la configuración del RecyclerView
                        configurarRecyclerView()
                    } else {
                        Log.e("InicioActivity", "Nivel actual es nulo.")
                    }
                } else {
                    Log.e("InicioActivity", "No se encontró el usuario en la base de datos.")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Manejo de errores
                Log.e("InicioActivity", "Error al recuperar datos: ${error.message}")
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
        adapter = NivelAdapter(niveles, nivelActual, moduloActual) { nivelSeleccionado ->
            if (esNivelDesbloqueado(nivelSeleccionado)) {
                irAModulos(nivelSeleccionado)
            }
        }
        recyclerViewNiveles.adapter = adapter
    }

    private fun irAModulos(nivel: Nivel) {
        // Guardar el nivel seleccionado en el singleton
        Log.d("RealtimeDB", "NivelSeleccionado = $nivel")
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
