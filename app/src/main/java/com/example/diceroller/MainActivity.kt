package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener{rollDice()}
    }
    private fun rollDice(){
        Toast.makeText(this, "ButtonCLicked", Toast.LENGTH_SHORT).show()
    }
}