package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<Button>(R.id.button_login)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)

        }

        val buttonClick1 = findViewById<Button>(R.id.sign_up)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, SinUp::class.java)
            startActivity(intent)

        }
    }
}