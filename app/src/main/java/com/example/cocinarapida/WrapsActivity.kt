package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityWrapsBinding
import java.io.Serializable

class
WrapsActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityWrapsBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWrapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_wrap_sushi),
                R.drawable.wrap_sushi,
                arrayListOf(
                    Ingredient(getString(R.string.hoja_nori)),
                    Ingredient(getString(R.string.aguacate_1_2)),
                    Ingredient(getString(R.string.pepino)),
                    Ingredient(getString(R.string.barra_surimi_2)),
                    Ingredient(getString(R.string.taza_arroz_vapor_1_2)),
                    Ingredient(getString(R.string.queso_crema))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.wrap_sushi_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"))
            ),
            Recipe(
                getString(R.string.title_wrap_jitomate_espinaca),
                R.drawable.wrap_jitomate_espinaca,
                arrayListOf(
                    Ingredient(getString(R.string.jitomate_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto)),
                    Ingredient(getString(R.string.mezcla_quesos_1tz)),
                    Ingredient(getString(R.string.espinacas_desinfectadas_1tz)),
                    Ingredient(getString(R.string.tortilla_wrap_1)),
                    Ingredient(getString(R.string.mantequilla_cda_1))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.wrap_jitomate_espinaca_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"))
            ),
            Recipe(
                "Wrap de Pollo Especiado",
                R.drawable.wrap_pollo_especiado,
                arrayListOf(
                    Ingredient("2 pechuga de pollo sin piel y sin hueso"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("4 tortillas de harina para wraps o burrito"),
                    Ingredient("aderezo de queso azul"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_wrap_pollo_especiado),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"))
            )
        )
        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@WrapsActivity)
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