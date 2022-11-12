package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityPastaFriaBinding
import java.io.Serializable

class PastaFriaActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityPastaFriaBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastaFriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Pasta con Chícharos y Tocino Exprés",
                R.drawable.espagueti_chicharos_tocino_expres,
                arrayListOf(
                    Ingredient("400g de espagueti"),
                    Ingredient("300g de chicharos"),
                    Ingredient("1 cebolla"),
                    Ingredient("200g de tocino"),
                    Ingredient("4 cucharadas de crema"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pasta_chicharos_tocino_expres),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pasta a la Puttanesca",
                R.drawable.pasta_puttanesca,
                arrayListOf(
                    Ingredient("400g de coditos"),
                    Ingredient("250g de jitomates picados en lata o tetra pack"),
                    Ingredient("1 cebolla"),
                    Ingredient("100g de aceitunas negras"),
                    Ingredient("2 cucharadas de alcaparras"),
                    Ingredient("3 cucharadas de aceite"),
                    Ingredient("1 cubo de caldo de pollo"),
                    Ingredient("4 ramas de tomillo"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pasta_puttanesca),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@PastaFriaActivity)
            adapter = recipeAdapter
        }
    }

    override fun recipeOnClickListener(recipe: Recipe) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        val args = Bundle()
        args.putSerializable("Recipe", recipe as Serializable)
        intent.putExtra("Bundle", args)

        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}