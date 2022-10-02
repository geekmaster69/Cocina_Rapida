package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityDesayunosBinding
import java.io.Serializable
import java.util.ArrayList

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

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.rebanada_pechuga_pollo_rostizada)),
                Ingredient(getString(R.string.queso_manchego_2)),
                Ingredient(getString(R.string.rebanada_jitomate_bola_3)),
                Ingredient(getString(R.string.rebanada_aguacate_3)),
                Ingredient(getString(R.string.sal_grano_cda_1_2)),
                Ingredient(getString(R.string.aceite_canola_cda)),
                Ingredient(getString(R.string.mantequilla_cda_1_2)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.omelette_jamon_queso_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoAmelia.setOnClickListener {

            val title = getString(R.string.title_huevos_estilo_amelia)

            val image = R.drawable.huevos_amelia

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.rebanas_pan_caja_2)),
                Ingredient(getString(R.string.sal_pimineta_gusto)),
                Ingredient(getString(R.string.mantequilla)),
                Ingredient(getString(R.string.miel_abeja)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))


            val preparation: String = getString(R.string.huevos_amelia_preparation)


            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoLugoLopez.setOnClickListener {

            val title = getString(R.string.title_huevos_lugo_lopez)

            val image = R.drawable.huevos_lugo_lopez

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_4)),
                Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                Ingredient(getString(R.string.jitomate_picado_cubos_1)),
                Ingredient(getString(R.string.papa_cortada_cubos_1)),
                Ingredient(getString(R.string.rebanadas_jamon_triangulos_2)),
                Ingredient(getString(R.string.queso_oaxaca_20g)),
                Ingredient(getString(R.string.aceite_cda_5)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.huevos_kuego_lopez_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoSalsaJitomate.setOnClickListener {

            val title = getString(R.string.title_huevos_salsa_jitomate)

            val image = R.drawable.huevos_salsa_jitomate

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_4)),
                Ingredient(getString(R.string.jitomates_cortados_4_3)),
                Ingredient(getString(R.string.cebolla_1_4)),
                Ingredient(getString(R.string.ajo_1)),
                Ingredient(getString(R.string.manojo_cilantro_1_8)),
                Ingredient(getString(R.string.cucharadas_aceite_2)),
                Ingredient(getString(R.string.agua_50ml)),
                Ingredient(getString(R.string.mantequilla_2_cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.pure_tomate_tp)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.chiles_serranos_2)))

            val preparation: String = getString(R.string.huevos_salsa_jitomate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btChilaquilesRojosVerdes.setOnClickListener {

            val title = getString(R.string.title_chilaquiles_rojos_verdes)

            val image = R.drawable.chilaquiles

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.totopos_500gr)),
                Ingredient(getString(R.string.tomate_verde_1kg)),
                Ingredient(getString(R.string.cebolla)),
                Ingredient(getString(R.string.chiles_serranos_2)),
                Ingredient(getString(R.string.manojo_cilantro_1_8)),
                Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                Ingredient(getString(R.string.queso_panela_manchego_100gr)),
                Ingredient(getString(R.string.cucharadas_aceite_2)),
                Ingredient(getString(R.string.sal_pimineta_gusto)),
                Ingredient(getString(R.string.ajo_1)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.chilaquiles_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btEnfrijoladas.setOnClickListener {

            val title = getString(R.string.title_enfrijoladas)

            val image = R.drawable.enfrijoladas

            val ingredientList = arrayListOf(
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
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.enfrijoladas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btAvocadoToas.setOnClickListener {

            val title = getString(R.string.title_avocado_toast)

            val image = R.drawable.avocado_toas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.rebanas_pan_caja_2)),
                Ingredient(getString(R.string.blanco_integral_centeno)),
                Ingredient(getString(R.string.aguacate)),
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.limon)),
                Ingredient(getString(R.string.jitomate_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.avocado_toas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmurice.setOnClickListener {

            val title = getString(R.string.title_omurice)

            val image = R.drawable.omurice

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.cebolla_cambray_1)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.taza_arroz_vapor_1_2)),
                Ingredient(getString(R.string.agua)),
                Ingredient(getString(R.string.catsup)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.omurice_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmeletteEspinacas.setOnClickListener {

            val title = getString(R.string.title_omelette_espinacas)

            val image = R.drawable.omelette_espinaca

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.leche_10ml)),
                Ingredient(getString(R.string.manojo_espinacas)),
                Ingredient(getString(R.string.queso_manchego_cabra)),
                Ingredient(getString(R.string.jamon)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.espinacas_bolsa)),
            )

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.omelette_espinacas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btOmeletteChampinones.setOnClickListener {

            val title = getString(R.string.title_omelette_champinones)

            val image = R.drawable.omelette_champinones

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.leche_10ml)),
                Ingredient(getString(R.string.champinones_250)),
                Ingredient(getString(R.string.queso_manchego_2)),
                Ingredient(getString(R.string.cebolla_picada_1_4)),
                Ingredient(getString(R.string.jamon)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.lata_champinones_rev)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.omelette_champinones_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btHuevoSalchicha.setOnClickListener {
            val title = getString(R.string.title_huevo_salchicha)

            val image = R.drawable.huevo_salchicha

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevos_2)),
                Ingredient(getString(R.string.leche_10ml)),
                Ingredient(getString(R.string.salchichas_2)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.catsup)),
                Ingredient(getString(R.string.tortillas)))

            val preparation: String = getString(R.string.huevos_salchicha_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
    }

    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                           substitutesList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>, preparation: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", ingredientList as Serializable)
        intent.putExtra("BUNDLE", args)

        args.putSerializable("SubstituteList", substitutesList as Serializable)
        intent.putExtra("SubstituteListBundle", args)

        args.putSerializable("OptionalList", optionsList as Serializable)
        intent.putExtra("OptionalListBundle", args)

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