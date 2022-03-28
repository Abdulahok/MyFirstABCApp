package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sactivity)
        val button: Button = findViewById<Button>(R.id.button60)
        button.setOnClickListener {
            val intent: Intent = Intent(this, TActivity::class.java)
            startActivity(intent)
        }
    }
}