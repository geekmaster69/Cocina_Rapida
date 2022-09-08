package com.example.cocinarapida

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityEspeciasBinding

class EspeciasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEspeciasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEspeciasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.canela.setOnClickListener {
            busquedaWeb("Canela")
        }

        binding.comino.setOnClickListener {
            busquedaWeb("Comino")
        }

        binding.albahaca.setOnClickListener {
            busquedaWeb("Albahaca")
        }

        binding.oregano.setOnClickListener {
            busquedaWeb("Oregano")
        }

        binding.hierbasItaliana.setOnClickListener {
            busquedaWeb("Hierbas a la Italiana")
        }

        binding.hierbasProvenzales.setOnClickListener {
            busquedaWeb("Hierbas Porvenzales")
        }

        binding.pimientasMixtas.setOnClickListener {
            busquedaWeb("Pimientas Mixtas")
        }

        binding.nuezMoscada.setOnClickListener {
            busquedaWeb("Nuez Moscada")
        }

        binding.genjibrePolvo.setOnClickListener {
            busquedaWeb("Jengibre en Polvo")
        }

        binding.estragon.setOnClickListener {
            busquedaWeb("Estragón")
        }

        binding.chipotlePolvo.setOnClickListener {
            busquedaWeb("Chipotle en Polvo")
        }

        binding.eneldo.setOnClickListener {
            busquedaWeb("Eneldo")
        }

        binding.hojasLaurel.setOnClickListener {
            busquedaWeb("Hojas de Laurel")
        }

        binding.salvia.setOnClickListener {
            busquedaWeb("Salvia")
        }

        binding.achiote.setOnClickListener {
            busquedaWeb("Achiote")
        }

        binding.hojuelasChile.setOnClickListener {
            busquedaWeb("Hojuelas de Chile")
        }

    }

    fun busquedaWeb(especia: String){
        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
            putExtra(SearchManager.QUERY, especia)
        }
        startActivity(intent)
    }

}