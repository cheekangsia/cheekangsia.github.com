package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Clubahomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubahomepage)

        val buttonClick = findViewById<Button>(R.id.button_sessiona)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_a_session::class.java)
            startActivity(intent)

        }

        val buttonClick1 = findViewById<Button>(R.id.button_membera)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, clubamember::class.java)
            startActivity(intent)

        }

        val buttonClick2 = findViewById<Button>(R.id.button_scoreboarda)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, club_a_realtime::class.java)
            startActivity(intent)

        }

        val buttonClick3 = findViewById<Button>(R.id.button_leaderboarda)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, clubaleaderboard::class.java)
            startActivity(intent)

        }
    }
}