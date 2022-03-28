package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wactivity)
        val button: Button = findViewById<Button>(R.id.button72)
        button.setOnClickListener {
            val intent: Intent = Intent(this, XActivity::class.java)
            startActivity(intent)
        }
    }
}