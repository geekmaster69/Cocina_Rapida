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
                "Fajitas de Res",
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
            Recipe(
                "Lasaña de Berenjena con Carne",
                R.drawable.moussaka,
                arrayListOf(
                    Ingredient("300g de carne molida de res"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 frasco de salsa para espagueti o tetrapack"),
                    Ingredient("2 huevos"),
                    Ingredient("100g de queso mozzarella"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_lasagna_berenjena),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_suggestions))
                )
            ),
            Recipe(
                "Res con Champiñones",
                R.drawable.res_campinones,
                arrayListOf(
                    Ingredient("600g de champiñones"),
                    Ingredient("1Kg de milanesas de res"),
                    Ingredient("500ml de crema"),
                    Ingredient("pimienta rosa"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("sal y pimineta al gusto"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_res_champinones),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_suggestions))
                )
            ),
            Recipe(
                "Salteado de Cerdo y Piña",
                R.drawable.res_campinones,
                arrayListOf(
                    Ingredient("500g de filete de cerdo"),
                    Ingredient("50g de mantequilla"),
                    Ingredient("1 chile morrón rojo"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 lata de piña en almibar en trozos"),
                    Ingredient("1 limon"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_salteado_cerdo_pina),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Filete de Cerdo con Curry",
                R.drawable.filete_cerdo_curry,
                arrayListOf(
                    Ingredient("700g de filete de cerdo"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("3 cucharadas de curry rojo en polvo"),
                    Ingredient("70 ml de agua"),
                    Ingredient("250 ml de crema"),
                    Ingredient("sal")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_cerdo_curry),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Piernas de Pollo Loqueadas con Miel, Limón y Cilantro",
                R.drawable.piernas_pollo_loqueadas_miel_cilantro,
                arrayListOf(
                    Ingredient("8 piernas de pollo"),
                    Ingredient("5 cucharadas de miel"),
                    Ingredient("3 limones amarillos"),
                    Ingredient("5 cucharadas de salsa de soya"),
                    Ingredient("5 dientes de ajo"),
                    Ingredient("1 manojo de cilantro")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_piernas_loqueadas_limon),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Curry Rojo con Pollo y Leche de Coco",
                R.drawable.piernas_pollo_loqueadas_miel_cilantro,
                arrayListOf(
                    Ingredient("1kg de pechuga de pollo"),
                    Ingredient("4 cucharadas de curry rojo en pasta"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("300 ml de leche de coco"),
                    Ingredient("1 manojo de cilantro"),
                    Ingredient("sal al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_curry_rojo_pollo_leche_coco),
                arrayListOf(
                    Help(getString(R.string.no_suggestions),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pollo Vasco",
                R.drawable.piernas_pollo_loqueadas_miel_cilantro,
                arrayListOf(
                    Ingredient("4 piernas de pollo son piel"),
                    Ingredient("4 muslos de pollo sin piel"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 pimiento rojo"),
                    Ingredient("1 pimiento verde"),
                    Ingredient("400g de jitomates picados enlatados"),
                    Ingredient("1 cucharada de hierbas provenzales"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pollo_vasco),
                arrayListOf(
                    Help("Cortar Cebolla en Rodajas",
                        R.drawable.help_cebolla_rodajas,
                        getString(R.string.help_cebolla_rodajas))
                )
            )
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