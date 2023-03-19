package com.example.testapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SubActivity1: AppCompatActivity() {
    override fun onCreate(savedInstantState: Bundle?) {
        super.onCreate(savedInstantState)
        setContentView(R.layout.activity2)


    }
}