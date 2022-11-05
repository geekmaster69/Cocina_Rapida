package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityPescadoBinding
import java.io.Serializable

class PescadoActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityPescadoBinding
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPescadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Atún Sellado con Ajonjolí y ejotes",
                R.drawable.atun_sellado_ajonjoli_ejotes,
                arrayListOf(
                    Ingredient("4 medallones de atún"),
                    Ingredient("3 cucharadas de salsa de soya dulce"),
                    Ingredient("1 chorrito de aceite de ajonjolí"),
                    Ingredient("1 limón verde"),
                    Ingredient("ajonjolí"),
                    Ingredient("400g de ejotes"),
                    Ingredient("pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_atun_sellado_ajonjoli_ejotes),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Fish and Chips",
                R.drawable.fish_chips,
                arrayListOf(
                    Ingredient("4 camotes"),
                    Ingredient("aceite"),
                    Ingredient("500g de lomo de bacalao fresco"),
                    Ingredient("1 huevo"),
                    Ingredient("100g de harina"),
                    Ingredient("100g de pan molido"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_fish_chips),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Bacalao Pochado en Leche de Coco con Espinacas",
                R.drawable.bacalao_pochado_leche_coco_espinacas,
                arrayListOf(
                    Ingredient("500g de lomo de bacalao fresco"),
                    Ingredient("400ml de leche de coco"),
                    Ingredient("300ml de agua"),
                    Ingredient("4 jitomates deshidratados"),
                    Ingredient("3 puños de espinacas"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("pescado tilapia o basa (Sustituye bacalao)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_bacalao_pochado_leche_coco_espinacas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pescado Blanco con Cítricos",
                R.drawable.pescado_blanco_citricos,
                arrayListOf(
                    Ingredient("4 filetes de pascado blanco"),
                    Ingredient("2 toronjas"),
                    Ingredient("2 naranjas"),
                    Ingredient("2 cucharadas de miel de abeja"),
                    Ingredient("4 cucharadas de aceite")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("Acompañar con arroz blanco")
                ),
                getString(R.string.preparation_pescado_blanco_citricos),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pescado Blanco en Costra de Semillas",
                R.drawable.pescado_blanco_costra_semillas,
                arrayListOf(
                    Ingredient("4 filetes de pascado blanco"),
                    Ingredient("mezcla de semillas (linaza, calabaza, ajonjolí)"),
                    Ingredient("100g de almendra en polvo"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("Acompañar con arroz blanco")
                ),
                getString(R.string.preparation_pescado_blanco_costra_semillas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pescado Basa Asado con Salsa de Perejil y Ensalada",
                R.drawable.pescado_blanco_salsa_perejil,
                arrayListOf(
                    Ingredient("4 filetes de pascado blanco"),
                    Ingredient("1 jitomate bola"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("½ manojo de perejil"),
                    Ingredient("½ cebolla"),
                    Ingredient("1 limón"),
                    Ingredient("4 puñados de mezcla de lechugas")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("Acompañar con arroz blanco")
                ),
                getString(R.string.preparation_pescado_blanco_salsa_perejil),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pescado Basa en Salsa Verde de Hierbas",
                R.drawable.pescado_blanco_salsa_hierbas,
                arrayListOf(
                    Ingredient("4 filetes de pascado blanco"),
                    Ingredient("1 manojo de cilantro"),
                    Ingredient("1 cebolla cambray"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("1 manojo de perejil"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("Acompañar con arroz blanco")
                ),
                getString(R.string.preparation_pescado_blanco_salsa_verde_hierbas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@PescadoActivity)
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