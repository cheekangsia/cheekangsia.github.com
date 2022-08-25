package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class clubbhomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubbhomepage)

        val buttonClick = findViewById<Button>(R.id.button_sessionb)
        buttonClick.setOnClickListener {
            val intent = Intent(this, club_b_session::class.java)
            startActivity(intent)

        }

        val buttonClick1 = findViewById<Button>(R.id.button_memberb)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, clubbmember::class.java)
            startActivity(intent)

        }

        val buttonClick2 = findViewById<Button>(R.id.button_scoreboardb)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, club_b_realtime::class.java)
            startActivity(intent)

        }

        val buttonClick3 = findViewById<Button>(R.id.button_leaderboardb)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, clubbleaderboard::class.java)
            startActivity(intent)

        }

    }
}