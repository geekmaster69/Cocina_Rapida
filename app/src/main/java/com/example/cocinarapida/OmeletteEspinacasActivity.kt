package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityOmeletteEspinacasBinding

class OmeletteEspinacasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOmeletteEspinacasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOmeletteEspinacasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btTecnicas.setOnClickListener {
            openTecnicasActivity()
        }
    }

    private fun openTecnicasActivity() {
        startActivity(Intent(this, BasicosActivity::class.java))
    }
}