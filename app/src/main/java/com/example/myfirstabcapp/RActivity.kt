package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ractivity)
        val button: Button = findViewById<Button>(R.id.button57)
        button.setOnClickListener {
            val intent: Intent = Intent(this, SActivity::class.java)
            startActivity(intent)
        }
    }
}