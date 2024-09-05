package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        val ageInput = findViewById<EditText>(R.id.ageInput)
        val checkAgeButton = findViewById<Button>(R.id.checkAgeButton)
        val ageResult = findViewById<TextView>(R.id.ageResult)

        checkAgeButton.setOnClickListener {
            val ageText = ageInput.text.toString()

            if (ageText.isNotEmpty()) {
                val age = ageText.toInt()

                val resultText = when {
                    age < 18 -> "Você é menor de idade."
                    age in 18..60 -> "Você é maior de idade."
                    else -> "Você é idoso."
                }

                ageResult.text = resultText
            } else {
                ageResult.text = "Por favor, insira uma idade válida."
            }
        }
    }
}
