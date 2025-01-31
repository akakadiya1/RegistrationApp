package com.example.registrationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThankYouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thank_you)

        val thankYouMessage : TextView = findViewById(R.id.tvThankYouMessage)
        val goToHomepageButton : Button = findViewById(R.id.btnGoToHomepage)

        val firstName = intent.getStringExtra("FIRST_NAME") ?: "User"
        thankYouMessage.text = "Thank You for registration, $firstName."

        goToHomepageButton.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}
