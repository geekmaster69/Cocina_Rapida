package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.cocinarapida.databinding.ActivitySopasBinding

class SopasActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySopasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySopasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btSopaFideos.setOnClickListener {

            val sop_fod_ing_1: String = getString(R.string.sal_gusto)
            val sop_fod_ing_2: String = getString(R.string.bolsa_sop_fideos)
            val sop_fod_ing_3: String = getString(R.string.aceite)
            val sop_fod_ing_4: String = getString(R.string.pure_sazonado_tetrapack)
            val sop_fod_ing_5: String = getString(R.string.caldo_pollo)

            val sop_fod_subs_1: String = getString(R.string.caldo_pollo_tp)

            val pre_sop_fideos: String = getString(R.string.prep_sop_fideos)
            openSopaFideosActivity(sop_fod_ing_1, sop_fod_ing_2, sop_fod_ing_3, sop_fod_ing_4,
                                   sop_fod_ing_5, sop_fod_subs_1, pre_sop_fideos)
        }

        binding.btCaldoPollo.setOnClickListener {

            val cal_pollo_ing_1: String = getString(R.string.piernas_pollo_4)
            val cal_pollo_ing_2: String = getString(R.string.muslos_pollo_4)
            val cal_pollo_ing_3: String = getString(R.string.zanahorias_4)
            val cal_pollo_ing_4: String = getString(R.string.chayotes_2)
            val cal_pollo_ing_5: String = getString(R.string.papas_2)
            val cal_pollo_ing_6: String = getString(R.string.brocoli)
            val cal_pollo_ing_7: String = getString(R.string.calabazas_4)
            val cal_pollo_ing_8: String = getString(R.string.cebolla)
            val cal_pollo_ing_9: String = getString(R.string.dientes_ajo_2)
            val cal_pollo_ing_10: String = getString(R.string.manojo_cilantro)
            val cal_pollo_ing_11: String = getString(R.string.sal_grano)

            val cal_pollo_subs_1: String = getString(R.string.vegetales_congelados)

            val cal_pollo_prep: String = getString(R.string.caldo_pollo_preparation)

            val cal_pollo_option: String = getString(R.string.optional_caldo_pollo)

            openCaldoPolloActivity(cal_pollo_ing_1, cal_pollo_ing_2, cal_pollo_ing_3, cal_pollo_ing_4,
                                   cal_pollo_ing_5, cal_pollo_ing_6, cal_pollo_ing_7, cal_pollo_ing_8,
                                   cal_pollo_ing_9, cal_pollo_ing_10, cal_pollo_ing_11, cal_pollo_subs_1,
                                    cal_pollo_prep, cal_pollo_option)
        }

        binding.btSopaVerdolagas.setOnClickListener {

            val ingredient1: String = getString(R.string.cucharadas_aceite_2)
            val ingredient2: String = getString(R.string.cebolla_1_4)
            val ingredient3: String = getString(R.string.ajos_2)
            val ingredient4: String = getString(R.string.verdolagas)
            val ingredient5: String = getString(R.string.papas_2)
            val ingredient6: String = getString(R.string.jitomates_3)
            val ingredient7: String = getString(R.string.tazas_caldo_pollo)
            val ingredient8: String = getString(R.string.chile_guajillo_1)
            val ingredient9: String = getString(R.string.sal_grano)

            val substitute1: String = getString(R.string.pure_tomate_tp)
            val substitute2: String = getString(R.string.caldo_pollo_tp)

            val preparation1: String = getString(R.string.sopa_verdeolagas_preparation)

            openSopaVerdolagasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                                       ingredient6, ingredient7, ingredient8, ingredient9, substitute1,
                                        substitute2, preparation1)
        }

        binding.btSopaCol.setOnClickListener {

            val ingredient1: String = getString(R.string.aceite)
            val ingredient2: String = getString(R.string.cebolla_blanca_picada_1)
            val ingredient3: String = getString(R.string.cucharada_tomillo_seco_1_2)
            val ingredient4: String = getString(R.string.oregano)
            val ingredient5: String = getString(R.string.pure_tomate_2_tazas)
            val ingredient6: String = getString(R.string.caldo_pollo_4_tazas)
            val ingredient7: String = getString(R.string.col_picada_4_tazas)
            val ingredient8: String = getString(R.string.vara_apio_1)
            val ingredient9: String = getString(R.string.zanahoria_pelada_1)
            val ingredient10: String = getString(R.string.sal_pimineta_gusto)

            val preparation1: String = getString(R.string.sopa_verdeolagas_preparation)

            openSopaColActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, ingredient9, ingredient10, preparation1)
        }
        binding.btCremaChampiOnes.setOnClickListener {

            val ingredient1: String = getString(R.string.cuadro_leche_ev_250)
            val ingredient2: String = getString(R.string.mantequilla_1_4)
            val ingredient3: String = getString(R.string.papas_medianas_4)
            val ingredient4: String = getString(R.string.champinones_250)
            val ingredient5: String = getString(R.string.tazas_agua_4)
            val ingredient6: String = getString(R.string.clado_pollo_cucharada_4)
            val ingredient7: String = getString(R.string.taza_leche)

            val substitute1: String = getString(R.string.pure_papa_des)
            val substitute2: String = getString(R.string.lata_champinones_rev)

            val preparation1: String = getString(R.string.prep_crema_champinones)

            openCremaChampinonesActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, substitute1, substitute2, preparation1)
        }
        binding.btCremaHabas.setOnClickListener {

            val ingredient1: String = getString(R.string.habas_400g)
            val ingredient2: String = getString(R.string.papa_mediana_3)
            val ingredient3: String = getString(R.string.zanahorias_2)
            val ingredient4: String = getString(R.string.cebolla)
            val ingredient5: String = getString(R.string.aceite)
            val ingredient6: String = getString(R.string.agua_1l)
            val ingredient7: String = getString(R.string.sal_pimineta_gusto)
            val ingredient8: String = getString(R.string.caldo_pollo_polvo_1cda)

            val substitute1: String = getString(R.string.pure_papa_dht)

            val preparation1: String = getString(R.string.crema_habas_preparation)

            openCremaHabasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, substitute1, preparation1 )
        }
        binding.btSopaPoro.setOnClickListener {


            val ingredient1: String = getString(R.string.papas_medianas_3)
            val ingredient2: String = getString(R.string.aceite_oliva_cda)
            val ingredient3: String = getString(R.string.poro_rodajas_1)
            val ingredient4: String = getString(R.string.jitomates_2)
            val ingredient5: String = getString(R.string.ajo_1)
            val ingredient6: String = getString(R.string.caldo_pollo_1_1_2)
            val ingredient7: String = getString(R.string.sal_pimineta_gusto)

            val substitute1: String = getString(R.string.caldo_pollo_tp)
            val substitute2: String = getString(R.string.pure_tomate_tp)

            val preparation1: String = getString(R.string.sopa_poro_preparation)

            val optional1: String = getString(R.string.sopa_poro_options)

            openSopaPoroActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                                 ingredient6, ingredient7, substitute1, substitute2, preparation1,
                                 optional1)
        }
        binding.btCremaEspinacas.setOnClickListener {


            val ingredient1: String = getString(R.string.manojo_espinacas)
            val ingredient2: String = getString(R.string.leche_evaporada_250ml)
            val ingredient3: String = getString(R.string.papas_medianas_3)
            val ingredient4: String = getString(R.string.taza_leche_1)
            val ingredient5: String = getString(R.string.caldo_pollo_1_2l)
            val ingredient6: String = getString(R.string.caldo_pollo_polvo_1_2_cda)
            val ingredient7: String = getString(R.string.mantequilla_2_cda)

            val substitute1: String = getString(R.string.espinacas_bolsa)
            val substitute2: String = getString(R.string.caldo_pollo_tp)
            val substitute3: String = getString(R.string.pure_papa_dht)

            val preparation1: String = getString(R.string.crema_espinacas_preparation)


            openCremaEspinacasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                                       ingredient6, ingredient7, substitute1, substitute2, substitute3,
                                        preparation1)
        }
        binding.btCremaVerduras.setOnClickListener {

            val ingredient1: String = getString(R.string.mezcla_verduras_500g)
            val ingredient2: String = getString(R.string.caldo_pollo_1_2l)
            val ingredient3: String = getString(R.string.leche_evaporada_250ml)
            val ingredient4: String = getString(R.string.papas_medianas_3)
            val ingredient5: String = getString(R.string.cebolla_1_4)
            val ingredient6: String = getString(R.string.ajo_1)

            val substitute1: String = getString(R.string.mezcla_verduras_congeladas)
            val substitute2: String = getString(R.string.caldo_pollo_tp)
            val substitute3: String = getString(R.string.pure_papa_dht)

            val preparation1: String = getString(R.string.crema_verduras_preparation)

            openCremaVerdurasActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                                      ingredient6, substitute1, substitute2, substitute3, preparation1)
        }
        binding.btCaldoTalpeno.setOnClickListener {

            val ingredient1: String = getString(R.string.piernas_pollo_sin_piel_2)
            val ingredient2: String = getString(R.string.muslos_pollo_sin_piel_2)
            val ingredient3: String = getString(R.string.pechuga_pollo_sin_piel)
            val ingredient4: String = getString(R.string.cebolla_1_4)
            val ingredient5: String = getString(R.string.ajo_1)
            val ingredient6: String = getString(R.string.agua_2l)
            val ingredient7: String = getString(R.string.sal_grano)
            val ingredient8: String = getString(R.string.pure_tomate_tp)
            val ingredient9: String = getString(R.string.chile_chipotle_lata_1)
            val ingredient10: String = getString(R.string.manojo_epazote)
            val ingredient11: String = getString(R.string.zanahorias_4)
            val ingredient12: String = getString(R.string.papas_medianas_3)
            val ingredient13: String = getString(R.string.ejotes_cocidos_250g)
            val ingredient14: String = getString(R.string.garbanzos_cocidos_250g)

            val substitute1: String = getString(R.string.garbanzos_lata)
            val substitute2: String = getString(R.string.zanahorias_papas_lata)

            val preparation1: String = getString(R.string.caldo_tlalpeño_preparation)

            val optional1: String = getString(R.string.tortillas)
            val optional2: String = getString(R.string.queso_panela)
            val optional3: String = getString(R.string.aguacate)

            openCladoTlalpenoActivity()
        }




    }

    private fun openCladoTlalpenoActivity() {
        startActivity(Intent(this, CaldoTlalpenoActivity::class.java))
    }

    private fun openCremaVerdurasActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                          ingredient4: String, ingredient5: String, ingredient6: String,
                                          substitute1: String, substitute2: String, substitute3: String,
                                          preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.crema_verduras)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)
        intent.putExtra("sustituto_3", substitute3)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openCremaEspinacasActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                           ingredient4: String, ingredient5: String, ingredient6: String,
                                           ingredient7: String, substitute1: String, substitute2: String,
                                            substitute3: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)


        intent.putExtra("img_top_recipe", R.drawable.crema_espinacas)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)
        intent.putExtra("sustituto_3", substitute3)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }

    private fun openSopaPoroActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                     ingredient4: String, ingredient5: String, ingredient6: String,
                                     ingredient7: String, substitute1: String, substitute2: String,
                                      preparation1: String, optional: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.sopa_poro)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional)

        startActivity(intent)

    }

    private fun openCremaHabasActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                       ingredient4: String, ingredient5: String, ingredient6: String, ingredient7: String,
                                       ingredient8: String, substitute1: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.crema_habas)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)

        intent.putExtra("sustituto_1", substitute1)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }

    private fun openCremaChampinonesActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                             ingredient4: String, ingredient5: String, ingredient6: String, ingredient7: String,
                                             substitute1: String, substitute2: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("img_top_recipe", R.drawable.crema_champinones)

        startActivity(intent)
    }

    private fun openSopaColActivity(ingredient1: String,ingredient2: String,ingredient3: String,
                                    ingredient4: String,ingredient5: String,ingredient6: String,
                                    ingredient7: String,ingredient8: String,ingredient9: String,
                                    ingredient10: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.sopa_col_tomate)

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

    private fun openSopaVerdolagasActivity(ingredient1: String,ingredient2: String,ingredient3: String,
                                           ingredient4: String,ingredient5: String,ingredient6: String,
                                           ingredient7: String,ingredient8: String,ingredient9: String,
                                           substitute1: String, substitute2: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.sopa_verdolagas)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)

        intent.putExtra("preparation1", preparation1)

        startActivity(intent)
    }

    private fun openCaldoPolloActivity(cal_pollo_ing_1: String, cal_pollo_ing_2: String, cal_pollo_ing_3: String,
                                       cal_pollo_ing_4: String, cal_pollo_ing_5: String, cal_pollo_ing_6: String,
                                       cal_pollo_ing_7: String, cal_pollo_ing_8: String, cal_pollo_ing_9: String,
                                       cal_pollo_ing_10: String, cal_pollo_ing_11: String, cal_pollo_subs_1: String,
                                       cal_pollo_prep: String, cal_pollo_option: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.caldo_pollo_2)

        intent.putExtra("ingredient_1", cal_pollo_ing_1)
        intent.putExtra("ingredient_2", cal_pollo_ing_2)
        intent.putExtra("ingredient_3", cal_pollo_ing_3)
        intent.putExtra("ingredient_4", cal_pollo_ing_4)
        intent.putExtra("ingredient_5", cal_pollo_ing_5)
        intent.putExtra("ingredient_6", cal_pollo_ing_6)
        intent.putExtra("ingredient_7", cal_pollo_ing_7)
        intent.putExtra("ingredient_8", cal_pollo_ing_8)
        intent.putExtra("ingredient_9", cal_pollo_ing_9)
        intent.putExtra("ingredient_10", cal_pollo_ing_10)
        intent.putExtra("ingredient_11", cal_pollo_ing_11)

        intent.putExtra("sustituto_1", cal_pollo_subs_1)

        intent.putExtra("preparation1", cal_pollo_prep)

        intent.putExtra("optional_1", cal_pollo_option)

        startActivity(intent)
    }

    private fun openSopaFideosActivity(sop_fod_ing_1: String,sop_fod_ing_2: String,sop_fod_ing_3:
                                        String,sop_fod_ing_4: String,sop_fod_ing_5: String,
                                       sop_fod_subs_1: String, pre_sop_fideos: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.sopa_fideos)

        intent.putExtra("ingredient_1", sop_fod_ing_1)
        intent.putExtra("ingredient_2", sop_fod_ing_2)
        intent.putExtra("ingredient_3", sop_fod_ing_3)
        intent.putExtra("ingredient_4", sop_fod_ing_4)
        intent.putExtra("ingredient_5", sop_fod_ing_5)

        intent.putExtra("sustituto_1", sop_fod_subs_1)

        intent.putExtra("preparation1", pre_sop_fideos)

        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}