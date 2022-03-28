package com.example.myfirstabcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aactivity)
        val button: Button = findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            val intent: Intent = Intent(this, BActivity::class.java)
            startActivity(intent)
        }
    }

}