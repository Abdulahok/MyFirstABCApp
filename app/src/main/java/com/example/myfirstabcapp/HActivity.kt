package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hactivity)
        val button: Button = findViewById<Button>(R.id.button27)
        button.setOnClickListener {
            val intent: Intent = Intent(this, IActivity::class.java)
            startActivity(intent)
        }
    }
}