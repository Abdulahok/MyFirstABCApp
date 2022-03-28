package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pactivity)
        val button: Button = findViewById<Button>(R.id.button51)
        button.setOnClickListener {
            val intent: Intent = Intent(this, QActivity::class.java)
            startActivity(intent)
        }
    }
}