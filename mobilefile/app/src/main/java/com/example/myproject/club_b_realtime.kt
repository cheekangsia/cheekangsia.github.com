package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class club_b_realtime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_brealtime)

        val buttonClick = findViewById<Button>(R.id.button_realb)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_b_scoreboard::class.java)
            startActivity(intent)

        }
    }
}