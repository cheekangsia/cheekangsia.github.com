package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val buttonClick = findViewById<Button>(R.id.button_cluba)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Clubahomepage::class.java)
            startActivity(intent)

        }

        val buttonClick1 = findViewById<Button>(R.id.button_clubb)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, clubbhomepage::class.java)
            startActivity(intent)

        }

        val buttonClick2 = findViewById<Button>(R.id.button_clubc)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, clubchomepage::class.java)
            startActivity(intent)

        }
    }
}