package com.example.cocinarapida
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityBentoBinding
import java.io.Serializable
import java.util.ArrayList

class Bento : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityBentoBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBentoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf<Recipe>(
            Recipe(
                getString(R.string.title_bento_cerdo_agridulce),
                R.drawable.bento_cerdo_agridulce,
                arrayListOf(
                    Ingredient("1kg de filete de cerdo"),
                    Ingredient("2 cucharadas de salsa de soya"),
                    Ingredient("1 cucharada de pimienta"),
                    Ingredient("1 huevo"),
                    Ingredient("harina de trigo"),
                    Ingredient("aceite para freír"),
                    Ingredient("1 cuchara de ajo picado"),
                    Ingredient("1 cucharada de jengibre picado"),
                    Ingredient("1 taza de jugo de naranja natural"),
                    Ingredient("3 cucharadas de azúcar"),
                    Ingredient("2 cucharadas de vinagre blanco"),
                    Ingredient("2 cucharadas de puré de tomate"),
                    Ingredient("4 cucharadas de salsa de soya"),
                    Ingredient("2 cucharadas de agua"),
                    Ingredient("2 cucharadas de maizena")),
                arrayListOf(
                    Ingredient("frasco de ajo picado"),
                    Ingredient("jugo de naranja en tetrapack"),
                    Ingredient("stevia"),
                    Ingredient("ketchup")),
                arrayListOf(
                    Ingredient("cebollín"),
                    Ingredient("semillas de sésamo")),
                getString(R.string.cerdo_agridulce_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")))
        )
        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvBento.apply {
            layoutManager = LinearLayoutManager(this@Bento)
            adapter = recipeAdapter
        }

        }

    override fun recipeOnClickListener(recipe: Recipe) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}