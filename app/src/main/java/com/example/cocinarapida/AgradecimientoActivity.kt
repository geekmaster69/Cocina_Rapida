package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityAgradecimientoBinding

class AgradecimientoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgradecimientoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgradecimientoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}