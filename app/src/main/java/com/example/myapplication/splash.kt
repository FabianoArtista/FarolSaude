package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

private fun Handler.postDelayed(function: () -> Unit) {

}

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()


        Handler(Looper.getMainLooper()).postDelayed({
            val irParaBemVindo = Intent(this, bemvindo::class.java)
            startActivity(irParaBemVindo)
            },400)
    }
}