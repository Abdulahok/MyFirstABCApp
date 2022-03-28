package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)
        val button: Button = findViewById<Button>(R.id.button9)
        button.setOnClickListener {
            val intent: Intent = Intent(this, CActivity::class.java)
            startActivity(intent)
        }
    }
}