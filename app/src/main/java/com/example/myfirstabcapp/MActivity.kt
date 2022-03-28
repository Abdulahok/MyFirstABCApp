package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mactivity)
        val button: Button = findViewById<Button>(R.id.button42)
        button.setOnClickListener {
            val intent: Intent = Intent(this, NActivity::class.java)
            startActivity(intent)
        }
    }
}