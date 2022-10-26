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