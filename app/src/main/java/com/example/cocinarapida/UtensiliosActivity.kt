package com.example.cocinarapida

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocinarapida.databinding.ActivityUtensiliosBinding

class UtensiliosActivity : AppCompatActivity(), OnClickListenerSpecia {
    private lateinit var binding: ActivityUtensiliosBinding
    private lateinit var utenciliosAdapter: SpeciaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUtensiliosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val utenciliosList = arrayListOf(
            Specia(R.drawable.cebolla_polvo, "Sarten")
        )

        utenciliosAdapter = SpeciaAdapter(utenciliosList, this)
        binding.rvUtencilios.apply {
            layoutManager = GridLayoutManager(this@UtensiliosActivity, 2)
            adapter = utenciliosAdapter
        }
    }

    private fun busquedaWeb(specia: Specia){
        val utencilioWeb = specia.speciaDescription
        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
            putExtra(SearchManager.QUERY, utencilioWeb)
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