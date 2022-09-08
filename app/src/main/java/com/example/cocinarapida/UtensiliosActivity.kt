package com.example.cocinarapida

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityUtensiliosBinding

class UtensiliosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUtensiliosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUtensiliosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.sarten.setOnClickListener {
            busquedaWeb("Sarten")
        }

        binding.wok.setOnClickListener {
            busquedaWeb("Wok")
        }

        binding.cucharonSopa.setOnClickListener {
            busquedaWeb("Cucharon de Sopa")
        }

        binding.cucharaPasta.setOnClickListener {
            busquedaWeb("Cuchara de Pasta")
        }

        binding.espatula.setOnClickListener {
            busquedaWeb("Espátula")
        }

        binding.pinzas.setOnClickListener {
            busquedaWeb("Pinzas para Cocina")
        }
    }

    private fun busquedaWeb(especia: String){
        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
            putExtra(SearchManager.QUERY, especia)
        }
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}