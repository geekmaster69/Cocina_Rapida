package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityTortasBinding
import java.io.Serializable

class Tortas : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityTortasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTortasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_torta_carne_cerdo),
                R.drawable.torta_carne_cerdo,
                arrayListOf(
                    Ingredient(getString(R.string.espaldilla_cerdo_pierna_sin_hueso_1kg)),
                    Ingredient(getString(R.string.ajo_polvo_1_2cda)),
                    Ingredient(getString(R.string.cebolla_polvo_1_2cda)),
                    Ingredient(getString(R.string.salsa_bbq_1tz)),
                    Ingredient(getString(R.string.cayena_polvo_1_2cda)),
                    Ingredient(getString(R.string.paprika_1cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.torta_carne_cerdo_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"))
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@Tortas)
            adapter = recipeAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun recipeOnClickListener(recipe: Recipe) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title",  recipe.title)
        intent.putExtra("img_top_recipe", recipe.image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", recipe.ingredients as Serializable)
        intent.putExtra("BUNDLE", args)

        args.putSerializable("SubstituteList", recipe.substitutes as Serializable)
        intent.putExtra("SubstituteListBundle", args)

        args.putSerializable("OptionalList", recipe.optional as Serializable)
        intent.putExtra("OptionalListBundle", args)

        args.putSerializable("HelpList", recipe.help as Serializable)
        intent.putExtra("HelpListBundle", args)

        intent.putExtra("preparation", recipe.process)

        startActivity(intent)

    }
}