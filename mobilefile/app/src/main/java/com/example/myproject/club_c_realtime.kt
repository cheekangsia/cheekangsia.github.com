package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class club_c_realtime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_crealtime)

        val buttonClick = findViewById<Button>(R.id.button_realc)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_c_scoreboard::class.java)
            startActivity(intent)

        }
    }
}