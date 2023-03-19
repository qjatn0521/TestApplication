package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, SubActivity1::class.java)
        val changeButton = findViewById<Button>(R.id.changeButton)
        changeButton.setOnClickListener {
            startActivity(intent)
        }


    }
}