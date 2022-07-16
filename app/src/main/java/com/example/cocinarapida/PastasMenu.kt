package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityPastasMenuBinding

class PastasMenu : AppCompatActivity() {
    private lateinit var binding: ActivityPastasMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastasMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btPastaCamaronBlanco.setOnClickListener {
            openPastaCamaronBlancoActivity()
        }
        binding.btPastaTomateAlbahaca.setOnClickListener {
            openPastaTomateAlbahacaActivity()
        }
        binding.btPastaSalsaPesto.setOnClickListener {
            openspaghettiPestoActivity()
        }
        binding.btSpaghettiCremaAguacate.setOnClickListener {
            openspaghettiCremaAguacateActivity()
        }
        binding.btSpaghettiPimientosCremoso.setOnClickListener {
            openSpaghettiPimientosCremosoActivity()
        }
        binding.btSpaghettiRojoCremoso.setOnClickListener {
            openSpaghettiRojoCremosoActivity()
        }
    }

    private fun openSpaghettiRojoCremosoActivity() {
        startActivity(Intent(this, SpaghettiRojoCremosoActivity::class.java))
    }

    private fun openSpaghettiPimientosCremosoActivity() {
        startActivity(Intent(this, SpaghettiPimientoCremosoActivity::class.java))
    }

    private fun openspaghettiCremaAguacateActivity() {
        startActivity(Intent(this, SpaghettiCremaAguacateActivity::class.java))
    }

    private fun openspaghettiPestoActivity() {
        startActivity(Intent(this, SpaghettiPestoActivity::class.java))
    }

    private fun openPastaTomateAlbahacaActivity() {
        startActivity(Intent(this, SpaguettiTomateAlabahacaActivity::class.java))
    }

    private fun openPastaCamaronBlancoActivity() {
        startActivity(Intent(this, PastaCamaronesSalsaActivity::class.java))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}