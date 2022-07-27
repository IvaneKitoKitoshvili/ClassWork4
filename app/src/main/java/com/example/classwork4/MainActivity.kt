package com.example.classwork4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classwork4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var XoAdapter: XoAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onRestart() {
        super.onRestart()
    }
}