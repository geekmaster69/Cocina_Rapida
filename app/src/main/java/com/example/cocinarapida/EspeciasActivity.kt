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

        val speciasList = arrayListOf<Specia>(
            Specia(R.drawable.canela_polvo_2, "Acciote"),
            Specia(R.drawable.canela_polvo_2, "Albahaca"),
            Specia(R.drawable.canela_polvo_2, "Acciote"),
            Specia(R.drawable.canela_polvo_2, "Albahaca"),
            Specia(R.drawable.canela_polvo_2, "Acciote"),
            Specia(R.drawable.canela_polvo_2, "Albahaca"),

        )

        speciasListAdapter = SpeciaAdapter(speciasList, this)

        binding.rvSpecias.apply {
            layoutManager = GridLayoutManager(this@EspeciasActivity, 2)
            adapter = speciasListAdapter
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

    override fun onLongClick(specia: Specia) {
        TODO("Not yet implemented")
    }

}