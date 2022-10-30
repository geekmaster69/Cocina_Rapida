package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityEnsaladasBinding
import java.io.Serializable

class EnsaladasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityEnsaladasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnsaladasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_ensalada_col_mostaza_miel),
                R.drawable.ensalada_col_mostaza,
                arrayListOf(
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.mostaza_miel_1cda)),
                    Ingredient(getString(R.string.aceite_girasol_250ml)),
                    Ingredient(getString(R.string.coco_rayado_60g)),
                    Ingredient(getString(R.string.agua_fria)),
                    Ingredient(getString(R.string.col_morada_ch_1_2)),
                    Ingredient(getString(R.string.col_blanca_ch_1_2)),
                    Ingredient(getString(R.string.zanahorias_5)),
                    Ingredient(getString(R.string.sal_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_col_mostaza_miel),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_ensalada_verde_burrata),
                R.drawable.ensalada_burrata,
                arrayListOf(
                    Ingredient("sopa de municion 220g"),
                    Ingredient("vinagre balsámico"),
                    Ingredient(getString(R.string.medio_manojo_menta)),
                    Ingredient("100g de espinaca"),
                    Ingredient("250g de chicharos cocidos"),
                    Ingredient("1 pieza de burrata"),
                ),
                arrayListOf(
                    Ingredient("chicharos en lata"),
                    Ingredient("chicharos congelados"),
                    Ingredient("espinaca baby en bolsa"),
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_verde_burrata),
                arrayListOf(
                    Help("Concer Pasta", R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Ensalada de Salmón con Cítricos",
                R.drawable.ensalada_burrata,
                arrayListOf(
                    Ingredient("4 rebanadas de salmón ahumado"),
                    Ingredient("1 limon amarillo"),
                    Ingredient("6 mandarinas"),
                    Ingredient("2 aguacates"),
                    Ingredient("1 manojo de cebolla cambray (Solo los tallos)"),
                    Ingredient("½ granada (Solo los dientes)"),
                    Ingredient("100g de mezcla de lechugas"),
                    Ingredient("2 cucharadas de miel"),
                    Ingredient("sal y pimienta"),
                ),
                arrayListOf(
                    Ingredient("salmón en agua (sobre o lata)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_salmon_citricos),
                arrayListOf(
                    Help(
                        "Concer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation)
                    )
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@EnsaladasActivity)
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