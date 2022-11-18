package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityHamburguesasBinding
import java.io.Serializable

class HamburguesasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityHamburguesasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHamburguesasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Hamburguesas Suculentas",
                R.drawable.hamburguesa_suculenta,
                arrayListOf(
                    Ingredient("30g de mantequilla"),
                    Ingredient("2 cebollas"),
                    Ingredient("1 cucharada de azúcar"),
                    Ingredient("1 cucharada de vinagre balsámico"),
                    Ingredient("2 cucharadas de agua"),
                    Ingredient("4 discos de carne para hamburguesa"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("4 bollos para hamburgesas tostados"),
                    Ingredient("salsa barbecue"),
                    Ingredient("4 rebanadas de queso amarillo"),
                    Ingredient("1 jitomate"),
                    Ingredient("1 puñado de arúgula")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_hamburguesa_suculenta),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Hamburguesas Vegetarianas de Berenjena",
                R.drawable.hamburguesa_vegetariana_berenjena,
                arrayListOf(
                    Ingredient("1 berenjena"),
                    Ingredient("2 aguacates"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("8 rebanadas de queso manchego"),
                    Ingredient("arúgula"),
                    Ingredient("aceite de oliva"),
                    Ingredient("pan para hamburgesa brioche"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_hamburguesa_vegetariana_berenjena),
                arrayListOf(
                    Help(
                        getString(R.string.help_desflemar_berenjena_title),
                        R.drawable.help_desflemar_berenjena,
                        getString(R.string.help_desflemar_berenjena)
                    )
                )
            ),
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@HamburguesasActivity)
            adapter = recipeAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun recipeOnClickListener(recipe: Recipe) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        val args = Bundle()
        args.putSerializable("Recipe", recipe as Serializable)
        intent.putExtra("Bundle", args)
        startActivity(intent)

    }
}