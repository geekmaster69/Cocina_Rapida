package com.example.cocinarapida

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.cocinarapida.databinding.ActivitySopasBinding

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

            val ingredientList = arrayOf(
                getString(R.string.sal_gusto),
                getString(R.string.bolsa_sop_fideos),
                getString(R.string.aceite),
                getString(R.string.pure_sazonado_tetrapack),
                getString(R.string.caldo_pollo))

            val substitutesList = arrayOf(getString(R.string.caldo_pollo_tp))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.prep_sop_fideos)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }

        binding.btCaldoPollo.setOnClickListener {

            val title = getString(R.string.title_caldo_pollo)

            val image = R.drawable.sopa_fideos

            val ingredientList = arrayOf(
                getString(R.string.piernas_pollo_4),
                getString(R.string.muslos_pollo_4),
                getString(R.string.zanahorias_4),
                getString(R.string.chayotes_2),
                getString(R.string.papas_2),
                getString(R.string.brocoli),
                getString(R.string.calabazas_4),
                getString(R.string.cebolla),
                getString(R.string.dientes_ajo_2),
                getString(R.string.manojo_cilantro),
                getString(R.string.sal_grano))

            val substitutesList = arrayOf(getString(R.string.vegetales_congelados))

            val optionsList = arrayOf(
                getString(R.string.aguacate_1),
                getString(R.string.salsa_fav),
                getString(R.string.queso_panela),
                getString(R.string.tortillas))

            val preparation = getString(R.string.caldo_pollo_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSopaVerdolagas.setOnClickListener {

            val title = getString(R.string.title_sopa_verdolagas)

            val image = R.drawable.sopa_verdolagas

            val ingredientList = arrayOf(
                getString(R.string.cucharadas_aceite_2),
                getString(R.string.cebolla_1_4),
                getString(R.string.ajos_2),
                getString(R.string.verdolagas),
                getString(R.string.papas_2),
                getString(R.string.jitomates_3),
                getString(R.string.tazas_caldo_pollo),
                getString(R.string.chile_guajillo_1),
                getString(R.string.dientes_ajo_2),
                getString(R.string.sal_grano)
            )

            val substitutesList = arrayOf(
                getString(R.string.pure_tomate_tp),
                getString(R.string.caldo_pollo_tp)
            )

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.sopa_verdeolagas_preparation)

            starRecipeTemplateActivity(
                title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSopaCol.setOnClickListener {

            val title = getString(R.string.title_sopa_col_tomate)

            val image = R.drawable.sopa_col_tomate

            val ingredientList = arrayOf(
                getString(R.string.aceite),
                getString(R.string.cebolla_blanca_picada_1),
                getString(R.string.cucharada_tomillo_seco_1_2),
                getString(R.string.oregano),
                getString(R.string.pure_tomate_2_tazas),
                getString(R.string.caldo_pollo_4_tazas),
                getString(R.string.col_picada_4_tazas),
                getString(R.string.vara_apio_1),
                getString(R.string.zanahoria_pelada_1),
                getString(R.string.sal_pimineta_gusto))

            val substitutesList = arrayOf(
                getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.sopa_col_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCremaChampiOnes.setOnClickListener {

            val title = getString(R.string.title_crema_champinones)

            val image = R.drawable.crema_champinones

            val ingredientList = arrayOf(
                getString(R.string.cuadro_leche_ev_250),
                getString(R.string.mantequilla_1_4),
                getString(R.string.papas_medianas_4),
                getString(R.string.champinones_250),
                getString(R.string.tazas_agua_4),
                getString(R.string.clado_pollo_cucharada_4),
                getString(R.string.taza_leche))

            val substitutesList = arrayOf(
                getString(R.string.pure_papa_des),
                getString(R.string.lata_champinones_rev))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.crema_champinones_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
        binding.btCremaHabas.setOnClickListener {

            val title = getString(R.string.title_crema_habas)

            val image = R.drawable.crema_habas

            val ingredientList = arrayOf(
                getString(R.string.habas_400g),
                getString(R.string.papa_mediana_3),
                getString(R.string.zanahorias_2),
                getString(R.string.cebolla),
                getString(R.string.aceite),
                getString(R.string.agua_1l),
                getString(R.string.sal_pimineta_gusto),
                getString(R.string.caldo_pollo_polvo_1cda))

            val substitutesList = arrayOf(
                getString(R.string.pure_papa_des))

            val optionsList = arrayOf(getString(R.string.pan_tostadas_crutones))

            val preparation = getString(R.string.crema_habas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
        binding.btSopaPoro.setOnClickListener {

            val title = getString(R.string.title_sopa_poro)

            val image = R.drawable.sopa_poro

            val ingredientList = arrayOf(
                getString(R.string.papas_medianas_3),
                getString(R.string.aceite_oliva_cda),
                getString(R.string.poro_rodajas_1),
                getString(R.string.jitomates_2),
                getString(R.string.ajo_1),
                getString(R.string.caldo_pollo_1_1_2))

            val substitutesList = arrayOf(
                getString(R.string.caldo_pollo_tp),
                getString(R.string.pure_tomate_tp))

            val optionsList = arrayOf(getString(R.string.pan_tostadas_crutones))

            val preparation = getString(R.string.sopa_poro_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
        binding.btCremaEspinacas.setOnClickListener {

            val title = getString(R.string.title_crema_espinacas)

            val image = R.drawable.crema_espinacas

            val ingredientList = arrayOf(
                getString(R.string.manojo_espinacas),
                getString(R.string.leche_evaporada_250ml),
                getString(R.string.papas_medianas_3),
                getString(R.string.taza_leche_1),
                getString(R.string.caldo_pollo_1_2l),
                getString(R.string.caldo_pollo_polvo_1_2_cda),
                getString(R.string.mantequilla_2_cda))

            val substitutesList = arrayOf(
                getString(R.string.espinacas_bolsa),
                getString(R.string.caldo_pollo_tp),
                getString(R.string.pure_papa_dht))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.crema_espinacas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCremaVerduras.setOnClickListener {

            val title = getString(R.string.title_crema_verduras)

            val image = R.drawable.crema_verduras

            val ingredientList = arrayOf(
                getString(R.string.mezcla_verduras_500g),
                getString(R.string.caldo_pollo_1_2l),
                getString(R.string.leche_evaporada_250ml),
                getString(R.string.papas_medianas_3),
                getString(R.string.cebolla_1_4),
                getString(R.string.ajo_1))

            val substitutesList = arrayOf(
                getString(R.string.mezcla_verduras_congeladas),
                getString(R.string.caldo_pollo_tp),
                getString(R.string.pure_papa_dht))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.crema_verduras_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCaldoTalpeno.setOnClickListener {
            val title = getString(R.string.title_crema_verduras)

            val image = R.drawable.crema_verduras

            val ingredientList = arrayOf(
                getString(R.string.piernas_pollo_sin_piel_2),
                getString(R.string.muslos_pollo_sin_piel_2),
                getString(R.string.pechuga_pollo_sin_piel),
                getString(R.string.cebolla_1_4),
                getString(R.string.ajo_1),
                getString(R.string.agua_2l),
                getString(R.string.sal_grano),
                getString(R.string.pure_tomate_tp),
                getString(R.string.chile_chipotle_lata_1),
                getString(R.string.manojo_epazote),
                getString(R.string.zanahorias_4),
                getString(R.string.papas_medianas_3),
                getString(R.string.ejotes_cocidos_250g),
                getString(R.string.garbanzos_cocidos_250g))

            val substitutesList = arrayOf(
                getString(R.string.garbanzos_lata),
                getString(R.string.zanahorias_papas_lata))

            val optionsList = arrayOf(getString(R.string.tortillas),
                getString(R.string.queso_panela),
                getString(R.string.aguacate))

            val preparation = getString(R.string.caldo_tlalpeño_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }




    }

    fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: Array<String>,
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