package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityDesayunosBinding
import java.io.Serializable

class DesayunosActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityDesayunosBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_omelette_jamon_queso),
                R.drawable.omelette_jamon_queso,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.rebanada_pechuga_pollo_rostizada)),
                    Ingredient(getString(R.string.queso_manchego_2)),
                    Ingredient(getString(R.string.rebanada_jitomate_bola_3)),
                    Ingredient(getString(R.string.rebanada_aguacate_3)),
                    Ingredient(getString(R.string.sal_grano_cda_1_2)),
                    Ingredient(getString(R.string.aceite_canola_cda)),
                    Ingredient(getString(R.string.mantequilla_cda_1_2)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.omelette_jamon_queso_preparation),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_huevos_estilo_amelia),
                R.drawable.huevos_amelia,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.rebanas_pan_caja_2)),
                    Ingredient(getString(R.string.sal_pimineta_gusto)),
                    Ingredient(getString(R.string.mantequilla)),
                    Ingredient(getString(R.string.miel_abeja))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.huevos_amelia_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_huevos_lugo_lopez),
                R.drawable.huevos_lugo_lopez,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_4)),
                    Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(getString(R.string.jitomate_picado_cubos_1)),
                    Ingredient(getString(R.string.papa_cortada_cubos_1)),
                    Ingredient(getString(R.string.rebanadas_jamon_triangulos_2)),
                    Ingredient(getString(R.string.queso_oaxaca_20g)),
                    Ingredient(getString(R.string.aceite_cda_5)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.huevos_kuego_lopez_preparation),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_huevos_salsa_jitomate),
                R.drawable.huevos_salsa_jitomate,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_4)),
                    Ingredient(getString(R.string.jitomates_cortados_4_3)),
                    Ingredient(getString(R.string.cebolla_1_4)),
                    Ingredient(getString(R.string.ajo_1)),
                    Ingredient(getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.agua_50ml)),
                    Ingredient(getString(R.string.mantequilla_2_cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.pure_tomate_tp))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.chiles_serranos_2))
                ),
                getString(R.string.huevos_salsa_jitomate_preparation),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_chilaquiles_rojos_verdes),
                R.drawable.chilaquiles,
                arrayListOf(
                    Ingredient(getString(R.string.totopos_500gr)),
                    Ingredient(getString(R.string.tomate_verde_1kg)),
                    Ingredient(getString(R.string.cebolla)),
                    Ingredient(getString(R.string.chiles_serranos_2)),
                    Ingredient(getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(getString(R.string.queso_panela_manchego_100gr)),
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.sal_pimineta_gusto)),
                    Ingredient(getString(R.string.ajo_1))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.chilaquiles_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_enfrijoladas),
                R.drawable.enfrijoladas,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_4)),
                    Ingredient(getString(R.string.jitomate_picado_cubos_1)),
                    Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(getString(R.string.chile_cuaresmeno_jilianas_1)),
                    Ingredient(getString(R.string.bolsa_frijoles_refritos_1)),
                    Ingredient(getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(getString(R.string.longaniza_100gr)),
                    Ingredient(getString(R.string.crema)),
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.agua)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.enfrijoladas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_avocado_toast),
                R.drawable.avocado_toas,
                arrayListOf(
                    Ingredient(getString(R.string.rebanas_pan_caja_2)),
                    Ingredient(getString(R.string.blanco_integral_centeno)),
                    Ingredient(getString(R.string.aguacate)),
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.limon)),
                    Ingredient(getString(R.string.jitomate_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.avocado_toas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_omurice),
                R.drawable.omurice,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.cebolla_cambray_1)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.taza_arroz_vapor_1_2)),
                    Ingredient(getString(R.string.agua)),
                    Ingredient(getString(R.string.catsup)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.omurice_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_omelette_espinacas),
                R.drawable.omelette_espinaca,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.leche_10ml)),
                    Ingredient(getString(R.string.manojo_espinacas)),
                    Ingredient(getString(R.string.queso_manchego_cabra)),
                    Ingredient(getString(R.string.jamon)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.espinacas_bolsa)),
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.omelette_espinacas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_omelette_champinones),
                R.drawable.omelette_champinones,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.leche_10ml)),
                    Ingredient(getString(R.string.champinones_250)),
                    Ingredient(getString(R.string.queso_manchego_2)),
                    Ingredient(getString(R.string.cebolla_picada_1_4)),
                    Ingredient(getString(R.string.jamon)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.lata_champinones_rev))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.omelette_champinones_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_huevo_salchicha),
                R.drawable.huevo_salchicha,
                arrayListOf(
                    Ingredient(getString(R.string.huevos_2)),
                    Ingredient(getString(R.string.leche_10ml)),
                    Ingredient(getString(R.string.salchichas_2)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.catsup)),
                    Ingredient(getString(R.string.tortillas))
                ),
                getString(R.string.huevos_salchicha_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@DesayunosActivity)
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