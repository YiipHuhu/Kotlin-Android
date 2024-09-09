package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LobbyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby)

        val options = listOf(
            "Verificador de idade",
            "Calculadora Simples",
            "Verificador de Senha",
            "Conversor de Temperatura (Desafio Extra)") // Adicione as opções que quiser
        val recyclerView: RecyclerView = findViewById(R.id.optionsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = LobbyAdapter(options) { option ->
            when (option) {
                "Verificador de idade" -> startActivity(Intent(this, Tela1Activity::class.java))
                "Calculadora Simples" -> startActivity(Intent(this, Tela2Activity::class.java))
                "Verificador de Senha" -> startActivity(Intent(this, Tela3Activity::class.java))
                //"Conversor de Temperatura (Desafio Extra)" -> startActivity(Intent(this, Tela4Activity::class.java))
                // "Atividade 2" -> startActivity(Intent(this, Tela2Activity::class.java))
            }
        }
        recyclerView.adapter = adapter
    }
}
