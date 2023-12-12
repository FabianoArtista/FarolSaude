package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bemvindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)


        val butaoPular = findViewById<Button>(R.id.button)

        butaoPular.setOnClickListener {
            pularParaAcesso()
        }

    }



    private fun pularParaAcesso() {
        val acesso = Intent(this, onboarding2::class.java)
        startActivity(acesso)
    }
    }
