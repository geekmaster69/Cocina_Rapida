package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityParallevarBinding

class Parallevar : AppCompatActivity() {
    private lateinit var binding: ActivityParallevarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParallevarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btBento.setOnClickListener {
            startActivity(Intent(this, Bento::class.java))
        }

        binding.btTortas.setOnClickListener {
            startActivity(Intent(this, Tortas::class.java))
        }
        binding.btOniguiri.setOnClickListener {
            startActivity(Intent(this, OniguiriActivity::class.java))
        }
        binding.btEnsaladas.setOnClickListener {
            startActivity(Intent(this, EnsaladasActivity::class.java))
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}