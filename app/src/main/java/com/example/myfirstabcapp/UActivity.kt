package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uactivity)
        val button: Button = findViewById<Button>(R.id.button66)
        button.setOnClickListener {
            val intent: Intent = Intent(this, VActivity::class.java)
            startActivity(intent)
        }
    }
}