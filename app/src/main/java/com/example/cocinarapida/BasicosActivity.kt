package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityBasicosBinding

class BasicosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBasicosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btUtensilios.setOnClickListener {
            openUtensiliosActivity()
        }
        binding.btEspecias.setOnClickListener {
            openEspeciasActivity()
        }
        binding.tecnicas.setOnClickListener {
            openTecnicasActivity()
        }
    }

    fun openTecnicasActivity() {
        startActivity(Intent(this, TecnicasActivity::class.java))
    }

    private fun openEspeciasActivity() {
        startActivity(Intent(this, EspeciasActivity::class.java))
    }

    private fun openUtensiliosActivity() {
        startActivity(Intent(this, UtensiliosActivity::class.java))
    }
}