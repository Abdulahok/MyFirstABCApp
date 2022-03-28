package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tactivity)
        val button: Button = findViewById<Button>(R.id.button63)
        button.setOnClickListener {
            val intent: Intent = Intent(this, UActivity::class.java)
            startActivity(intent)
        }
    }
}