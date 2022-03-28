package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iactivity)
        val button: Button = findViewById<Button>(R.id.button30)
        button.setOnClickListener {
            val intent: Intent = Intent(this, JActivity::class.java)
            startActivity(intent)
        }
    }
}