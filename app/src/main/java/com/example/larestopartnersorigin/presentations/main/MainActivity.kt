package com.example.larestopartnersorigin.presentations.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.larestopartnersorigin.BaseActivity
import com.example.larestopartnersorigin.R
import com.example.larestopartnersorigin.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}