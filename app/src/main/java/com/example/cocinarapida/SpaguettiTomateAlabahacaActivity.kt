package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivitySpaguettiTomateAlabahacaBinding

class SpaguettiTomateAlabahacaActivity : AppCompatActivity() {
     lateinit var binding: ActivitySpaguettiTomateAlabahacaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpaguettiTomateAlabahacaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cocerPasta.setOnClickListener {


        }
    }



}