package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityIrComiendoBinding

class IrComiendo : AppCompatActivity() {
    private lateinit var binding: ActivityIrComiendoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrComiendoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btTortas.setOnClickListener {
            startActivity(Intent(this, Tortas::class.java))
        }

        binding.btWraps.setOnClickListener {
            startActivity(Intent(this, WrapsActivity::class.java))
        }

        binding.btHamburguesas.setOnClickListener {
            startActivity(Intent(this, HamburguesasActivity::class.java))
        }
        binding.btPay.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}