package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityPastasMenuBinding
import java.io.Serializable

class PastasMenu : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityPastasMenuBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastasMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_spaghetti_camarones_salsa_blanca),
                R.drawable.spaghetti_camarones,
                arrayListOf(
                    Ingredient(getString(R.string.camarones_precosidos_300grs)),
                    Ingredient(getString(R.string.sal_pimineta_gusto)),
                    Ingredient(getString(R.string.ajo_cabeza_1)),
                    Ingredient(getString(R.string.mantequilla)),
                    Ingredient(getString(R.string.crema)),
                    Ingredient(getString(R.string.agua)),
                    Ingredient(getString(R.string.pasta_espagueti)),
                    Ingredient(getString(R.string.queso_parmesano)),
                    Ingredient(getString(R.string.perejil))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.ajos_picados_frasco)),
                    Ingredient(getString(R.string.perejil_seco))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.pasta_camarones_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                getString(R.string.title_spaghetti_salsa_tomate_albahaca),
                R.drawable.spaghetti_albahaca,
                arrayListOf(
                    Ingredient(getString(R.string.jitomate_bola_3)),
                    Ingredient(getString(R.string.manojo_albahaca_1)),
                    Ingredient(getString(R.string.ajos_picados_4)),
                    Ingredient(getString(R.string.sal_grano)),
                    Ingredient(getString(R.string.pimienta)),
                    Ingredient(getString(R.string.queso_parmesano))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.substitute_pasta_albahaca_1)),
                    Ingredient(getString(R.string.pasta_albahaca_substitute_1)),
                    Ingredient(getString(R.string.pasta_albahaca_subtitute_3))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.pasta_albahaca_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Spaghetti con Sardinas",
                R.drawable.spaghetti_sardinas,
                arrayListOf(
                    Ingredient("400g de spaghetti"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 lata de sardinas en aceite"),
                    Ingredient("30g de pasas"),
                    Ingredient("1 pizca de azafrán"),
                    Ingredient("1 manojo de eneldo"),
                    Ingredient("3 cucharadas de aceite"),
                    Ingredient("50 ml de agua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.prparation_sapghetti_sardinas),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                getString(R.string.title_spaghetti_salsa_pesto),
                R.drawable.spaghetti_pesto,
                arrayListOf(
                    Ingredient(getString(R.string.manojo_albahaca_1)),
                    Ingredient(getString(R.string.queso_parmesano_cda)),
                    Ingredient(getString(R.string.ajo_1)),
                    Ingredient(getString(R.string.aceite_oliva_1_2_tza)),
                    Ingredient(getString(R.string.nueces_1_4_tza)),
                    Ingredient(getString(R.string.sal_gusto)),
                    Ingredient(getString(R.string.spaghetti_500g))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.spaghetti_pesto_substitute))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.pan_con_mantequilla)),
                    Ingredient(getString(R.string.ensalada_campesina))
                ),
                getString(R.string.spaghetti_pesto_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                getString(R.string.title_spaghetti_crema_aguacate),
                R.drawable.spaghetti_aguacate,
                arrayListOf(
                    Ingredient(getString(R.string.spaghetti_500g)),
                    Ingredient(getString(R.string.cacahuates_1_3_tza)),
                    Ingredient(getString(R.string.mente_fresca_tza_1)),
                    Ingredient(getString(R.string.perejil_1_2_tza)),
                    Ingredient(getString(R.string.cilantro_1_2_tza)),
                    Ingredient(getString(R.string.ajo_1)),
                    Ingredient(getString(R.string.limones_3)),
                    Ingredient(getString(R.string.aguacates_grandes_1_1_2)),
                    Ingredient(getString(R.string.aceite_oliva_1_4_tza)),
                    Ingredient(getString(R.string.agua_coccion_pasta))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),arrayListOf(
                    Ingredient(getString(R.string.pechuga_asada)),
                    Ingredient(getString(R.string.queso_parmesano))
                ),
                getString(R.string.spaghetti_crema_aguacate_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ), Recipe(
                getString(R.string.title_spaghetti_pimiento_rojo_cremoso),
                R.drawable.spaghetti_pimiento,
                arrayListOf(
                    Ingredient(getString(R.string.spaghetti_500g)),
                    Ingredient(getString(R.string.lata_chile_morron_1)),
                    Ingredient(getString(R.string.cubo_caldo_pollo_1)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.lata_media_crema_1)),
                    Ingredient(getString(R.string.leche_10ml))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.pechuga_asada)),
                    Ingredient(getString(R.string.pan_con_mantequilla)),
                    Ingredient(getString(R.string.ensalada_campesina))
                ),
                getString(R.string.spaghetti_pimiento_cremoso_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                getString(R.string.title_spaghetti_rojo_cremoso),
                R.drawable.spaghetti_cremoso,
                arrayListOf(
                    Ingredient(getString(R.string.spaghetti_500g)),
                    Ingredient(getString(R.string.jitomate_rebanado_sin_semilla_6)),
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.sal_gusto)),
                    Ingredient(getString(R.string.hierbas_finas_cda_1)),
                    Ingredient(getString(R.string.pimienta_negra_molida_1_4_cda)),
                    Ingredient(getString(R.string.leche_evaporada_250ml)),
                    Ingredient(getString(R.string.cubo_caldo_pollo_1))
                ),
                arrayListOf(Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.pechuga_asada)),
                    Ingredient(getString(R.string.albondigas)),
                    Ingredient(getString(R.string.ensalada_campesina))
                ),
                getString(R.string.spaghetti_rojo_cremoso_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                getString(R.string.title_pizza_multi_color),
                R.drawable.pizza_multicolor,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1tz)),
                    Ingredient(getString(R.string.agua_1tz)),
                    Ingredient(getString(R.string.sal_1cda)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.aceite_1cda)),
                    Ingredient(getString(R.string.mezcla_queso_rayado)),
                    Ingredient(getString(R.string.jitomate_cherry_colores_180g)),
                    Ingredient(getString(R.string.manojo_albahaca_1)),
                    Ingredient(getString(R.string.sal_grano)),
                    Ingredient(getString(R.string.aceite_oliva_4cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.jitomate_bola_saladet))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.pizza_multi_color_preparation),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Pizza Exprés de Chorizo",
                R.drawable.pizza_expres_chorizo,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1tz)),
                    Ingredient(getString(R.string.agua_1tz)),
                    Ingredient(getString(R.string.sal_1cda)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.aceite_1cda)),
                    Ingredient("salsa para pizza"),
                    Ingredient("250g de chorizo"),
                    Ingredient("10 aceitunas negras"),
                    Ingredient("220g de queso mozzarella"),
                    Ingredient("1 chorrito de aceite"),
                    Ingredient("1 cucharada de ajo en polvo"),
                    Ingredient("hojas de albahaca"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("queso manchego (Sustituye mozzarella)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pizza_expres_chorizo),
                arrayListOf(
                    Help("Base para Pizza",
                        R.drawable.help_base_pizza,
                        getString(R.string.help_base_pizza))
                )
            ),
            Recipe(
                "Pizza de Verduras a la Parrilla",
                R.drawable.pizza_verduras_parrilla,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1tz)),
                    Ingredient(getString(R.string.agua_1tz)),
                    Ingredient(getString(R.string.sal_1cda)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.aceite_1cda)),
                    Ingredient("100g de jitomates picados en aceie"),
                    Ingredient("1 cucharada de oregano seco"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("sal"),
                    Ingredient("300g de queso manchego"),
                    Ingredient("200g de verduras (pimiento rojo, berenjena, jitomate cherry)"),
                    Ingredient("hojas de albahaca"),
                    Ingredient("jamón de tu preferencia")
                ),
                arrayListOf(
                    Ingredient("mezcla de quesos italianos")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pizza_verduras_parrilla),
                arrayListOf(
                    Help("Base para Pizza",
                        R.drawable.help_base_pizza,
                        getString(R.string.help_base_pizza)
                    )
                )
            ),
            Recipe(
                "Pizza Blanca con Mozzarella y Albahaca",
                R.drawable.pizza_blanca_mozzarella_albahaca,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1tz)),
                    Ingredient(getString(R.string.agua_1tz)),
                    Ingredient(getString(R.string.sal_1cda)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.aceite_1cda)),
                    Ingredient("1 diente de ajo"),
                    Ingredient("50g de parmesano"),
                    Ingredient("50g de cacahuates"),
                    Ingredient("20 hojas de albahaca"),
                    Ingredient("4 cucharadas de crema acida"),
                    Ingredient("125g de queso ozzarella"),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("mezcla de quesos italianos (Sustituye mozzarella)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pizza_blanca_mozzarella_albahaca),
                arrayListOf(
                    Help("Base para Pizza",
                        R.drawable.help_base_pizza,
                        getString(R.string.help_base_pizza)
                    )
                )
            ),
            Recipe(
                "Linguine con Albóndigas",
                R.drawable.linguine_albondigas,
                arrayListOf(
                    Ingredient("450g de carne molida de res"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 pizca de paprica"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("400g de linguine"),
                    Ingredient("1 manojo de albaca"),
                    Ingredient("70g de queso parmesano"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_linguine_albondigas),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Penne en Salsa de Jitomate con Panceta y Cebolla Cambray",
                R.drawable.penne_jitomate_cebolla,
                arrayListOf(
                    Ingredient("400g de pasta penne"),
                    Ingredient("12 rebanadas de panceta"),
                    Ingredient("1 chorrito de aceite"),
                    Ingredient("2 cebollas cambray"),
                    Ingredient("20 jitomates cherry"),
                    Ingredient("300ml de salsa para espagueti"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("12 tiras de tocino (Sustituye panceta)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_penne_jitomate_albahaca),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Pasta Rotelle con Salmón",
                R.drawable.pasta_rotelle_salmon,
                arrayListOf(
                    Ingredient("400g de pasta de ruedita o engrane"),
                    Ingredient("400g de salmón"),
                    Ingredient("½ cebolla "),
                    Ingredient("200ml de crema para batir"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("1 chorrito de aceite"),
                    Ingredient("1 manojo de cebolla cambray (Solo el tayo)"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("pescado blanco, tilapia o basa (Sustituye salón)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_pasta_rotelle_salmon),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Coditos con Pescado y Limón Amarillo",
                R.drawable.pasta_pescado_limon_amarillo,
                arrayListOf(
                    Ingredient("350g de tilapia o basa"),
                    Ingredient("400g de coditos"),
                    Ingredient("1 limón amarillo"),
                    Ingredient("200ml de crema para batir"),
                    Ingredient("2 cucharadas de aceite de oliva"),
                    Ingredient("2 cebollas cambray (Solo los tayos)"),
                    Ingredient("1 manojo de cebolla cambray (Solo el tayo)"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("bacalao fresco"),
                    Ingredient("pescado sierra"),
                ),
                getString(R.string.preparation_pasta_pescado_limon),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Pescado con Jitomates Cherry y Pasta",
                R.drawable.pescado_jitomates_cherry_pasta,
                arrayListOf(
                    Ingredient("300g de tilapia o basa"),
                    Ingredient("aceite"),
                    Ingredient("400g de coditos"),
                    Ingredient("1 ajo"),
                    Ingredient("400g de jitomates cherry"),
                    Ingredient("½ manojo de albahaca"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("pescado dorada")
                ),
                getString(R.string.preparation_pescado_jitomates_cherry_pasta),
                arrayListOf(
                    Help("Cocer Pasta",
                        R.drawable.pasta_help,
                        getString(R.string.help_pasta_preparation))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@PastasMenu)
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