package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vactivity)
        val button: Button = findViewById<Button>(R.id.button69)
        button.setOnClickListener {
            val intent: Intent = Intent(this, WActivity::class.java)
            startActivity(intent)
        }
    }
}