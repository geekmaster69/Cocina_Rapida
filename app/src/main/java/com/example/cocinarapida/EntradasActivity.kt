package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityEntradasBinding
import java.io.Serializable
import java.util.ArrayList

class EntradasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityEntradasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_cebollas_rellenas_carne_res),
                R.drawable.cebollas_rellenas,
                arrayListOf(
                    Ingredient("180g de carne molida de res"),
                    Ingredient("½ manojo de cilantro "),
                    Ingredient("30g de pan molido"),
                    Ingredient("2 cebollas moradas"),
                    Ingredient("mezcla de especias para cerne"),
                    Ingredient("aceite"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("carne de cerdo")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.cebollas_rellenas_carne_molida),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.cebolla_morada_corte,
                        "Así es como debe verse la cebolla cuando la cortes, después separas capa por capa")
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@EntradasActivity)
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

        intent.putExtra("title", recipe.title)
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