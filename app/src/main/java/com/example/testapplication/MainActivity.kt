package com.example.testapplication

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.testapplication.databinding.ActivityMainBinding
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class MainActivity : AppCompatActivity() {
    private val viewBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.framelayout.id, SubActivity())
            .commitAllowingStateLoss()

        viewBinding.bottomNavigationView.run {
            setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.home -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.framelayout.id,HomeFragment())
                            .commitAllowingStateLoss()
                            .
                    }
                    R.id.map -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.framelayout.id,SubActivity())
                            .commitAllowingStateLoss()
                            .
                    }
                }
            }
            selectedItemId=R.id.home
        }

    }
}