package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityPostresBinding
import java.io.Serializable
import java.util.ArrayList

class Postres : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityPostresBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostresBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)



       val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_panque_platano_taza),
                R.drawable.panque_platano_taza,
                arrayListOf(
                    Ingredient(getString(R.string.platano_1pza)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.leche_3cds)),
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.esencia_vainilla_1cda)),
                    Ingredient(getString(R.string.miel_2cda)),
                    Ingredient(getString(R.string.harina_65g)),
                    Ingredient(getString(R.string.polvo_hornear_1cda)),
                    Ingredient(getString(R.string.chispas_chocolate_50grs)),
                    Ingredient(getString(R.string.mantequilla))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.azucar_glas)),
                    Ingredient(getString(R.string.cajeta)),
                    Ingredient(getString(R.string.dulce_leche)),
                    Ingredient(getString(R.string.crema_batida)),
                    Ingredient(getString(R.string.chocolate_liquido))
                ),
                getString(R.string.panque_platano_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_panque_avena),
                R.drawable.panke_avena,
                arrayListOf(
                    Ingredient(getString(R.string.platano_1)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.yogurt_griego_1_3_tz)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.miel_cda)),
                    Ingredient(getString(R.string.avena_1_3_tza)),
                    Ingredient(getString(R.string.chispas_chocolate_50grs))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.panque_avena_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_cheesecake_frutos_rojos),
                R.drawable.cheesecake_frutos_rojos,
                arrayListOf(
                    Ingredient(getString(R.string.galletas_mariaMolidas_2tzs)),
                    Ingredient(getString(R.string.azucar_1_3tzs)),
                    Ingredient(getString(R.string.mantequilla_3_4tz)),
                    Ingredient(getString(R.string.queso_crema_900g)),
                    Ingredient(getString(R.string.azucar_2tz)),
                    Ingredient(getString(R.string.leche_1_4tz)),
                    Ingredient(getString(R.string.esencia_vainilla_2cda)),
                    Ingredient(getString(R.string.grenetina_14g)),
                    Ingredient(getString(R.string.mezcla_frutos_rojos_400g)),
                    Ingredient(getString(R.string.azucar_1tz)),
                    Ingredient(getString(R.string.grenetina_14g)),
                    Ingredient(getString(R.string.almidon_maiz_2cda)),
                    Ingredient(getString(R.string.jugo_limon_1_4tz)),
                    Ingredient(getString(R.string.fresas_400g))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.mermelada_fresa)),
                    Ingredient(getString(R.string.base_galleta))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.cheesecake_frutos_rojos_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_carlota_limon),
                R.drawable.carlota_limon,
                arrayListOf(
                    Ingredient(getString(R.string.galletas_maria)),
                    Ingredient(getString(R.string.yogurt_griego_1tz)),
                    Ingredient(getString(R.string.limon)),
                    Ingredient(getString(R.string.endulzante)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.galletas_trituradas_4cda)),
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.mantequilla_engrasar))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.carlota_limon_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_cheesecake_mango_taza),
                R.drawable.carlota_limon,
                arrayListOf(
                    Ingredient(getString(R.string.queso_crema_4cda)),
                    Ingredient(getString(R.string.media_crema_4cda)),
                    Ingredient(getString(R.string.azucar)),
                    Ingredient(getString(R.string.esencia_vainilla)),
                    Ingredient(getString(R.string.mango_manila)),
                    Ingredient(getString(R.string.galettas_vainilla)),
                    Ingredient(getString(R.string.mantequilla_cda_1))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.mermelada_mango))
                ),
                getString(R.string.cheesecake_mango_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_arroz_leche),
                R.drawable.arroz_leche,
                arrayListOf(
                    Ingredient(getString(R.string.agua_1l)),
                    Ingredient(getString(R.string.raja_canela)),
                    Ingredient(getString(R.string.arroz_1tz)),
                    Ingredient(getString(R.string.leche_condensada_1lata)),
                    Ingredient(getString(R.string.leche_evaporada_1lata)),
                    Ingredient(getString(R.string.canela_molida_1_2cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.pasas_1_2tz))
                ),
                getString(R.string.arroz_leche_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_budin_pan),
                R.drawable.budin_pan,
                arrayListOf(
                    Ingredient(getString(R.string.pan_300g)),
                    Ingredient(getString(R.string.huevos_3pz)),
                    Ingredient(getString(R.string.leche_500ml)),
                    Ingredient(getString(R.string.azucar_125g)),
                    Ingredient(getString(R.string.chocolate_100g)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.caramelo_liquido)),
                    Ingredient(getString(R.string.mantequilla_3cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.budin_pan_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_panque_zanahoria_taza),
                R.drawable.panque_zanahoria_taza,
                arrayListOf(
                    Ingredient(getString(R.string.harina_1_4tz)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.canela_molida_1cda)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.nueces_1_4_tza)),
                    Ingredient(getString(R.string.zanahoria_grande)),
                    Ingredient(getString(R.string.yogurt_natural_1cda)),
                    Ingredient(getString(R.string.polvo_hornear_1_2cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.sustituto_azucar))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.glaseado)),
                    Ingredient(getString(R.string.crema_batida)),
                    Ingredient(getString(R.string.nueces_trozo))
                ),
                getString(R.string.panque_zanahoria_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_rol_canela_taza),
                R.drawable.rol_canela_taza,
                arrayListOf(
                    Ingredient(getString(R.string.mantequilla_cda_1)),
                    Ingredient(getString(R.string.azucar_1_4tz)),
                    Ingredient(getString(R.string.canela_molida_1cda)),
                    Ingredient(getString(R.string.pan_blanco_4pz)),
                    Ingredient(getString(R.string.nueces_1_4_tza)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.leche_1_3tz)),
                    Ingredient(getString(R.string.vainilla_cda_1))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.sustituto_azucar))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.glaseado)),
                    Ingredient(getString(R.string.crema_batida)),
                    Ingredient(getString(R.string.nueces_trozo))
                ),
                getString(R.string.rol_canela_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_crumble_manzana_taza),
                R.drawable.crumble_manzana_taza,
                arrayListOf(
                    Ingredient(getString(R.string.manzana_1pza)),
                    Ingredient(getString(R.string.jugo_limon_1_2cda)),
                    Ingredient(getString(R.string.canela_molida_1_2cda)),
                    Ingredient(getString(R.string.vainilla_1_4cda)),
                    Ingredient(getString(R.string.para_masa)),
                    Ingredient(getString(R.string.harina_2cda)),
                    Ingredient(getString(R.string.mantequilla_2_cda)),
                    Ingredient(getString(R.string.azucar_1cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.masa_hojaldre))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.helado_vainilla))
                ),
                getString(R.string.crumble_manzana_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_pastel_tres_leches_taza),
                R.drawable.pastel_3_lehes_taza,
                arrayListOf(
                    Ingredient(getString(R.string.mantequilla_2_cda)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.azuca_2cda)),
                    Ingredient(getString(R.string.leche_1cda)),
                    Ingredient(getString(R.string.harina_4cda)),
                    Ingredient(getString(R.string.polvo_hornear_1_2cda)),
                    Ingredient(getString(R.string.leche_1_4tz)),
                    Ingredient(getString(R.string.leche_evaporada_1_4tz)),
                    Ingredient(getString(R.string.leche_condensada_1_4tz)),
                    Ingredient(getString(R.string.fresas_1_2tz)),
                    Ingredient(getString(R.string.crema_batida))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.stevia))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.pastel_tres_leches_taza_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_galletas_microondas),
                R.drawable.galletas_microondas,
                arrayListOf(
                    Ingredient(getString(R.string.azucar_mascabada_4cda)),
                    Ingredient(getString(R.string.sal_pizca)),
                    Ingredient(getString(R.string.vainilla_cda_1)),
                    Ingredient(getString(R.string.huevo_1)),
                    Ingredient(getString(R.string.mantequilla_sin_sal_1_2barra)),
                    Ingredient(getString(R.string.harina_10cda)),
                    Ingredient(getString(R.string.chispas_chocolate_1_4tz))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.nues_picada)),
                    Ingredient(getString(R.string.chispas_colores))
                ),
                getString(R.string.galletas_microondas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@Postres)
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
        intent.putExtra("title", title)
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

//        binding.bttartaQuesoMicroondas.setOnClickListener {
//
//            val title = getString(R.string.title_tarta_queso_microondas)
//
//            val image = R.drawable.tarta_queso_microondas
//
//            val ingredientList = arrayListOf(
//                Ingredient(getString(R.string.queso_crema_4cda)),
//                Ingredient(getString(R.string.yogurt_natural_2cda)),
//                Ingredient(getString(R.string.azucar_2_1_2tz)),
//                Ingredient(getString(R.string.huevo_1)),
//                Ingredient(getString(R.string.vainilla_cda_1)),
//                Ingredient(getString(R.string.galletas_trituradas_4cda)),
//                Ingredient(getString(R.string.mantequilla_cda_1)),
//                Ingredient(getString(R.string.mantequilla_engrasar)))
//
//            val substitutesList = arrayListOf(
//                Ingredient(getString(R.string.no_subtitutes)))
//
//            val optionsList = arrayListOf(
//                Ingredient(getString(R.string.no_optios)))
//
//            val preparation = getString(R.string.tarta_queso_microondas_preparation)
//
//            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
//                preparation)
//        }