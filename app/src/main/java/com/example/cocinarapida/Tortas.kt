package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityTortasBinding
import java.io.Serializable
import java.util.ArrayList

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

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.espaldilla_cerdo_pierna_sin_hueso_1kg)),
                Ingredient(getString(R.string.ajo_polvo_1_2cda)),
                Ingredient(getString(R.string.cebolla_polvo_1_2cda)),
                Ingredient(getString(R.string.salsa_bbq_1tz)),
                Ingredient(getString(R.string.cayena_polvo_1_2cda)),
                Ingredient(getString(R.string.paprika_1cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.torta_carne_cerdo_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }
    }
    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                           substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>, preparation: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", ingredientList as Serializable)
        intent.putExtra("BUNDLE", args)

        args.putSerializable("SubstituteList", substituteList as Serializable)
        intent.putExtra("SubstituteListBundle", args)

        args.putSerializable("OptionalList", optionsList as Serializable)
        intent.putExtra("OptionalListBundle", args)

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