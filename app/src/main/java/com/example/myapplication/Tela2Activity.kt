package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val numInput = findViewById<EditText>(R.id.password1)
        val numInput2 = findViewById<EditText>(R.id.password2)
        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        val btnAddiction = findViewById<Button>(R.id.btnCompare)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnAddiction.setOnClickListener {
            val num1 = numInput.text.toString()
            val num2 = numInput2.text.toString()

            if (num1.isNotEmpty() && num2.isNotEmpty()) {
                val result = num1.toDouble() + num2.toDouble()
                txtResult.text = "Resultado: $result"
            } else {
                txtResult.text = "Por favor, insira os dois números."
            }
        }
        btnSubtraction.setOnClickListener {
            val num1 = numInput.text.toString()
            val num2 = numInput2.text.toString()

            if (num1.isNotEmpty() && num2.isNotEmpty()) {
                val result = num1.toDouble() - num2.toDouble()
                txtResult.text = "Resultado: $result"
            } else {
                txtResult.text = "Por favor, insira os dois números."
            }
        }
    }
}
