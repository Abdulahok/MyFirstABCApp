package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gactivity)
        val button: Button = findViewById<Button>(R.id.button24)
        button.setOnClickListener {
            val intent: Intent = Intent(this, HActivity::class.java)
            startActivity(intent)
        }
    }
}