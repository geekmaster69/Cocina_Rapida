package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityParaDosBinding
import java.io.Serializable
class ParaDosActivity : AppCompatActivity(), ReceipeClickListener{
    private lateinit var binding: ActivityParaDosBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParaDosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Lomo de Cerdo y Papas con Pesto",
                R.drawable.omelette_jamon_queso,
                arrayListOf(
                    Ingredient(getString(R.string.perejil_1_2_manojo)),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("dos cucharadas de piñones"),
                    Ingredient("1Kg de papas"),
                    Ingredient("4 dientes de ajo machacados"),
                    Ingredient("1Kg de lomo de cerdo")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_lomo_papas_pesto),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Carne de Res a la Cerveza",
                R.drawable.lomo_papas_pesto,
                arrayListOf(
                    Ingredient("20g de mantequilla"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("1 cebolla grande"),
                    Ingredient("1.2Kg de carne de res para estofado"),
                    Ingredient("4 cucharadas de harina"),
                    Ingredient("500ml de cerveza clara"),
                    Ingredient("1 manojo de hiervas de olor"),
                    Ingredient("4 cucharadas de mostaza antigua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_carne_res_cerveza),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@ParaDosActivity)
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