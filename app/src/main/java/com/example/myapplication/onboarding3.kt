package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val botaovamosla = findViewById<Button>(R.id.button)

        botaovamosla.setOnClickListener {
            irparahome()

    }}
        private fun irparahome() {
            val intent = Intent (this, home::class.java)
            startActivity(intent)
    }}