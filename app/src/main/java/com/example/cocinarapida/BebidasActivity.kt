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

            val title = getString(R.string.title_agua_jamaica_natural)

            val image = R.drawable.agua_jamaica_natural

            val ingredientList = arrayOf(
                getString(R.string.flor_jamaica_1tz),
                getString(R.string.agua_12tz),
                getString(R.string.azucar_stevia_al_gusto),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.agua_jamaica_natural_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLimonadaFrutosRojos.setOnClickListener {

            val title = getString(R.string.title_limonada_frutos_rojos)

            val image = R.drawable.agua_jamaica_natural

            val ingredientList = arrayOf(
                getString(R.string.frutos_rojos_congelados_1tz),
                getString(R.string.jugo_limon_1_4tz),
                getString(R.string.jarabe_natural_1cda),
                getString(R.string.agua_agua_mineral_1tz),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.hojas_menta))

            val preparation = getString(R.string.limonada_frutos_rojos_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteFresaTeverdes.setOnClickListener {

            val title = getString(R.string.title_latte_fresa_te_verde)

            val image = R.drawable.latte_fresa_te_verde

            val ingredientList = arrayOf(
                getString(R.string.fresas_congeladas_6pz),
                getString(R.string.azucar_1cda),
                getString(R.string.taza_leche_1),
                getString(R.string.te_verde_polvo_1cda),
                getString(R.string.agua_caliente_1_4tz),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.fresas_frescas),
                getString(R.string.hojas_menta))

            val preparation = getString(R.string.latte_fresa_te_verde_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteCafeBaileys.setOnClickListener {

            val title = getString(R.string.title_latte_cafe_baileys)

            val image = R.drawable.cafe_baileys

            val ingredientList = arrayOf(
                getString(R.string.licor_cafe_30ml),
                getString(R.string.hielo),
                getString(R.string.baileys_30ml),
                getString(R.string.crema_leche_30ml))

            val substitutesList = arrayOf(getString(R.string.consentrado_jugo_limon))

            val optionsList = arrayOf(
                getString(R.string.crema_batida),
                getString(R.string.nuez_moscada_polvo))

            val preparation = getString(R.string.latte_cafe_baileys_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }
    }

    fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: Array<String>,
                                   substitutesList: Array<String>, optionsList: Array<String>,
                                   preparation: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)
        intent.putExtra("ingredientsList", ingredientList )
        intent.putExtra("substitutesList", substitutesList)
        intent.putExtra("optionList", optionsList )
        intent.putExtra("preparation", preparation)
        startActivity(intent)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}