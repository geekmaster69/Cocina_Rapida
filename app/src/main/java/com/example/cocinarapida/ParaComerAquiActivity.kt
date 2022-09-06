package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityParaComerAquiBinding

class ParaComerAquiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParaComerAquiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParaComerAquiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        binding.btSopas.setOnClickListener {
            openaSoupActivity()
        }
        binding.btPastas.setOnClickListener {
            openPastasActivity()
        }
        binding.btDesayunos.setOnClickListener {
            openDesayunosActivity()
        }
        binding.btPostres.setOnClickListener {
            openPopstresActivity()
        }

        binding.btBebidas.setOnClickListener {
            openBebidasActivity()
        }


    }

    private fun openBebidasActivity() {
        startActivity(Intent(this, BebidasActivity::class.java))

    }

    private fun openPopstresActivity() {
        startActivity(Intent(this, Postres::class.java))
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

}