package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityDesayunosBinding

class DesayunosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDesayunosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btOmeletteJamonQueso.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.rebanada_pechuga_pollo_rostizada)
            val ingredient3: String = getString(R.string.queso_manchego_2)
            val ingredient4: String = getString(R.string.rebanada_jitomate_bola_3)
            val ingredient5: String = getString(R.string.rebanada_aguacate_3)
            val ingredient6: String = getString(R.string.sal_grano_cda_1_2)
            val ingredient7: String = getString(R.string.aceite_canola_cda)
            val ingredient8: String = getString(R.string.mantequilla_cda_1_2)
            val ingredient9: String = getString(R.string.sal_pimineta_gusto)


            val preparation1: String = getString(R.string.omelette_jamon_queso_preparation)



            openOmeletteJamonQuesoActivity(ingredient1, ingredient2, ingredient3, ingredient4,
                                           ingredient5, ingredient6, ingredient7, ingredient8,
                                           ingredient9, preparation1)
        }
        binding.btHuevoAmelia.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.rebanas_pan_caja_2)
            val ingredient3: String = getString(R.string.sal_pimineta_gusto)
            val ingredient4: String = getString(R.string.mantequilla)
            val ingredient5: String = getString(R.string.miel_abeja)


            val preparation1: String = getString(R.string.huevos_amelia_preparation)


            openHuevosAmeliaActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                                     preparation1)
        }
        binding.btHuevoNorma.setOnClickListener {
            openHuevoNomraActivity()
        }
        binding.btHuevoTortillaJalapeO.setOnClickListener {
            openHuevoTortillaJalapenoActivity()
        }
        binding.btHuevoLugoLopez.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_4)
            val ingredient2: String = getString(R.string.cebolla_blanca_picada_1)
            val ingredient3: String = getString(R.string.jitomate_picado_cubos_1)
            val ingredient4: String = getString(R.string.papa_cortada_cubos_1)
            val ingredient5: String = getString(R.string.rebanadas_jamon_triangulos_2)
            val ingredient6: String = getString(R.string.queso_oaxaca_20g)
            val ingredient7: String = getString(R.string.aceite_cda_5)
            val ingredient8: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.huevos_kuego_lopez_preparation)

            openHuevosLugoLopezActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, preparation1)
        }
        binding.btHuevoSalsaJitomate.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_4)
            val ingredient2: String = getString(R.string.jitomates_cortados_4_3)
            val ingredient3: String = getString(R.string.cebolla_1_4)
            val ingredient4: String = getString(R.string.ajo_1)
            val ingredient5: String = getString(R.string.manojo_cilantro_1_8)
            val ingredient6: String = getString(R.string.cucharadas_aceite_2)
            val ingredient7: String = getString(R.string.agua_50ml)
            val ingredient8: String = getString(R.string.mantequilla_2_cda)

            val preparation1: String = getString(R.string.huevos_salsa_jitomate_preparation)

            val optional1: String = getString(R.string.chiles_serranos_2)

            openHuevoSalsaJitomateAtivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, preparation1, optional1)
        }
        binding.btChilaquilesRojosVerdes.setOnClickListener {

            val ingredient1: String = getString(R.string.totopos_500gr)
            val ingredient2: String = getString(R.string.tomate_verde_1kg)
            val ingredient3: String = getString(R.string.cebolla)
            val ingredient4: String = getString(R.string.chiles_serranos_2)
            val ingredient5: String = getString(R.string.manojo_cilantro_1_8)
            val ingredient6: String = getString(R.string.cebolla_blanca_picada_1)
            val ingredient7: String = getString(R.string.queso_panela_manchego_100gr)
            val ingredient8: String = getString(R.string.cucharadas_aceite_2)
            val ingredient9: String = getString(R.string.sal_pimineta_gusto)
            val ingredient10: String = getString(R.string.ajo_1)

            val preparation1: String = getString(R.string.chilaquiles_preparation)

            openChilaquilesRojosVerdesActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, ingredient9, ingredient10, preparation1)
        }
        binding.btEnfrijoladas.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_4)
            val ingredient2: String = getString(R.string.jitomate_picado_cubos_1)
            val ingredient3: String = getString(R.string.cebolla_blanca_picada_1)
            val ingredient4: String = getString(R.string.chile_cuaresmeno_jilianas_1)
            val ingredient5: String = getString(R.string.bolsa_frijoles_refritos_1)
            val ingredient6: String = getString(R.string.manojo_cilantro_1_8)
            val ingredient7: String = getString(R.string.longaniza_100gr)
            val ingredient8: String = getString(R.string.crema)
            val ingredient9: String = getString(R.string.cucharadas_aceite_2)
            val ingredient10: String = getString(R.string.agua)
            val ingredient11: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.enfrijoladas_preparation)

            openEnfrijoladasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, ingredient9, ingredient10,
                ingredient11, preparation1)
        }
        binding.btPanqueAvena.setOnClickListener {

            val ingredient1: String = getString(R.string.platano_1)
            val ingredient2: String = getString(R.string.huevo_1)
            val ingredient3: String = getString(R.string.yogurt_griego_1_3_tz)
            val ingredient4: String = getString(R.string.vainilla_cda_1)
            val ingredient5: String = getString(R.string.miel_cda)
            val ingredient6: String = getString(R.string.avena_1_3_tza)
            val ingredient7: String = getString(R.string.chispas_chocolate_50grs)

            val preparation1: String = getString(R.string.panque_avena_preparation)

            openPaqueAvenaActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, preparation1)
        }
        binding.btAvocadoToas.setOnClickListener {

            val ingredient1: String = getString(R.string.rebanas_pan_caja_2)
            val ingredient2: String = getString(R.string.aguacate)
            val ingredient3: String = getString(R.string.huevos_2)
            val ingredient4: String = getString(R.string.limon)
            val ingredient5: String = getString(R.string.jitomate_1)
            val ingredient6: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.avocado_toas_preparation)

            openAvocadoToasActrivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, preparation1)
        }
        binding.btOmurice.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.cebolla_cambray_1)
            val ingredient3: String = getString(R.string.mantequilla_cda_1)
            val ingredient4: String = getString(R.string.taza_arroz_vapor_1_2)
            val ingredient5: String = getString(R.string.agua)
            val ingredient6: String = getString(R.string.catsup)
            val ingredient7: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.omurice_preparation)

            openOmuriceActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, preparation1)
        }
        binding.btOmeletteEspinacas.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.leche_10ml)
            val ingredient3: String = getString(R.string.manojo_espinacas)
            val ingredient4: String = getString(R.string.queso_manchego_cabra)
            val ingredient5: String = getString(R.string.jamon)
            val ingredient6: String = getString(R.string.mantequilla_cda_1)
            val ingredient7: String = getString(R.string.sal_pimineta_gusto)


            val substitute1: String = getString(R.string.espinacas_bolsa)

            val preparation1: String = getString(R.string.omelette_espinacas_preparation)

            openOmeletteEspinacasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, substitute1, preparation1)
        }
        binding.btOmeletteChampinones.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.leche_10ml)
            val ingredient3: String = getString(R.string.champinones_250)
            val ingredient4: String = getString(R.string.queso_manchego_2)
            val ingredient5: String = getString(R.string.cebolla_picada_1_4)
            val ingredient6: String = getString(R.string.jamon)
            val ingredient7: String = getString(R.string.mantequilla_cda_1)
            val ingredient8: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.omelette_champinones_preparation)

            openOmeletteChampinonesActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, preparation1)
        }
        binding.btHuevoSalchicha.setOnClickListener {

            val ingredient1: String = getString(R.string.huevos_2)
            val ingredient2: String = getString(R.string.leche_10ml)
            val ingredient3: String = getString(R.string.salchichas_2)
            val ingredient4: String = getString(R.string.mantequilla_cda_1)
            val ingredient5: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.huevos_salchicha_preparation)

            openHuevoSalchichaActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                preparation1)
        }
    }

    private fun openHuevoSalchichaActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                           ingredient4: String, ingredient5: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.huevo_salchicha)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openOmeletteChampinonesActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                                ingredient4: String, ingredient5: String, ingredient6: String,
                                                ingredient7: String, ingredient8: String,
                                                preparation1: String) {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.omelette_champinones)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openOmeletteEspinacasActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                              ingredient4: String, ingredient5: String, ingredient6: String,
                                              ingredient7: String, substitute1: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.omelette_espinaca)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openOmuriceActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                    ingredient4: String, ingredient5: String, ingredient6: String,
                                    ingredient7: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.omurice)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openAvocadoToasActrivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                         ingredient4: String, ingredient5: String, ingredient6: String,
                                         preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.avocado_toas)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openPaqueAvenaActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                       ingredient4: String, ingredient5: String, ingredient6: String,
                                       ingredient7: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.panke_avena)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openEnfrijoladasActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                         ingredient4: String, ingredient5: String, ingredient6: String,
                                         ingredient7: String, ingredient8: String, ingredient9: String,
                                         ingredient10: String, ingredient11: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.enfrijoladas)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)
        intent.putExtra("ingredient_10", ingredient10)
        intent.putExtra("ingredient_11", ingredient11)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openChilaquilesRojosVerdesActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                                   ingredient4: String, ingredient5: String, ingredient6: String,
                                                   ingredient7: String, ingredient8: String, ingredient9: String,
                                                   ingredient10: String, preparation1: String) {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.chilaquiles)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)
        intent.putExtra("ingredient_10", ingredient10)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }

    private fun openHuevoSalsaJitomateAtivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                              ingredient4: String, ingredient5: String, ingredient6: String,
                                              ingredient7: String, ingredient8: String, preparation1: String,
                                              optional1: String) {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.huevos_salsa_jitomate)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_8", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional1)

        startActivity(intent)
    }

    private fun openHuevosLugoLopezActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                            ingredient4: String, ingredient5: String, ingredient6: String,
                                            ingredient7:String, ingredient8: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.huevos_amelia)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_8", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }

    private fun openHuevoTortillaJalapenoActivity() {
        startActivity(Intent(this, HuevoTortillaJalapenosActivity::class.java))
    }

    private fun openHuevoNomraActivity() {
        startActivity(Intent(this, HuevosNormaActivity::class.java))
    }

    private fun openHuevosAmeliaActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                         ingredient4: String, ingredient5: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.huevos_amelia)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openOmeletteJamonQuesoActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                               ingredient4: String, ingredient5: String, ingredient6: String,
                                               ingredient7: String, ingredient8: String, ingredient9: String,
                                                preparation1: String) {
        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.omelette_jamon_queso)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }
}