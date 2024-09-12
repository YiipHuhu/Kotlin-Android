package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        val celcius = findViewById<EditText>(R.id.celcius)
        val btnCompare = findViewById<Button>(R.id.btnCompare)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCompare.setOnClickListener {
            val celcius = celcius.text.toString()

            if (celcius.isNotEmpty()) {

                    val fahrenheit = (celcius.toDouble() * 1.8) + 32
                    txtResult.text = "A temperatura em Fahrenheit é: ${fahrenheit}ºF"
                }
                else{
                    txtResult.text = "Por gentileza, preencha informe a temperatura"
                }
        }
    }
}
