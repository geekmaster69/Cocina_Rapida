package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBebidasBinding

class BebidasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBebidasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBebidasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btAguaJamaicaNatural.setOnClickListener {
            openAguaJamaicaNatural()
        }

        binding.btLimonadaFrutosRojos.setOnClickListener {
            openLimonadaFrutosRojos()
        }

        binding.btLatteFresaTeverdes.setOnClickListener {
            openLatteFresaTeVerde()
        }

        binding.btLatteCafeBaileys.setOnClickListener {
            openLatteCafeBaileys()
        }
    }

    private fun openLatteCafeBaileys() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_latte_cafe_baileys))

        intent.putExtra("img_top_recipe", R.drawable.cafe_baileys)

        intent.putExtra("ingredient_1", getString(R.string.licor_cafe_30ml))
        intent.putExtra("ingredient_2", getString(R.string.hielo))
        intent.putExtra("ingredient_3", getString(R.string.baileys_30ml))
        intent.putExtra("ingredient_4", getString(R.string.crema_leche_30ml))

        intent.putExtra("optional_1", getString(R.string.crema_batida))
        intent.putExtra("optional_2", getString(R.string.nuez_moscada_polvo))

        intent.putExtra("preparation1", getString(R.string.latte_cafe_baileys_preparation))

        startActivity(intent)

    }

    private fun openLatteFresaTeVerde() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_latte_fresa_te_verde))

        intent.putExtra("img_top_recipe", R.drawable.latte_fresa_te_verde)

        intent.putExtra("ingredient_1", getString(R.string.fresas_congeladas_6pz))
        intent.putExtra("ingredient_2", getString(R.string.azucar_1cda))
        intent.putExtra("ingredient_3", getString(R.string.taza_leche_1))
        intent.putExtra("ingredient_4", getString(R.string.te_verde_polvo_1cda))
        intent.putExtra("ingredient_5", getString(R.string.agua_caliente_1_4tz))
        intent.putExtra("ingredient_6", getString(R.string.hielo))

        intent.putExtra("optional_1", getString(R.string.fresas_frescas))
        intent.putExtra("optional_2", getString(R.string.hojas_menta))

        intent.putExtra("preparation1", getString(R.string.latte_fresa_te_verde_preparation))

        startActivity(intent)

    }

    private fun openLimonadaFrutosRojos() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_agua_jamaica_natural))

        intent.putExtra("img_top_recipe", R.drawable.agua_jamaica_natural)

        intent.putExtra("ingredient_1", getString(R.string.frutos_rojos_congelados_1tz))
        intent.putExtra("ingredient_2", getString(R.string.jugo_limon_1_4tz))
        intent.putExtra("ingredient_3", getString(R.string.jarabe_natural_1cda))
        intent.putExtra("ingredient_4", getString(R.string.agua_agua_mineral_1tz))
        intent.putExtra("ingredient_5", getString(R.string.hielo))

        intent.putExtra("sustituto_1", getString(R.string.consentrado_jugo_limon))

        intent.putExtra("optional_1", getString(R.string.hojas_menta))

        intent.putExtra("preparation1", getString(R.string.limonada_frutos_rojos_preparation))

        startActivity(intent)

    }

    private fun openAguaJamaicaNatural() {
        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_agua_jamaica_natural))

        intent.putExtra("img_top_recipe", R.drawable.agua_jamaica_natural)

        intent.putExtra("ingredient_1", getString(R.string.flor_jamaica_1tz))
        intent.putExtra("ingredient_2", getString(R.string.agua_12tz))
        intent.putExtra("ingredient_3", getString(R.string.azucar_stevia_al_gusto))
        intent.putExtra("ingredient_4", getString(R.string.hielo))

        intent.putExtra("preparation1", getString(R.string.agua_jamaica_natural_preparation))

        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}