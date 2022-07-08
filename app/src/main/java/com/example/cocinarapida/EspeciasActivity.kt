package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityEspeciasBinding

class EspeciasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEspeciasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEspeciasBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}