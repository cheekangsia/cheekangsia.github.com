package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class club_a_realtime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club_arealtime)

        val buttonClick = findViewById<Button>(R.id.button_reala)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_a_scoreboard::class.java)
            startActivity(intent)

        }
    }


}