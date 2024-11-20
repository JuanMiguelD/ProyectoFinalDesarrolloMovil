package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SingUp : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnSignUp: MaterialButton
    private lateinit var btnLogIn: MaterialButton
    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDbref: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        supportActionBar?.hide()

        mAuth = FirebaseAuth.getInstance()

        editName = findViewById(R.id.nombre)
        editEmail = findViewById(R.id.editCorreo)
        editPassword = findViewById(R.id.editContrasena)
        btnSignUp = findViewById(R.id.sing)
        btnLogIn = findViewById(R.id.login)

        btnSignUp.setOnClickListener{
            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val password = editPassword.text.toString()

            if(name.isNotEmpty() and email.isNotEmpty() and password.isNotEmpty()){
                singUp(name,email,password)
            }


        }
        btnLogIn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent)

        }

    }

    private fun singUp(name:String,email:String,password:String){
        mAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                    task -> if(task.isSuccessful){
                println(email)
                println(password)
                addUserToDatabase(name,email,mAuth.currentUser?.uid!!)

                val intent = Intent(this@SingUp, Prueba_Clasificacion::class.java)
                finish()
                startActivity(intent)
            } else {
                // Mensaje emergente. como el Alert
                Toast.makeText(this@SingUp, "Ha ocurrido un error", Toast.LENGTH_SHORT, ).show()
            }
            }
    }

    private fun addUserToDatabase(name: String, email: String, uid: String) {
        // Crear la referencia a la base de datos
        mDbref = FirebaseDatabase.getInstance().getReference("Usuarios")

        // Crea un mapa de progreso con todos los niveles y módulos usando ContenidoSingleton
        val progreso = ContenidoSingleton.niveles.associate { nivel ->
            nivel.nombre to mapOf(
                "Disponible" to (nivel.nombre == "A1"), // Solo el primer nivel se desbloquea inicialmente
                "ModuloActual" to  1,
                "Modulos" to nivel.modulos.associate { modulo ->
                    modulo.nombre to mapOf(
                        "Temas" to modulo.temas.associate { tema ->
                            tema.nombre to false // Todos los temas inicializados como no completados
                        }
                    )
                }
            )
        }

        // Crea el mapa del usuario completo
        val user = mapOf(
            "name" to name,
            "email" to email,
            "uid" to uid,
            "NivelActual" to "A1",
            "Progreso" to progreso
        )

        // Guarda los datos del usuario en la base de datos
        mDbref.child(uid).setValue(user).addOnSuccessListener {
            Log.d("RealtimeDB", "Usuario agregado con éxito")
        }.addOnFailureListener { e ->
            Log.e("RealtimeDB", "Error al agregar usuario: ", e)
        }
    }

}