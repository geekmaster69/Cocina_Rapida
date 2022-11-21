package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityPayBinding
import java.io.Serializable

class PayActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityPayBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Pay de Nata",
                R.drawable.pay_nata,
                arrayListOf(
                    Ingredient("25g de harina"),
                    Ingredient("300ml de leche"),
                    Ingredient("120g de azúcar"),
                    Ingredient("1 raja de canela"),
                    Ingredient("3 yemas de huevo"),
                    Ingredient("250g de masa de hojaldre")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pay_nata),
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
            layoutManager = LinearLayoutManager(this@PayActivity)
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