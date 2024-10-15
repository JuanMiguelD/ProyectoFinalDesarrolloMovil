package com.juanmd.proyectofinal

import android.content.Intent
import android.os.Bundle
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

                val intent = Intent(this@SingUp, InicioActivity::class.java)
                finish()
                startActivity(intent)
            } else {
                // Mensaje emergente. como el Alert
                Toast.makeText(this@SingUp, "Ha ocurrido un error", Toast.LENGTH_SHORT, ).show()
            }
            }
    }

    private fun addUserToDatabase(name:String, email:String, uid:String){
        mDbref = FirebaseDatabase.getInstance().getReference()
        mDbref.child("user").child(uid).setValue(User(name,email,uid))
    }

}