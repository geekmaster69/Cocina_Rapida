package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityGuarnicionesBinding
import java.io.Serializable

class GuarnicionesActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityGuarnicionesBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuarnicionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Poro Gratinado con Queso Emmental",
                R.drawable.poro_gratinado_queso,
                arrayListOf(
                    Ingredient("1Kg de poro"),
                    Ingredient("40g de mantequilla"),
                    Ingredient("30g de harina"),
                    Ingredient("400ml de leche"),
                    Ingredient("1 pisca de nuez moscada"),
                    Ingredient("70g de queso emmental"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("70g de queso manchego (Sustituye queso emmental)"),
                    Ingredient("70g de mezcla de quesos italianos (Sustituye queso emmental)"),
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_poro_gratinado_queso),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Papas Gratinadas",
                R.drawable.papas_gratinadas,
                arrayListOf(
                    Ingredient("500g de papas"),
                    Ingredient("1 cebolla"),
                    Ingredient("700ml de leche"),
                    Ingredient("2 hojas de laurel"),
                    Ingredient("30g de mantequilla"),
                    Ingredient("200ml de crema para batir"),
                    Ingredient("4 ramas de perejil"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_papas_gratinadas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Calabaza Gratinada con Ajonjolí y Mozzarella",
                R.drawable.calabaza_gratinada_ajonjoli_mozzarella,
                arrayListOf(
                    Ingredient("1Kg de calabaza mantequilla o de castilla"),
                    Ingredient("1 cucharada de aceite"),
                    Ingredient("50ml de agua"),
                    Ingredient("450g de queso mozzarella"),
                    Ingredient("50g de ajonjolí"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("450g de queso manchego (Sustituye queso mozzarella)"),
                    Ingredient("450g de mezcla de quesos italianos (Sustituye queso mozzarella)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_calabaza_gratinada_ajonjoli),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Chile Morrón Gratinados con Calabacitas y Queso Oaxaca",
                R.drawable.pimientos_gratinados_calabacitas_feta,
                arrayListOf(
                    Ingredient("2 pimientos rojos"),
                    Ingredient("1 calabacita"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("2 huevos"),
                    Ingredient("1 cucharada de hierbas provenzales"),
                    Ingredient("100g de queso feta"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("queso feta (En lugar de queso oaxaca)")
                ),
                getString(R.string.preparation_chile_morron_calabaza_feta),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Clafoutis de Jitomates Cherry",
                R.drawable.clafoutis_hitomate_cherry,
                arrayListOf(
                    Ingredient("350g de jitomates cherry"),
                    Ingredient("250ml de leche"),
                    Ingredient("250ml de crema para batir"),
                    Ingredient("4 huevos"),
                    Ingredient("90g de harina"),
                    Ingredient("2 ramas de albahaca"),
                    Ingredient("50g de queso parmesano"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_clafoutis_jitomate_cherry),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@GuarnicionesActivity)
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