package com.example.cocinarapida
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityBentoBinding
import java.io.Serializable

class Bento : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityBentoBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
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
                        "No hay sugerencias disponibles"))
            ),
            Recipe(
                "Wok de Res con Fideos de Arroz y Brocoli",
                R.drawable.wok_res_fideos_brocoli,
                arrayListOf(
                    Ingredient("400g de fideos de arroz"),
                    Ingredient("1 brocoli mediano"),
                    Ingredient("600g de filete de res"),
                    Ingredient("cacahuates tostados salados"),
                    Ingredient("salsa de soya"),
                    Ingredient("250ml de agua"),
                    Ingredient("3 cucharadas de aceite de oliva")
                ),
                arrayListOf(
                    Ingredient("fideos de frijos (Sustitulle fideos de arroz)"),
                    Ingredient("milanesa de res (Sustitulle fielete de res)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_wok_res_fideos_brocoli),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                "Chili con carne expés",
                R.drawable.chili_expres,
                arrayListOf(
                    Ingredient("2 cebollas"),
                    Ingredient("500g de carne molida de res"),
                    Ingredient("2 cucharadas de aceite de oliva"),
                    Ingredient("300g de jitomates picados enlatados o tetrapak"),
                    Ingredient("1 cucharada de comino en polvo"),
                    Ingredient("1 cucharada de chile en polvo"),
                    Ingredient("1 lata de frijoles ayocote morado"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("frijoles enteros (Stutituye frijoles ayocote)"),
                    Ingredient("500g de carne molida de cerdo (Sustituye carne de res)"),
                ),
                arrayListOf(
                    Ingredient("limones")
                ),
                getString(R.string.preparation_chili_expres),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                "Brochetas de Albóndigas con Ensalada de Jitomate",
                R.drawable.brochetas_albondigas_ensalada,
                arrayListOf(
                    Ingredient("1 cebolla morada"),
                    Ingredient("30 hojas de menta"),
                    Ingredient("palitos para brocheta"),
                    Ingredient("600g de carme molida de res"),
                    Ingredient("4 cucharadas de aceite"),
                    Ingredient("20 jitomates cherry"),
                    Ingredient("vinagre balsámico")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar con pasta o arroz")
                ),
                getString(R.string.preparation_brochetas_albondigas_ensalada),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.help_cebolla_rodajas,
                        "Así es como debe verse la cebolla cuando la cortes")
                )
            ),
            Recipe(
                "Saltimbocca",
                R.drawable.saltimbocca,
                arrayListOf(
                    Ingredient("8 milanesas de res"),
                    Ingredient("8 rebanadas de queso mozzarela"),
                    Ingredient("romero"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("palillos"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_saltimbocca),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Salteado de Cerdo y Jengibre",
                R.drawable.salteado_cerdo_jengibre,
                arrayListOf(
                    Ingredient("600g de filete de cerdo"),
                    Ingredient("4 cebollas cambray"),
                    Ingredient("3 cm de jengibre"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("3 cucharadas de aceite de soya"),
                    Ingredient("2 cucharadas de azúcar mascabado"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar arroz blanco")
                ),
                getString(R.string.preparation_salteado_cerdo_jengibre),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pollo crujiente con Hojuelas de Maíz",
                R.drawable.pollo_crujinte_jojuelas,
                arrayListOf(
                    Ingredient("2 pecuchas sin piel y sin hueso"),
                    Ingredient("200 ml de leche"),
                    Ingredient("1 cucharada de páprika"),
                    Ingredient("8 cucharadas de harina"),
                    Ingredient("1 cucharada de ajo en polvo"),
                    Ingredient("2 huevos"),
                    Ingredient("250g de hojuelas de miz"),
                    Ingredient("2 cucharadas de aceite")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar arroz blanco")
                ),
                getString(R.string.preparation_pollo_crujiente_hojuelas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )
        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvBento.apply {
            layoutManager = LinearLayoutManager(this@Bento)
            adapter = recipeAdapter
        }

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}