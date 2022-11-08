package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivitySalsasMenuBinding
import java.io.Serializable

class SalsasMenuActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivitySalsasMenuBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySalsasMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Guacamole",
                R.drawable.guacamole,
                arrayListOf(
                    Ingredient("2 aguacates"),
                    Ingredient("½ cebolla"),
                    Ingredient("2 jitomates"),
                    Ingredient("½ manojo de cilantro"),
                    Ingredient("chile serrano (Al gusto)"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("sal y pimienta"),
                    Ingredient("1 cucharada de avinagre de manzana"),
                    Ingredient("sal y pimienta"),
                    Ingredient("jugo de limon")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_guacamole),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.cebolla_morada_corte,
                        "Así es como debe verse la cebolla cuando la cortes, después separas capa por capa")
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@SalsasMenuActivity)
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