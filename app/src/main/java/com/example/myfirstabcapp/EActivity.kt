package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eactivity)
        val button: Button = findViewById<Button>(R.id.button18)
        button.setOnClickListener {
            val intent: Intent = Intent(this, FActivity::class.java)
            startActivity(intent)
        }
    }
}