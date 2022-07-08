package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityCtipoBinding

class ParaComerAquiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCtipoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCtipoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSopas.setOnClickListener {
            openaSoupActivity()
        }
        binding.btPastas.setOnClickListener {
            openPastasActivity()
        }
        binding.btDesayunos.setOnClickListener {
            openDesayunosActivity()
        }


    }

    private fun openDesayunosActivity() {
        startActivity(Intent(this, DesayunosActivity::class.java))
    }

    private fun openPastasActivity() {

        startActivity(Intent(this,PastasMenu::class.java))
    }

    private fun openaSoupActivity() {
        startActivity(Intent(this, SopasActivity::class.java))
    }
}