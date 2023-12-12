package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val acessarminhaconta = findViewById<Button>(R.id.button)

       acessarminhaconta.setOnClickListener {
            pularParaAcesso()
        }
    }

    private fun pularParaAcesso() {
        TODO("Not yet implemented")
    }

    private fun acessarminhaconta() {
        val intent = Intent (this, pularParaAcesso()::class.java)
        startActivity(intent)
    }
}