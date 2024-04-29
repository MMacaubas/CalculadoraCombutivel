package com.example.calccombutivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class ConsumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo)

        val edt_consumo = findViewById<TextInputEditText>(R.id.edt_km)

        val btn_consumo = findViewById<Button>(R.id.btn_consumo)

        btn_consumo.setOnClickListener {
            val intent= Intent (this, DistanciaActivity:: class.java)
            startActivity(intent)

        }
    }
}