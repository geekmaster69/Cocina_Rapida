package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivitySopasBinding

class SopasActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySopasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySopasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSopaFideos.setOnClickListener {
            openSopaFideosActivity()
        }

        binding.btCaldoPollo.setOnClickListener {
            openCaldoPolloActivity()
        }

        binding.btSopaVerdolagas.setOnClickListener {
            openSopaVerdolagasActivity()
        }

        binding.btSopaCol.setOnClickListener {
            openSopaColActivity()
        }
        binding.btCremaChampiOnes.setOnClickListener {
            openCremaChampinonesActivity()
        }
        binding.btCremaHabas.setOnClickListener {
            openCremaHabasActivity()
        }
        binding.btSopaPoro.setOnClickListener {
            openSopaPoroActivity()
        }
        binding.btCremaEspinacas.setOnClickListener {
            openCremaEspinacasActivity()
        }
        binding.btCremaVerduras.setOnClickListener {
            openCremaVerdurasActivity()
        }
        binding.btCaldoTalpeno.setOnClickListener {
            openCladoTlalpenoActivity()
        }




    }

    private fun openCladoTlalpenoActivity() {
        startActivity(Intent(this, CaldoTlalpenoActivity::class.java))
    }

    private fun openCremaVerdurasActivity() {
        startActivity(Intent(this, CremaVerdurasActivity::class.java))
    }

    private fun openCremaEspinacasActivity() {
        startActivity(Intent(this, CremaEspinacasActivity::class.java))
    }

    private fun openSopaPoroActivity() {
        startActivity(Intent(this, SopaPoroActivity::class.java))
    }

    private fun openCremaHabasActivity() {
        startActivity(Intent(this, CremaHabasActivity::class.java))
    }

    private fun openCremaChampinonesActivity() {
        startActivity(Intent(this, CremaChampinonesActivity::class.java))
    }

    private fun openSopaColActivity() {
        startActivity(Intent(this, SopaColActivity::class.java))
    }

    private fun openSopaVerdolagasActivity() {
        startActivity(Intent(this, SopaVerdolagasActivity::class.java))
    }

    private fun openCaldoPolloActivity() {
        startActivity(Intent(this, CaldoPolloActivity::class.java))
    }


    private fun openSopaFideosActivity() {
        startActivity(Intent(this, SopaFideosActivity2::class.java))
    }
}