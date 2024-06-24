package com.example.bataillenavale

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val easyButton: Button = findViewById(R.id.easy_button)
        val hardButton: Button = findViewById(R.id.hard_button)

        easyButton.setOnClickListener {
            startGame("easy")
        }

        hardButton.setOnClickListener {
            startGame("hard")
        }
    }

    private fun startGame(difficulty: String) {
        val intent = Intent(this, PlaceShipActivity::class.java)
        intent.putExtra("DIFFICULTY", difficulty)
        startActivity(intent)
    }
}
