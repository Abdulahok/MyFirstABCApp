package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dactivity)
        val button: Button = findViewById<Button>(R.id.button15)
        button.setOnClickListener {
            val intent: Intent = Intent(this, EActivity::class.java)
            startActivity(intent)
        }
    }
}