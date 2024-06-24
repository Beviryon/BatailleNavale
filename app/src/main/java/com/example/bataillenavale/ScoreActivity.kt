package com.example.bataillenavale

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bataillenavale.R


class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreTextView: TextView = findViewById(R.id.score_text)
        // Retrieve the score from the intent and display it
        val score = intent.getIntExtra("SCORE", 0)
        scoreTextView.text = "Score: $score"
    }
}
