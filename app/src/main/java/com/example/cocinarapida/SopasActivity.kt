package com.example.cocinarapida

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.cocinarapida.databinding.ActivitySopasBinding
import java.io.Serializable
import java.util.ArrayList

class SopasActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySopasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySopasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btSopaFideos.setOnClickListener {

            val title = getString(R.string.title_sopa_fideos)

            val image = R.drawable.sopa_fideos

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.sal_gusto)),
                Ingredient(getString(R.string.bolsa_sop_fideos)),
                Ingredient(getString(R.string.aceite)),
                Ingredient(getString(R.string.pure_sazonado_tetrapack)),
                Ingredient(getString(R.string.caldo_pollo)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.caldo_pollo_tp)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.prep_sop_fideos)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)

        }

        binding.btCaldoPollo.setOnClickListener {

            val title = getString(R.string.title_caldo_pollo)

            val image = R.drawable.sopa_fideos

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.piernas_pollo_4)),
                Ingredient(getString(R.string.muslos_pollo_4)),
                Ingredient(getString(R.string.zanahorias_4)),
                Ingredient(getString(R.string.chayotes_2)),
                Ingredient(getString(R.string.papas_2)),
                Ingredient(getString(R.string.brocoli)),
                Ingredient(getString(R.string.calabazas_4)),
                Ingredient(getString(R.string.cebolla)),
                Ingredient(getString(R.string.dientes_ajo_2)),
                Ingredient(getString(R.string.manojo_cilantro)),
                Ingredient(getString(R.string.sal_grano)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.vegetales_congelados)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.aguacate_1)),
                Ingredient(getString(R.string.salsa_fav)),
                Ingredient(getString(R.string.queso_panela)),
                Ingredient(getString(R.string.tortillas)))

            val preparation = getString(R.string.caldo_pollo_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

        binding.btSopaVerdolagas.setOnClickListener {

            val title = getString(R.string.title_sopa_verdolagas)

            val image = R.drawable.sopa_verdolagas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.cucharadas_aceite_2)),
                Ingredient(getString(R.string.cebolla_1_4)),
                Ingredient(getString(R.string.ajos_2)),
                Ingredient(getString(R.string.verdolagas)),
                Ingredient(getString(R.string.papas_2)),
                Ingredient(getString(R.string.jitomates_3)),
                Ingredient(getString(R.string.tazas_caldo_pollo)),
                Ingredient(getString(R.string.chile_guajillo_1)),
                Ingredient(getString(R.string.dientes_ajo_2)),
                Ingredient(getString(R.string.sal_grano)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.pure_tomate_tp)),
                Ingredient(getString(R.string.caldo_pollo_tp)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.sopa_verdeolagas_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

        binding.btSopaCol.setOnClickListener {

            val title = getString(R.string.title_sopa_col_tomate)

            val image = R.drawable.sopa_col_tomate

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.aceite)),
                Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                Ingredient(getString(R.string.cucharada_tomillo_seco_1_2)),
                Ingredient(getString(R.string.oregano)),
                Ingredient(getString(R.string.pure_tomate_2_tazas)),
                Ingredient(getString(R.string.caldo_pollo_4_tazas)),
                Ingredient(getString(R.string.col_picada_4_tazas)),
                Ingredient(getString(R.string.vara_apio_1)),
                Ingredient(getString(R.string.zanahoria_pelada_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.sopa_col_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

        binding.btCremaChampiOnes.setOnClickListener {

            val title = getString(R.string.title_crema_champinones)

            val image = R.drawable.crema_champinones

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.cuadro_leche_ev_250)),
                Ingredient(getString(R.string.mantequilla_1_4)),
                Ingredient(getString(R.string.papas_medianas_4)),
                Ingredient(getString(R.string.champinones_250)),
                Ingredient(getString(R.string.tazas_agua_4)),
                Ingredient(getString(R.string.clado_pollo_cucharada_4)),
                Ingredient(getString(R.string.taza_leche)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.pure_papa_des)),
                Ingredient(getString(R.string.lata_champinones_rev)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.crema_champinones_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }
        binding.btCremaHabas.setOnClickListener {

            val title = getString(R.string.title_crema_habas)

            val image = R.drawable.crema_habas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.habas_400g)),
                Ingredient(getString(R.string.papa_mediana_3)),
                Ingredient(getString(R.string.zanahorias_2)),
                Ingredient(getString(R.string.cebolla)),
                Ingredient(getString(R.string.aceite)),
                Ingredient(getString(R.string.agua_1l)),
                Ingredient(getString(R.string.sal_pimineta_gusto)),
                Ingredient(getString(R.string.caldo_pollo_polvo_1cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.pure_papa_des)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pan_tostadas_crutones)))

            val preparation = getString(R.string.crema_habas_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }
        binding.btSopaPoro.setOnClickListener {

            val title = getString(R.string.title_sopa_poro)

            val image = R.drawable.sopa_poro

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.papas_medianas_3)),
                Ingredient(getString(R.string.aceite_oliva_cda)),
                Ingredient(getString(R.string.poro_rodajas_1)),
                Ingredient(getString(R.string.jitomates_2)),
                Ingredient(getString(R.string.ajo_1)),
                Ingredient(getString(R.string.caldo_pollo_1_1_2)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.caldo_pollo_tp)),
                Ingredient(getString(R.string.pure_tomate_tp)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.rebanada_aguacate_3)))

            val preparation = getString(R.string.sopa_poro_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }
        binding.btCremaEspinacas.setOnClickListener {

            val title = getString(R.string.title_crema_espinacas)

            val image = R.drawable.crema_espinacas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.manojo_espinacas)),
                Ingredient(getString(R.string.leche_evaporada_250ml)),
                Ingredient(getString(R.string.papas_medianas_3)),
                Ingredient(getString(R.string.taza_leche_1)),
                Ingredient(getString(R.string.caldo_pollo_1_2l)),
                Ingredient(getString(R.string.caldo_pollo_polvo_1_2_cda)),
                Ingredient(getString(R.string.mantequilla_2_cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.espinacas_bolsa)),
                Ingredient(getString(R.string.caldo_pollo_tp)),
                Ingredient(getString(R.string.pure_papa_dht)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.crema_espinacas_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

        binding.btCremaVerduras.setOnClickListener {

            val title = getString(R.string.title_crema_verduras)

            val image = R.drawable.crema_verduras

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.mezcla_verduras_500g)),
                Ingredient(getString(R.string.caldo_pollo_1_2l)),
                Ingredient(getString(R.string.leche_evaporada_250ml)),
                Ingredient(getString(R.string.papas_medianas_3)),
                Ingredient(getString(R.string.cebolla_1_4)),
                Ingredient(getString(R.string.ajo_1)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.mezcla_verduras_congeladas)),
                Ingredient(getString(R.string.caldo_pollo_tp)),
                Ingredient(getString(R.string.pure_papa_dht)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.crema_verduras_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

        binding.btCaldoTalpeno.setOnClickListener {
            val title = getString(R.string.title_crema_verduras)

            val image = R.drawable.caldo_tlalpeno

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.piernas_pollo_sin_piel_2)),
                Ingredient(getString(R.string.muslos_pollo_sin_piel_2)),
                Ingredient(getString(R.string.pechuga_pollo_sin_piel)),
                Ingredient(getString(R.string.cebolla_1_4)),
                Ingredient(getString(R.string.ajo_1)),
                Ingredient(getString(R.string.agua_2l)),
                Ingredient(getString(R.string.sal_grano)),
                Ingredient(getString(R.string.pure_tomate_tp)),
                Ingredient(getString(R.string.chile_chipotle_lata_1)),
                Ingredient(getString(R.string.manojo_epazote)),
                Ingredient(getString(R.string.zanahorias_4)),
                Ingredient(getString(R.string.papas_medianas_3)),
                Ingredient(getString(R.string.ejotes_cocidos_250g)),
                Ingredient(getString(R.string.garbanzos_cocidos_250g)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.garbanzos_lata)),
                Ingredient(getString(R.string.zanahorias_papas_lata)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.tortillas)),
                Ingredient(getString(R.string.queso_panela)),
                Ingredient(getString(R.string.aguacate)))

            val preparation = getString(R.string.caldo_tlalpeño_preparation)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)

        }
        binding.btCremaCalabazasCurri.setOnClickListener {
            val title = getString(R.string.title_crema_calabazas_curri)

            val image = R.drawable.crema_espinacas

            val ingredientList = arrayListOf(
                Ingredient("1Kg de calabazitas"),
                Ingredient("1 cebolla"),
                Ingredient("1 cucharada de aceite"),
                Ingredient("2 cucharadas de curry amaraillo en polvo"),
                Ingredient("1 cubo de caldo de pollo"),
                Ingredient("150g de queso doble crema"),
                Ingredient("700ml de agua"))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes))
            )

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.preparation_crema_calabacitas_curry)

            val helpList = arrayListOf(
                Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                    getString(R.string.no_help_suggestion_description)))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }

    }
    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                           substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>,
                                           preparation: String, helpList:ArrayList<Help>) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", ingredientList as Serializable)
        intent.putExtra("BUNDLE", args)

        args.putSerializable("SubstituteList", substituteList as Serializable)
        intent.putExtra("SubstituteListBundle", args)

        args.putSerializable("OptionalList", optionsList as Serializable)
        intent.putExtra("OptionalListBundle", args)

        args.putSerializable("HelpList", helpList as Serializable)
        intent.putExtra("HelpListBundle", args)

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