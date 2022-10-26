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
            ),
            Recipe(
                "Res encebollada",
                R.drawable.res_encebollada,
                arrayListOf(
                    Ingredient("4 cebollas"),
                    Ingredient("3 dientes de ajo"),
                    Ingredient("3 cucharadas de aceite"),
                    Ingredient("500g de filete de res"),
                    Ingredient("1 cucharada de fécula de maíz"),
                    Ingredient("1 cucharadita de azúcar"),
                    Ingredient("4 cucharadas de soya"),
                    Ingredient("100ml de agua"),
                    Ingredient("2 ramas de perejil")
                ),
                arrayListOf(
                    Ingredient("milanesa de res (Sustitulle fielete)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_res_encebollada),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.help_cebolla_rodajas,
                        "Así es como debe verse la cebolla cuando la cortes")
                )
            ),
            Recipe(
                "Albóndigas con Ensalada de Jitomate",
                R.drawable.albondigas_enslada_jitomate,
                arrayListOf(
                    Ingredient("1 cebolla morada"),
                    Ingredient("30 hojas de menta"),
                    Ingredient("600g de carme molida de res"),
                    Ingredient("4 cucharadas de aceite"),
                    Ingredient("20 jitomates cherry"),
                    Ingredient("vinagre balsámico")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_albondigas_ensalada),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.help_cebolla_rodajas,
                        "Así es como debe verse la cebolla cuando la cortes")
                )
            ),
            Recipe(
                "fajitas de Res",
                R.drawable.fajitas_res,
                arrayListOf(
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("1 cucharada de especias para carne"),
                    Ingredient("200g de filete de res"),
                    Ingredient("tortillas de harina"),
                    Ingredient("160g de guacamole (En salsas)"),
                    Ingredient("120g de elote cocido en lata"),
                    Ingredient("sal al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_fajitas_res),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_suggestions))
                )
            ),
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