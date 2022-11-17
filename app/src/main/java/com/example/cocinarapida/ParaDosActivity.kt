package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityParaDosBinding
import java.io.Serializable
class ParaDosActivity : AppCompatActivity(), ReceipeClickListener{
    private lateinit var binding: ActivityParaDosBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParaDosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Lomo de Cerdo y Papas con Pesto",
                R.drawable.omelette_jamon_queso,
                arrayListOf(
                    Ingredient(getString(R.string.perejil_1_2_manojo)),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("dos cucharadas de piñones"),
                    Ingredient("1Kg de papas"),
                    Ingredient("4 dientes de ajo machacados"),
                    Ingredient("1Kg de lomo de cerdo")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_lomo_papas_pesto),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Carne de Res a la Cerveza",
                R.drawable.carne_res_cerveza,
                arrayListOf(
                    Ingredient("20g de mantequilla"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("1 cebolla grande"),
                    Ingredient("1.2Kg de carne de res para estofado"),
                    Ingredient("4 cucharadas de harina"),
                    Ingredient("500ml de cerveza clara"),
                    Ingredient("1 manojo de hiervas de olor"),
                    Ingredient("4 cucharadas de mostaza antigua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_carne_res_cerveza),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Hamburguesas Suculentas",
                R.drawable.hamburguesa_suculenta,
                arrayListOf(
                    Ingredient("30g de mantequilla"),
                    Ingredient("2 cebollas"),
                    Ingredient("1 cucharada de azúcar"),
                    Ingredient("1 cucharada de vinagre balsámico"),
                    Ingredient("2 cucharadas de agua"),
                    Ingredient("4 discos de carne para hamburguesa"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("4 bollos para hamburgesas tostados"),
                    Ingredient("salsa barbecue"),
                    Ingredient("4 rebanadas de queso amarillo"),
                    Ingredient("1 jitomate"),
                    Ingredient("1 puñado de arúgula")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_hamburguesa_suculenta),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Rollo de Res al Pastor",
                R.drawable.rollos_res_pastor,
                arrayListOf(
                    Ingredient("10 milanesas de res"),
                    Ingredient("2 manojos de cilantro"),
                    Ingredient("500g de carne al pastor preparada"),
                    Ingredient("25g de mantequilla"),
                    Ingredient("una cuerda para hornear (Hilo grueso de algodón)"),
                    Ingredient("250ml de agua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_rollos_res_pastor),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Costillas de cerdo en salsa BBQ",
                R.drawable.costillas_bbq,
                arrayListOf(
                    Ingredient("1.5kg de costillas de cerdo sin grasa"),
                    Ingredient("2 dientes de ajo"),
                    Ingredient("2 camotes"),
                    Ingredient("1 cebolla"),
                    Ingredient("6 ramas de tomillo"),
                    Ingredient("salsa BBQ"),
                    Ingredient("1 cucharada de aceite"),
                    Ingredient("papel aluminio")
                ),
                arrayListOf(
                    Ingredient("2 papas (Sustituye camote)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_costillas_bbq),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Filete Mignon",
                R.drawable.salteado_cerdo_pina,
                arrayListOf(
                    Ingredient("2 fieletes de cerdo"),
                    Ingredient("180g de jitomates deshidratados en aceite"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("1 cucharada de mostaza dijon"),
                    Ingredient("1 cebolla morada")
                ),
                arrayListOf(
                    Ingredient("2 papas (Sustituye camote)")
                ),
                arrayListOf(
                    Ingredient("Arróz"),
                    Ingredient("Ensalada"),
                ),
                getString(R.string.preparation_filete_mignon),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Jitomates Rellenos Horneados",
                R.drawable.jitomates_rellenos_horneados,
                arrayListOf(
                    Ingredient("4 jitomates bola"),
                    Ingredient("300g de salchicha"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 manojo de perejil"),
                    Ingredient("1 rebanada de pan de caja duro"),
                    Ingredient("1 chorrito de aceite"),
                    Ingredient("sal de grano y pimienta")
                ),
                arrayListOf(
                    Ingredient("pan molido (Sustituye la rebanada de pan)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_jitomates_rellenos),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Pollo Asado",
                R.drawable.pollo_asado,
                arrayListOf(
                    Ingredient("1 pollo entero limpio con piel"),
                    Ingredient("20 papas cambray"),
                    Ingredient("3 dientes de ajo"),
                    Ingredient("3 cucharadas de miel de abeja"),
                    Ingredient("3 cucharadas de aceite"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("2 ramas de romero"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pollo_asado),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Salmón con Papas y Eneldo",
                R.drawable.salmon_papas_eneldo,
                arrayListOf(
                    Ingredient("1 filete de 800g de salmon con piel"),
                    Ingredient("1kg de papas cambray"),
                    Ingredient("5 ramas de eneldo"),
                    Ingredient("aceite de oliva"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("200ml de crema acida"),
                    Ingredient("1 cucharada de pimientas rosa"),
                    Ingredient("sal")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_salom_papas_eneldop),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Pasta con Camarones y azafrán",
                R.drawable.pasta_camaron_azafran,
                arrayListOf(
                    Ingredient("250g de camarones"),
                    Ingredient("1 pizca de azafrán"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("350g de jitomates picados enlatados"),
                    Ingredient("250g de spaghetti"),
                    Ingredient("agua"),
                    Ingredient("sal")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pasta_camarones_asafran),
                arrayListOf(
                    Help(
                        getString(R.string.help_pasta_preparation_title),
                        R.drawable.ic_help_null,
                        getString(R.string.help_pasta_preparation)
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
                "Pizza de Corazones de Alcachofa, Higos y Provolone",
                R.drawable.pizza_alcachofa_higo_provolone,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1tz)),
                    Ingredient(getString(R.string.agua_1tz)),
                    Ingredient(getString(R.string.sal_1cda)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.aceite_1cda)),
                    Ingredient("1 lata o tetra pak de salsa para pizza"),
                    Ingredient("1 cucharada de orenago seco"),
                    Ingredient("200g de queso mozzarela"),
                    Ingredient("100g de queso provolone"),
                    Ingredient("50g de corazones de alcachofa en conserva"),
                    Ingredient("1 puñado de arúgula"),
                    Ingredient("2 higos"),
                    Ingredient("100g de queso provolone"),
                ),
                arrayListOf(
                    Ingredient("espinacas en bolsa (Sustituye espinacas baby)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pizza_alcachofa_higos_provolone),
                arrayListOf(
                    Help("Base para Pizza",
                        R.drawable.help_base_pizza,
                        getString(R.string.help_base_pizza)
                    )
                )
            ),
            Recipe(
                "Canelones Rellenos de Queso Crema y Espinacas",
                R.drawable.canelones_rellenos_queso_crema_espinacas,
                arrayListOf(
                    Ingredient("20 canelones"),
                    Ingredient("350g de espinacas"),
                    Ingredient("300g de queso crema"),
                    Ingredient("200g de queso parmesano"),
                    Ingredient("2 huevos"),
                    Ingredient("Salsa de tomate para pasta"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_canelones_queso_crema_espinacas),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            ),
            Recipe(
                "Jitomates Rostizados con Queso de cabra y Albahaca",
                R.drawable.jitomates_rostisados_queso_cabra_albahaca,
                arrayListOf(
                    Ingredient("1Kg de jitomate bola"),
                    Ingredient("50g de queso de cabra"),
                    Ingredient("pan molido"),
                    Ingredient("hojas de albahaca fresca"),
                    Ingredient("aceite"),
                    Ingredient("Salsa de tomate para pasta"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_jitomates_rostizados_queso_cabra_albahaca),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)
                    )
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@ParaDosActivity)
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