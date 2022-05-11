package com.example.myapplication_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class calculateBMIActivity : AppCompatActivity() {
    lateinit var btnSend: Button
    lateinit var btnCancel: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmiactivity)
        btnSend = findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent = Intent(this, SendActivity2::class.java)
            startActivity(intent)
        }
        btnCancel = findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent = Intent(this, SendActivity2::class.java)
            startActivity(intent)
        }
    }
}