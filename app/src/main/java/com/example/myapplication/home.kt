package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        class iniciarconversa : AppCompatActivity() {
            @SuppressLint("WrongViewCast")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_home)


                val guardiaodavida = findViewById<ImageView>(R.id.botaohome)

                guardiaodavida.setOnClickListener {
                    botaoinicio()
                }

            }

            private fun botaoinicio() {
                val login1= Intent (this, login1::class.java)
                startActivity(login1)


                        val butaoinicio = findViewById<Button>(R.id.button)

                        butaoinicio.setOnClickListener {
                            login()

                        }}
                    private fun login() {
                        val acesso = Intent (this, login1::class.java)
                        startActivity(acesso)

    }
}
            }
        }
