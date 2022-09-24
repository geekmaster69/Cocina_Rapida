package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityDesayunosBinding

class DesayunosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDesayunosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btOmeletteJamonQueso.setOnClickListener {

            val title = getString(R.string.title_omelette_jamon_queso)

            val image = R.drawable.omelette_jamon_queso

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val ingredientList = arrayOf(
                getString(R.string.huevos_2),
                getString(R.string.rebanada_pechuga_pollo_rostizada),
                getString(R.string.queso_manchego_2),
                getString(R.string.rebanada_jitomate_bola_3),
                getString(R.string.rebanada_aguacate_3),
                getString(R.string.sal_grano_cda_1_2),
                getString(R.string.aceite_canola_cda),
                getString(R.string.mantequilla_cda_1_2),
                getString(R.string.sal_pimineta_gusto))

            val preparation: String = getString(R.string.omelette_jamon_queso_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoAmelia.setOnClickListener {

            val title = getString(R.string.title_huevos_estilo_amelia)

            val image = R.drawable.huevos_amelia

            val ingredientList = arrayOf(getString(R.string.huevos_2),getString(R.string.rebanas_pan_caja_2),
                getString(R.string.sal_pimineta_gusto),getString(R.string.mantequilla),getString(R.string.miel_abeja))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))


            val preparation: String = getString(R.string.huevos_amelia_preparation)


            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoNorma.setOnClickListener {

        }
        binding.btHuevoTortillaJalapeO.setOnClickListener {

        }
        binding.btHuevoLugoLopez.setOnClickListener {

            val title = getString(R.string.title_huevos_lugo_lopez)

            val image = R.drawable.huevos_lugo_lopez

            val ingredientList = arrayOf(getString(R.string.huevos_4),getString(R.string.cebolla_blanca_picada_1),
                getString(R.string.jitomate_picado_cubos_1),getString(R.string.papa_cortada_cubos_1),
                getString(R.string.rebanadas_jamon_triangulos_2),getString(R.string.queso_oaxaca_20g),
                getString(R.string.aceite_cda_5),getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.huevos_kuego_lopez_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoSalsaJitomate.setOnClickListener {

            val title = getString(R.string.title_huevos_salsa_jitomate)

            val image = R.drawable.huevos_salsa_jitomate

            val ingredientList = arrayOf(getString(R.string.huevos_4),getString(R.string.jitomates_cortados_4_3),
                getString(R.string.cebolla_1_4),getString(R.string.ajo_1),getString(R.string.manojo_cilantro_1_8),
                getString(R.string.cucharadas_aceite_2),getString(R.string.agua_50ml),getString(R.string.mantequilla_2_cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.chiles_serranos_2))

            val preparation: String = getString(R.string.huevos_salsa_jitomate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btChilaquilesRojosVerdes.setOnClickListener {

            val title = getString(R.string.title_chilaquiles_rojos_verdes)

            val image = R.drawable.chilaquiles

            val ingredientList = arrayOf(getString(R.string.totopos_500gr),getString(R.string.tomate_verde_1kg),
                getString(R.string.cebolla),getString(R.string.chiles_serranos_2),getString(R.string.manojo_cilantro_1_8),
                getString(R.string.cebolla_blanca_picada_1),getString(R.string.queso_panela_manchego_100gr),
                getString(R.string.cucharadas_aceite_2),getString(R.string.sal_pimineta_gusto),getString(R.string.ajo_1))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.chilaquiles_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btEnfrijoladas.setOnClickListener {

            val title = getString(R.string.title_enfrijoladas)

            val image = R.drawable.enfrijoladas

            val ingredientList = arrayOf(getString(R.string.huevos_4),getString(R.string.jitomate_picado_cubos_1),
                getString(R.string.cebolla_blanca_picada_1),getString(R.string.chile_cuaresmeno_jilianas_1),
                getString(R.string.bolsa_frijoles_refritos_1),getString(R.string.manojo_cilantro_1_8),
                getString(R.string.longaniza_100gr),getString(R.string.crema),getString(R.string.cucharadas_aceite_2),
                getString(R.string.agua),getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.enfrijoladas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btAvocadoToas.setOnClickListener {

            val title = getString(R.string.title_avocado_toast)

            val image = R.drawable.avocado_toas

            val ingredientList = arrayOf(
                getString(R.string.rebanas_pan_caja_2),
                getString(R.string.blanco_integral_centeno),
                getString(R.string.aguacate),
                getString(R.string.huevos_2),
                getString(R.string.limon),
                getString(R.string.jitomate_1),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.avocado_toas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmurice.setOnClickListener {

            val title = getString(R.string.title_omurice)

            val image = R.drawable.omurice

            val ingredientList = arrayOf(
                getString(R.string.huevos_2),
                getString(R.string.cebolla_cambray_1),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.taza_arroz_vapor_1_2),
                getString(R.string.preferencia),
                getString(R.string.agua),
                getString(R.string.catsup),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.omurice_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmeletteEspinacas.setOnClickListener {

            val title = getString(R.string.title_omelette_espinacas)

            val image = R.drawable.omelette_espinaca

            val ingredientList = arrayOf(
                getString(R.string.huevos_2),
                getString(R.string.leche_10ml),
                getString(R.string.manojo_espinacas),
                getString(R.string.queso_manchego_cabra),
                getString(R.string.jamon),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(
                getString(R.string.espinacas_bolsa),
            )

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.omelette_espinacas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmeletteChampinones.setOnClickListener {

            val title = getString(R.string.title_omelette_champinones)

            val image = R.drawable.omelette_champinones

            val ingredientList = arrayOf(
                getString(R.string.huevos_2),
                getString(R.string.leche_10ml),
                getString(R.string.champinones_250),
                getString(R.string.queso_manchego_2),
                getString(R.string.cebolla_picada_1_4),
                getString(R.string.jamon),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.lata_champinones_rev))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.omelette_champinones_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoSalchicha.setOnClickListener {
            val title = getString(R.string.title_huevo_salchicha)

            val image = R.drawable.huevo_salchicha

            val ingredientList = arrayOf(
                getString(R.string.huevos_2),
                getString(R.string.leche_10ml),
                getString(R.string.salchichas_2),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.catsup),
                getString(R.string.tortillas))

            val preparation: String = getString(R.string.huevos_salchicha_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
    }

    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: Array<String>,
                                           substitutesList: Array<String>, optionsList: Array<String>,
                                           preparation: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)
        intent.putExtra("ingredientsList", ingredientList )
        intent.putExtra("substitutesList", substitutesList)
        intent.putExtra("optionList", optionsList )
        intent.putExtra("preparation", preparation)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}