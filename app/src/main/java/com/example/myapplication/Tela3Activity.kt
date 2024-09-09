package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val pass1 = findViewById<EditText>(R.id.password1)
        val pass2 = findViewById<EditText>(R.id.password2)
        val btnCompare = findViewById<Button>(R.id.btnCompare)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCompare.setOnClickListener {
            val pass1 = pass1.text.toString()
            val pass2 = pass2.text.toString()

            if (pass1.isNotEmpty() && pass2.isNotEmpty()) {
                if (pass1.equals(pass2)) {
                    txtResult.text = "As senhas coincidem"
                }
                else{
                    txtResult.text = "As senhas são diferentes"
                }
            } else {
                txtResult.text = "Por gentileza, preencha os campos"
            }
        }
    }
}
