package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityPastaCamaronesSalsaBinding

 class PastaCamaronesSalsaActivity : AppCompatActivity() {
     lateinit var binding: ActivityPastaCamaronesSalsaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastaCamaronesSalsaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cocerPasta.setOnClickListener {
            openTecnicasActivity()
        }
    }
     private fun openTecnicasActivity() {
        startActivity(Intent(this, TecnicasActivity::class.java))
    }
}