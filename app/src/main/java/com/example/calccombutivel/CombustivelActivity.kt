package com.example.calccombutivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class CombustivelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combustivel)

        val edtcombustivel = findViewById<TextInputEditText>(R.id.edt_combustivel)

        val btn_combustivel = findViewById<Button>(R.id.btn_combustivel)

        btn_combustivel.setOnClickListener {
            val intent = Intent(this, ConsumoActivity::class.java)
            startActivity(intent)
        }
    }
}