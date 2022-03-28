package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class YActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yactivity)
        val button: Button = findViewById<Button>(R.id.button78)
        button.setOnClickListener {
            val intent: Intent = Intent(this, ZActivity::class.java)
            startActivity(intent)
        }
    }
}