package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nactivity)
        val button: Button = findViewById<Button>(R.id.button45)
        button.setOnClickListener {
            val intent: Intent = Intent(this, OActivity::class.java)
            startActivity(intent)
        }
    }
}