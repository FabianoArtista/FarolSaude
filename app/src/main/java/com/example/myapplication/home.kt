package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val botaoiniciar = findViewById<Button>(R.id.button3)

                botaoiniciar.setOnClickListener {
                    irparalogin1()
                }}

            private fun irparalogin1() {
                val intent = Intent (this, login1::class.java)
                startActivity(intent)
            }

        }



