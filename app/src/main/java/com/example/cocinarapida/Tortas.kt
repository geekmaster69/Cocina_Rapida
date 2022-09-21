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

            val title = getString(R.string.title_torta_carne_cerdo)

            val image = R.drawable.torta_carne_cerdo

            val ingredientList = arrayOf(
                getString(R.string.espaldilla_cerdo_pierna_sin_hueso_1kg),
                getString(R.string.ajo_polvo_1_2cda),
                getString(R.string.cebolla_polvo_1_2cda),
                getString(R.string.salsa_bbq_1tz),
                getString(R.string.cayena_polvo_1_2cda),
                getString(R.string.paprika_1cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.torta_carne_cerdo_preparation)

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