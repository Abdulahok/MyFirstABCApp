package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factivity)
        val button: Button = findViewById<Button>(R.id.button21)
        button.setOnClickListener {
            val intent: Intent = Intent(this, GActivity::class.java)
            startActivity(intent)
        }
    }
}