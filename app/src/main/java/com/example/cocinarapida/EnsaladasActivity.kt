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
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                getString(R.string.title_ensalada_verde_burrata),
                R.drawable.ensalada_burrata,
                arrayListOf(
                    Ingredient("sopa de municion 220g"),
                    Ingredient("vinagre bals??mico"),
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
                        getString(R.string.help_pasta_preparation)
                    )
                )
            ),
            Recipe(
                "Ensalada de Salm??n con C??tricos",
                R.drawable.ensalada_salon_citricos,
                arrayListOf(
                    Ingredient("4 rebanadas de salm??n ahumado"),
                    Ingredient("1 limon amarillo"),
                    Ingredient("6 mandarinas"),
                    Ingredient("2 aguacates"),
                    Ingredient("1 manojo de cebolla cambray (Solo los tallos)"),
                    Ingredient("?? granada (Solo los dientes)"),
                    Ingredient("100g de mezcla de lechugas"),
                    Ingredient("2 cucharadas de miel"),
                    Ingredient("sal y pimienta"),
                ),
                arrayListOf(
                    Ingredient("salm??n en agua (sobre o lata)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_salmon_citricos),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Tabul?? de Quinoa",
                R.drawable.tabule_quinoa,
                arrayListOf(
                    Ingredient("300g de quinoa cocida"),
                    Ingredient("4 jitomates"),
                    Ingredient("1 pepino"),
                    Ingredient("vinagre bals??mico"),
                    Ingredient("4 ramas de perejil"),
                    Ingredient("1 cucharada de aceite de oliva"),
                    Ingredient("2 cucharadas de agua")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_tabule_quinoa),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Ensalada de C??tricos y Aguacate",
                R.drawable.ensalada_citricos_aguacate,
                arrayListOf(
                    Ingredient("2 toronjas"),
                    Ingredient("2 naranjas"),
                    Ingredient("1 aguacate"),
                    Ingredient("1 lim??n amarillo"),
                    Ingredient("2 cebollas cambray"),
                    Ingredient("2 cucharadas de aceite de oliva"),
                    Ingredient("2 ramas de eneldo"),
                    Ingredient("2 ramas de menta"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_citricos_aguacate),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Ensalada de Lentejas",
                R.drawable.ensalada_lentejas,
                arrayListOf(
                    Ingredient("4 huevos"),
                    Ingredient("200g de lentejas"),
                    Ingredient("1 pizca de comino en polvo"),
                    Ingredient("1 betabel"),
                    Ingredient("6 ramas de estrag??n"),
                    Ingredient("?? granada"),
                    Ingredient("4 cucharadas de aceite de olvia"),
                    Ingredient("1 cucharada de vinagre de manzana"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_lenteja),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
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
        val args = Bundle()
        args.putSerializable("Recipe", recipe as Serializable)
        intent.putExtra("Bundle", args)

        startActivity(intent)

    }
}