package com.example.bataillenavale

import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.bataillenavale.R


class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val gridView: GridView = findViewById(R.id.gridview)

        val checkButton: Button = findViewById(R.id.check_button)
        checkButton.setOnClickListener {
        }
    }
}
