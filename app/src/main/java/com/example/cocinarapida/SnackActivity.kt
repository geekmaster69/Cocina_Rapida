package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivitySnackBinding
import java.io.Serializable

class SnackActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivitySnackBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val recipeList = arrayListOf(
            Recipe(
                "Enjambres de Chocolate",
                R.drawable.enjambres_chocolate,
                arrayListOf(
                    Ingredient("250g de chocolate oscuro"),
                    Ingredient("50g de azúcar glass"),
                    Ingredient("100ml de aceite de coco"),
                    Ingredient("50g de cacahuates"),
                    Ingredient("50g de almendras fileteadas"),
                    Ingredient("50g de nueces en trozos"),
                    Ingredient("50g de hojuelas de maíz"),
                    Ingredient("25g de arroz inflado"),
                    Ingredient("capacillos de papel")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_enjambres_chocolate),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            )
        )



        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@SnackActivity)
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