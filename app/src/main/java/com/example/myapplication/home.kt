package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        class iniciarconversa : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_home)


                val guardiaodavida = findViewById<Button>(R.id.button)

                guardiaodavida.setOnClickListener {
                    botaoinicio()
                }

            }

            private fun botaoinicio() {
                val login1= Intent (this, inicio::class.java)
                startActivity(login1)

                class botaoinicio : AppCompatActivity() {
                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.login1)

                        val inicio = findViewById<Button>(R.id.button)

                        butaoinicio.setOnClickListener {
                            login()

                        }}
                    private fun botaoinicio() {
                        val acesso = Intent (this, login::class.java)
                        startActivity(login)

    }
}