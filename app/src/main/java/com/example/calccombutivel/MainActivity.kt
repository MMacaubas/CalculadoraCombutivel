package com.example.calccombutivel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_iniciar = findViewById<Button> (R.id.btn_iniciar)

               btn_iniciar.setOnClickListener {
                   val intent= Intent (this, CombustivelActivity::class.java)
                   startActivity(intent)

        }
    }
}