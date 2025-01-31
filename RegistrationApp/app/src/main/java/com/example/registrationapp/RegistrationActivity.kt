package com.example.registrationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)

        val editTextFirstName : EditText = findViewById(R.id.etFirstName)
        val registerButton : Button = findViewById(R.id.btnRegister)

        registerButton.setOnClickListener {
            val firstName = editTextFirstName.text.toString().trim()

            if (firstName.isNotEmpty()) {
                val intent = Intent(this, ThankYouActivity::class.java)
                intent.putExtra("FIRST_NAME", firstName)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter your first name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
