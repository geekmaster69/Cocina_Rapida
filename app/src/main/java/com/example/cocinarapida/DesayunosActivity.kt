package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityDesayunosBinding
import com.example.cocinarapida.databinding.ActivityEnfrijoladasBinding

class DesayunosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDesayunosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //hola gente


        binding.btOmeletteJamonQueso.setOnClickListener {
            openOmeletteJamonQuesoActivity()
        }
        binding.btHuevoAmelia.setOnClickListener {
            openHuevosAmeliaActivity()
        }
        binding.btHuevoNorma.setOnClickListener {
            openHuevoNomraActivity()
        }
        binding.btHuevoTortillaJalapeO.setOnClickListener {
            openHuevoTortillaJalapenoActivity()
        }
        binding.btHuevoLugoLopez.setOnClickListener {
            openHuevosLugoLopezActivity()
        }
        binding.btHuevoSalsaJitomate.setOnClickListener {
            openHuevoSalsaJitomateAtivity()
        }
        binding.btChilaquilesRojosVerdes.setOnClickListener {
            openChilaquilesRojosVerdesActivity()
        }
        binding.btEnfrijoladas.setOnClickListener {
            openEnfrijoladasActivity()
        }
        binding.btPanqueAvena.setOnClickListener {
            openPaqueAvenaActivity()
        }
        binding.btAvocadoToas.setOnClickListener {
            openAvocadoToasActrivity()
        }
        binding.btOmurice.setOnClickListener {
            openOmuriceActivity()
        }
        binding.btOmeletteEspinacas.setOnClickListener {
            openOmeletteEspinacasActivity()
        }
        binding.btOmeletteChampinones.setOnClickListener {
            openOmeletteChampinonesActivity()
        }
        binding.btHuevoSalchicha.setOnClickListener {
            openHuevoSalchichaActivity()
        }
    }

    private fun openHuevoSalchichaActivity() {
        startActivity(Intent(this, HuevoSalchichaActivity::class.java))
    }

    private fun openOmeletteChampinonesActivity() {
        startActivity(Intent(this, OmeletteChampinonesActivity::class.java))
    }

    private fun openOmeletteEspinacasActivity() {
        startActivity(Intent(this, OmeletteEspinacasActivity::class.java))
    }

    private fun openOmuriceActivity() {
        startActivity(Intent(this, OmuriceActivity::class.java))
    }

    private fun openAvocadoToasActrivity() {
        startActivity(Intent(this, AvocadoToasActivity::class.java))
    }

    private fun openPaqueAvenaActivity() {
        startActivity(Intent(this, PanqueAvenaActivity::class.java))
    }

    private fun openEnfrijoladasActivity() {
        startActivity(Intent(this, EnfrijoladasActivity::class.java))
    }

    private fun openChilaquilesRojosVerdesActivity() {
        startActivity(Intent(this, ChilaquilesRojosVerdesActivity::class.java))
    }

    private fun openHuevoSalsaJitomateAtivity() {
        startActivity(Intent(this, HuevosSalsaJitomateActivity::class.java))
    }

    private fun openHuevosLugoLopezActivity() {
        startActivity(Intent(this, HuevoLugoLopezActivity::class.java))
    }

    private fun openHuevoTortillaJalapenoActivity() {
        startActivity(Intent(this, HuevoTortillaJalapenosActivity::class.java))
    }

    private fun openHuevoNomraActivity() {
        startActivity(Intent(this, HuevosNormaActivity::class.java))
    }

    private fun openHuevosAmeliaActivity() {
        startActivity(Intent(this, HuevosAmeliaActivity::class.java))
    }

    private fun openOmeletteJamonQuesoActivity() {
        startActivity(Intent(this, OmeletteJamonQuesoActivity::class.java))
    }
}