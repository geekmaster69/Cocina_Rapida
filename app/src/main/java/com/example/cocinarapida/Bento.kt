package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBentoBinding

class Bento : AppCompatActivity() {
    private lateinit var binding: ActivityBentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btCerdoAgridulce.setOnClickListener {

            openCerdoAgridulce()
        }
    }

    private fun openCerdoAgridulce() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_bento_cerdo_agridulce))

        intent.putExtra("img_top_recipe", R.drawable.bento_cerdo_agridulce)

        intent.putExtra("ingredient_1", getString(R.string.fiele_cerdo_1kg))
        intent.putExtra("ingredient_2", getString(R.string.salsa_soya_2cds))
        intent.putExtra("ingredient_3", getString(R.string.pimienta))
        intent.putExtra("ingredient_4", getString(R.string.huevo_1))
        intent.putExtra("ingredient_5", getString(R.string.harina_trigo))
        intent.putExtra("ingredient_6", getString(R.string.aceite))
        intent.putExtra("ingredient_7", getString(R.string.ajo_1))
        intent.putExtra("ingredient_8", getString(R.string.jengibre_picado_1cda))
        intent.putExtra("ingredient_9", getString(R.string.jugo_naranja_1tz))
        intent.putExtra("ingredient_10", getString(R.string.azucar_3cds))
        intent.putExtra("ingredient_11", getString(R.string.vinagre_blanco_2cds))
        intent.putExtra("ingredient_12", getString(R.string.pure_tomate_2cds))
        intent.putExtra("ingredient_13", getString(R.string.agua_2cds))
        intent.putExtra("ingredient_14", getString(R.string.maizena_2cds))

        intent.putExtra("sustituto_1", getString(R.string.ajos_picados_frasco))
        intent.putExtra("sustituto_2", getString(R.string.jugo_naranja_tetrapack))
        intent.putExtra("sustituto_3", getString(R.string.stevia))
        intent.putExtra("sustituto_4", getString(R.string.ketchup))

        intent.putExtra("optional_1", getString(R.string.cebollin))
        intent.putExtra("optional_2", getString(R.string.semillas_sesamo))

        intent.putExtra("preparation1", getString(R.string.cerdo_agridulce_preparation))

        startActivity(intent)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}