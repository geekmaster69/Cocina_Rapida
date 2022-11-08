package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityEmpanadasBinding
import java.io.Serializable

class EmpanadasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityEmpanadasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmpanadasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val recipeList = arrayListOf(
            Recipe(
                "Empanadas de Sardina",
                R.drawable.empanadas_sardina,
                arrayListOf(
                    Ingredient("2 latas de sardinas en aceite"),
                    Ingredient("masa de mil hojas"),
                    Ingredient("200g de queso crema"),
                    Ingredient("10 aceitunas sin hueso"),
                    Ingredient("3 cucharadas de aceite"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_empanada_sardina),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"
                    )
                )
            ),
            Recipe(
                "Empanadas de Camarón",
                R.drawable.empanadas_camaron,
                arrayListOf(
                    Ingredient("400g de camarones cocidos"),
                    Ingredient("1 clara de huevo"),
                    Ingredient("un manojo de cebollas cambrai (Solo el tallo)"),
                    Ingredient("1 cucharada de jengibre"),
                    Ingredient("fecula de maíz"),
                    Ingredient("masa de mil hojas"),
                    Ingredient("aceite para freír"),
                    Ingredient("2 cucharadas de vino blanco")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_empanada_camaron),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"
                    )
                )
            ),
        )



        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@EmpanadasActivity)
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

        val args = Bundle()
        args.putSerializable("Recipe", recipe as Serializable)
        intent.putExtra("Bundle", args)

        startActivity(intent)
    }
}