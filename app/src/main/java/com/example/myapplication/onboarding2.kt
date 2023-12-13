package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val botaopular = findViewById<Button>(R.id.button)

        botaopular.setOnClickListener {
            irparaonboarding3()

        }}
    private fun irparaonboarding3() {
        val intent = Intent (this, home::class.java)
        startActivity(intent)
    }
}





