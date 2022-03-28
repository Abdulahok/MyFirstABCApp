package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qactivity)
        val button: Button = findViewById<Button>(R.id.button54)
        button.setOnClickListener {
            val intent: Intent = Intent(this, RActivity::class.java)
            startActivity(intent)
        }
    }
}