package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class MainActivity :  AppCompatActivity() {
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSingUp: Button
    private lateinit var mAuth: FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        mAuth = FirebaseAuth.getInstance()


        //Busca de objetos

        editEmail = findViewById(R.id.editCorreo)
        editPassword = findViewById(R.id.editContrasena)
        btnSingUp = findViewById(R.id.sing)
        btnLogin = findViewById(R.id.login)

        btnSingUp.setOnClickListener(){
            val intent = Intent(this,SingUp::class.java)
            finish()
            startActivity(intent)
        }

        btnLogin.setOnClickListener(){
            val email = editEmail.text.toString()
            val password = editPassword.text.toString()
            if (email.isNotEmpty() and password.isNotEmpty()){
                login(email,password)
            }

        }

    }

    private fun login(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val currentUser = mAuth.currentUser
                    if (currentUser != null && currentUser.isEmailVerified) {

                        val userId = currentUser.uid

                        val databaseRef = FirebaseDatabase.getInstance().getReference("Usuarios").child(userId).child("Prueba")
                        databaseRef.get().addOnSuccessListener { snapshot ->
                            val value = snapshot.getValue(Boolean::class.java) // Cambia el tipo si no es String
                            if (value!!) {
                                val intent = Intent(this@MainActivity, InicioActivity::class.java)
                                finish()
                                startActivity(intent)
                            } else {
                                val intent = Intent(this@MainActivity, Prueba_Clasificacion::class.java)
                                finish()
                                startActivity(intent)
                            }
                        }



                    } else {
                        // Usuario autenticado pero correo no verificado
                        Toast.makeText(
                            this@MainActivity,
                            "Por favor verifica tu correo antes de ingresar.",
                            Toast.LENGTH_LONG
                        ).show()
                        mAuth.signOut() // Cerrar sesión si el correo no está verificado
                    }
                } else {
                    // Error en la autenticación
                    Toast.makeText(
                        this@MainActivity,
                        "Error, el usuario no existe o la contraseña es incorrecta.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

}