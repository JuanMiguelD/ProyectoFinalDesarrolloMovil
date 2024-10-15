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

    private fun login (email:String, password:String){
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){ task ->
            if(task.isSuccessful){
                val intent = Intent(this@MainActivity, InicioActivity::class.java)
                finish()
                startActivity(intent)

            } else{
                Toast.makeText(this@MainActivity, "Error, el usuario no existe.", Toast.LENGTH_SHORT,).show()
            }

        }
    }
}