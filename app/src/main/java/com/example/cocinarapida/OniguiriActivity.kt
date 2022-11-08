package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityOniguiriBinding
import java.io.Serializable

class OniguiriActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityOniguiriBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOniguiriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_oniguiri_salmon),
                R.drawable.onigiri_menu,
                arrayListOf(
                    Ingredient(getString(R.string.arroz_300g)),
                    Ingredient(getString(R.string.agua_400ml)),
                    Ingredient(getString(R.string.hoja_nori)),
                    Ingredient(getString(R.string.salmon_sobre_lata_400g)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.crema_acida_120ml)),
                    Ingredient(getString(R.string.cebollin_10pz)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes)
                    )
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.nori_salmon_preparation),
                arrayListOf(
                    Help(getString(R.string.help_oniguiri_title),
                        R.drawable.ic_help_null,
                        getString(R.string.help_oniguiri))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@OniguiriActivity)
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