package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityOniguirazuBinding

class OniguirazuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOniguirazuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOniguirazuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btOniguirazuAtun.setOnClickListener {
            openOniguirazuAtun()
        }
    }

    private fun openOniguirazuAtun() {

    }
}