package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val butaoPular = findViewById<Button>(R.id.button)

        butaoPular.setOnClickListener {
            pularParaAcesso()
        }
           }

    private fun pularParaAcesso() {
        val intent = Intent (this, onboarding3::class.java)
        startActivity(intent)
    }
}





