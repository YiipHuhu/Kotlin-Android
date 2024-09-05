package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val startLobbyButton: Button = findViewById(R.id.startLobbyButton)
        startLobbyButton.setOnClickListener {
            // Inicie a atividade de lobby ao clicar no botão
            startActivity(Intent(this, LobbyActivity::class.java))
        }
    }
}
