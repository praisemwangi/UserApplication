package com.example.userapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextTextEmailAddress2 = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val editTextTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val btn5 = findViewById<Button>(R.id.button5)

        btn5.setOnClickListener {
            val name = editTextText.text.toString()
            val email = editTextTextEmailAddress2.text.toString()
            val password = editTextTextPassword.text.toString()
            val phoneNumber = editTextPhone.text.toString()

            when {
                name.isEmpty() -> editTextText.error = "Name is required"
                email.isEmpty() -> editTextTextEmailAddress2.error = "Email is required"
                password.isEmpty() -> editTextTextPassword.error = "Password is required"

            }
        }

    }
}