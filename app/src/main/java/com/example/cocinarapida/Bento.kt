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
                        "No hay sugerencias disponibles"
                    )
                )
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
                        "No hay sugerencias disponibles"
                    )
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
                        "No hay sugerencias disponibles"
                    )
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
                        "Así es como debe verse la cebolla cuando la cortes"
                    )
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
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Salteado de Cerdo y Jengibre",
                R.drawable.salteado_cerdo_jengibre,
                arrayListOf(
                    Ingredient("600g de filete de cerdo"),
                    Ingredient("4 cebollas cambray"),
                    Ingredient("3cm de jengibre"),
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
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Pollo Crujiente con Hojuelas de Maíz",
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
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Poke Bowl",
                R.drawable.poke_bowl,
                arrayListOf(
                    Ingredient("300g de arroz cocido"),
                    Ingredient("1 cucharada de ajonjolí blanco y negro"),
                    Ingredient("300g de salmón"),
                    Ingredient("4 cebollas cambray (Solo tallo)"),
                    Ingredient("4 cucharadas de salsa de soya"),
                    Ingredient("2 cucharadas de aceite de ajonjolí"),
                    Ingredient("1 pepino"),
                    Ingredient("1 col"),
                    Ingredient("2 aguacates")
                ),
                arrayListOf(
                    Ingredient("Sobre de salmón (Sustituye el salmón)"),
                    Ingredient("Sobre de atún (Sustituye el salmón)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_poke_bowl),
                arrayListOf(
                    Help(getString(R.string.help_arroz_title),
                        R.drawable.arroz_help,
                        getString(R.string.help_arroz_oniguiri)
                    )
                )
            ),
            Recipe(
                "Ensalada Bo Bun",
                R.drawable.ensalada_bo_bun,
                arrayListOf(
                    Ingredient("150g de fideos de arroz"),
                    Ingredient("4 cucharadas de salsa nem o thai agridulce"),
                    Ingredient("8 hojas de lechuga francesa"),
                    Ingredient("1 pepino"),
                    Ingredient("2 zanahorias"),
                    Ingredient("8 rollos primavera de camarón"),
                    Ingredient("4 ramas de menta"),
                    Ingredient("4 cucharadas de cacahuates"),
                    Ingredient("1L de agua")
                ),
                arrayListOf(
                    Ingredient("fideos de frijol (Sustituyen fideos de arroz)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_ensalada_bo_bun),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Arroz con Camarones y Chícharos",
                R.drawable.arroz_camaron_chicharos,
                arrayListOf(
                    Ingredient("300g de camarones"),
                    Ingredient("250g de arroz"),
                    Ingredient("20g de mantequilla"),
                    Ingredient("200g chícharos"),
                    Ingredient("450 ml de caldo de pollo"),
                    Ingredient("aceite"),
                    Ingredient("½ cebolla")
                ),
                arrayListOf(
                    Ingredient("caldo de pollo tetra pak (Sustituye caldo de pollo)"),
                    Ingredient("caldo de pollo en polvo (Sustituye caldo de pollo)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_arroz_camarones_chicharos),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Papas con Camarones y Espinacas",
                R.drawable.papas_camaron_espinacas,
                arrayListOf(
                    Ingredient("20 camarones cocidos"),
                    Ingredient("80g de espinaca baby"),
                    Ingredient("500g de papas cambray"),
                    Ingredient("2 cucharadas de vinagre balsámico"),
                    Ingredient("5 cucharadas de aceite de oliva"),
                    Ingredient("1 cucharada de mostaza antigua"),
                    Ingredient("sal de grano"),
                    Ingredient("agua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("espinacas en bolsa (Sustituye espinacas baby)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_papas_camarones_espinacas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Zanahorias con Comino y Cúrcuma",
                R.drawable.zanahorias_comino_curcuma,
                arrayListOf(
                    Ingredient("800g de zanahorias"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 cucharada de comino entero"),
                    Ingredient("1 cucharada de cúrcuma en polvo"),
                    Ingredient("2 cucharadas de comino en polvo"),
                    Ingredient("½ manojo de cilantro"),
                    Ingredient("200ml de agua"),
                    Ingredient("aceite"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("Puedes acompañar con una pechuga azada y arroz blanco o integral.")
                ),
                getString(R.string.preparation_zanahorias_comino_curcuma),
                arrayListOf(
                    Help(getString(R.string.help_cebolla_rodajas_title),
                        R.drawable.help_cebolla_rodajas,
                        getString(R.string.help_cebolla_rodajas)
                    )
                )
            ),
            Recipe(
                "Tortitas de Ayocotes",
                R.drawable.tortitas_ayocotes,
                arrayListOf(
                    Ingredient("1 lata de ayocotes cocidos"),
                    Ingredient("1 cucharada de curry en polvo"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 zanahoria"),
                    Ingredient("1 huevo"),
                    Ingredient("70g de pan molido"),
                    Ingredient("aceite"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_tortita_ayocote),
                arrayListOf(
                    Help(getString(R.string.help_cebolla_rodajas_title),
                        R.drawable.help_cebolla_rodajas,
                        getString(R.string.help_cebolla_rodajas)
                    )
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