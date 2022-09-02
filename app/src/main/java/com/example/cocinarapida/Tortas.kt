package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityTortasBinding

class Tortas : AppCompatActivity() {
    private lateinit var binding: ActivityTortasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTortasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btTortaCarneCerdo.setOnClickListener {
            openTortaCerdo()

        }
    }

    private fun openTortaCerdo() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_torta_carne_cerdo))

        intent.putExtra("img_top_recipe", R.drawable.torta_carne_cerdo)

        intent.putExtra("ingredient_1", getString(R.string.espaldilla_cerdo_pierna_sin_hueso_1kg))
        intent.putExtra("ingredient_2", getString(R.string.ajo_polvo_1_2cda))
        intent.putExtra("ingredient_3", getString(R.string.cebolla_polvo_1_2cda))
        intent.putExtra("ingredient_4", getString(R.string.salsa_bbq_1tz))
        intent.putExtra("ingredient_5", getString(R.string.cayena_polvo_1_2cda))
        intent.putExtra("ingredient_6", getString(R.string.paprika_1cda))
        intent.putExtra("ingredient_7", getString(R.string.salchichas_2))

        intent.putExtra("preparation1", getString(R.string.torta_carne_cerdo_preparation))

        startActivity(intent)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}