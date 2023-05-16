package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.framelayout.id, HomeFragment())
            .commitAllowingStateLoss()

        viewBinding.bottomNavigationView.run {
            setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.home -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.framelayout.id,HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.map -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.framelayout.id,MapFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId=R.id.home
        }

    }
}