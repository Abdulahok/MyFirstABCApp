package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oactivity)
        val button: Button = findViewById<Button>(R.id.button48)
        button.setOnClickListener {
            val intent: Intent = Intent(this, PActivity::class.java)
            startActivity(intent)
        }
    }
}