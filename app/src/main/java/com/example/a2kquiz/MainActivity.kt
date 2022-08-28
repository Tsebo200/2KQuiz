package com.example.a2kquiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a2kquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding = ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//This sets what xml frontend to use
    }
}