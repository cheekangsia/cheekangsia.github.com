package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class clubchomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubchomepage)

        val buttonClick = findViewById<Button>(R.id.button_sessionc)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_c_session::class.java)
            startActivity(intent)

        }

        val buttonClick1 = findViewById<Button>(R.id.button_memberc)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, clubcmember::class.java)
            startActivity(intent)

        }

        val buttonClick2 = findViewById<Button>(R.id.button_scoreboardc)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, club_c_realtime::class.java)
            startActivity(intent)

        }

        val buttonClick3 = findViewById<Button>(R.id.button_leaderboardc)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, clubcleaderboard::class.java)
            startActivity(intent)

        }

    }
}