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

        setupIntents()
    }

    private fun setupIntents() {
        binding.canela.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textCanela.text)
            }
            startActivity(intent)
        }
        binding.comino.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textComino.text)
            }
            startActivity(intent)
        }
        binding.albahaca.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textAlbahaca.text)
            }
            startActivity(intent)
        }
        binding.oregano.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textOregano.text)
            }
            startActivity(intent)
        }


        binding.hierbasItaliana.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textHierbasItalianas.text)
            }
            startActivity(intent)
        }

        binding.hierbasProvenzales.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textHierbasProvenzales.text)
            }
            startActivity(intent)
        }

        binding.pimientasMixtas.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textPimientasMixtas.text)
            }
            startActivity(intent)
        }

        binding.nuezMoscada.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textNuezMoscada.text)
            }
            startActivity(intent)
        }

        binding.genjibrePolvo.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textGenjibrePolvo.text)
            }
            startActivity(intent)
        }

        binding.estragon.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textEstragon.text)
            }
            startActivity(intent)
        }

        binding.chipotlePolvo.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textChipotlePolvo.text)
            }
            startActivity(intent)
        }

        binding.eneldo.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textEneldo.text)
            }
            startActivity(intent)
        }

        binding.hojasLaurel.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textHojasLaure.text)
            }
            startActivity(intent)
        }

        binding.salvia.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textSalvia.text)
            }
            startActivity(intent)
        }

        binding.achiote.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textAchiote.text)
            }
            startActivity(intent)
        }

        binding.hojuelasChile.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, binding.textHojuelasChile.text)
            }
            startActivity(intent)
        }


    }
}