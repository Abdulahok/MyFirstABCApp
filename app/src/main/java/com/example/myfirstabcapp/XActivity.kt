package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class XActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xactivity)
        val button: Button = findViewById<Button>(R.id.button75)
        button.setOnClickListener {
            val intent: Intent = Intent(this, YActivity::class.java)
            startActivity(intent)
        }
    }
}