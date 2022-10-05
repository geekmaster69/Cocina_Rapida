package com.example.cocinarapida

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocinarapida.databinding.ActivityEspeciasBinding

class EspeciasActivity : AppCompatActivity(), OnClickListenerSpecia {
    private lateinit var binding: ActivityEspeciasBinding
    private lateinit var speciasListAdapter: SpeciaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEspeciasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val speciasList = arrayListOf(
            Specia(R.drawable.canela_polvo_2, "Canela en polvo"),
            Specia(R.drawable.comino, "Comino"),
            Specia(R.drawable.albahaca, "Albahaca"),
            Specia(R.drawable.oregano_2, "Oregano"),
            Specia(R.drawable.hierbas_italiana, "Hierbas italianas"),
            Specia(R.drawable.hierbas_provenzales_2, "Hierbas provenzales"),
            Specia(R.drawable.pimientas_mixtas, "Pimientas mixtas"),
            Specia(R.drawable.nuez_moscada, "Nuez moscada"),
            Specia(R.drawable.jengibre_polvo, "Jengibre en polvo"),
            Specia(R.drawable.estragon_2, "Estragon"),
            Specia(R.drawable.chipotle_polvo, "Chipotle en polvo"),
            Specia(R.drawable.eneldo, "Eneldo"),
            Specia(R.drawable.hojas_laurel, "Hojas de laurel"),
            Specia(R.drawable.salvia, "Salvia"),
            Specia(R.drawable.hojuelas_chile, "Hojuelas de chile"),
            Specia(R.drawable.achiote, "Achiote"),
            Specia(R.drawable.ajo_polvo, "Ajo en polvo"),
            Specia(R.drawable.cebolla_polvo, "Cebolla en polvo"),

        )

        speciasListAdapter = SpeciaAdapter(speciasList, this)

        binding.rvSpecias.apply {
            layoutManager = GridLayoutManager(this@EspeciasActivity, 2)
            adapter = speciasListAdapter
        }

    }

    private fun busquedaWeb(specia: Specia){
        val speciaWeb = specia.speciaDescription
        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
            putExtra(SearchManager.QUERY, speciaWeb)
        }
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onLongClick(specia: Specia) {
             busquedaWeb(specia)    }

}