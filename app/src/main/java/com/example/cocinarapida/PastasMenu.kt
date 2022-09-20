package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityPastasMenuBinding

class PastasMenu : AppCompatActivity() {
    private lateinit var binding: ActivityPastasMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastasMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btPastaCamaronBlanco.setOnClickListener {

            val title = getString(R.string.title_spaghetti_camarones_salsa_blanca)
            val image = R.drawable.spaghetti_camarones

            val ingredientList = arrayOf(
                getString(R.string.camarones_precosidos_300grs),
                getString(R.string.sal_pimineta_gusto),
                getString(R.string.ajo_1),
                getString(R.string.mantequilla),
                getString(R.string.crema),
                getString(R.string.agua),
                getString(R.string.pasta_espagueti),
                getString(R.string.queso_parmesano),
                getString(R.string.perejil))

            val substitutesList = arrayOf(
                getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.no_optios))

            val preparation = getString(R.string.pasta_camarones_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPastaTomateAlbahaca.setOnClickListener {

            val title = getString(R.string.title_spaghetti_salsa_tomate_albahaca)

            val image = R.drawable.spaghetti_albahaca

            val ingredientList = arrayOf(
                getString(R.string.jitomate_bola_3),
                getString(R.string.manojo_albahaca_1),
                getString(R.string.ajos_picados_4),
                getString(R.string.sal_grano),
                getString(R.string.pimienta),
                getString(R.string.queso_parmesano))

            val substitutesList = arrayOf(
                getString(R.string.substitute_pasta_albahaca_1),
                getString(R.string.pasta_albahaca_substitute_1),
                getString(R.string.pasta_albahaca_subtitute_3))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.pasta_albahaca_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }
        binding.btPastaSalsaPesto.setOnClickListener {

            val title = getString(R.string.title_spaghetti_salsa_pesto)

            val image = R.drawable.spaghetti_pesto

            val ingredientList = arrayOf(
                getString(R.string.manojo_albahaca_1),
                getString(R.string.queso_parmesano_cda),
                getString(R.string.ajo_1),
                getString(R.string.aceite_oliva_1_2_tza),
                getString(R.string.nueces_1_4_tza),
                getString(R.string.sal_gusto),
                getString(R.string.spaghetti_500g))

            val substitutesList = arrayOf(
                getString(R.string.spaghetti_pesto_substitute))

            val optionsList = arrayOf(
                getString(R.string.pan_con_mantequilla),
                getString(R.string.ensalada_campesina))

            val preparation = getString(R.string.spaghetti_pesto_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiCremaAguacate.setOnClickListener {

            val title = getString(R.string.title_spaghetti_crema_aguacate)

            val image = R.drawable.spaghetti_aguacate

            val ingredientList = arrayOf(
                getString(R.string.spaghetti_500g),
                getString(R.string.cacahuates_1_3_tza),
                getString(R.string.mente_fresca_tza_1),
                getString(R.string.perejil_1_2_tza),
                getString(R.string.cilantro_1_2_tza),
                getString(R.string.ajo_1),
                getString(R.string.limones_3),
                getString(R.string.aguacates_grandes_1_1_2),
                getString(R.string.aceite_oliva_1_4_tza),
                getString(R.string.agua_coccion_pasta))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.pechuga_asada),
                getString(R.string.queso_parmesano))

            val preparation = getString(R.string.spaghetti_crema_aguacate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiPimientosCremoso.setOnClickListener {

            val title = getString(R.string.title_spaghetti_pimiento_rojo_cremoso)

            val image = R.drawable.spaghetti_pimiento

            val ingredientList = arrayOf(
                getString(R.string.spaghetti_500g),
                getString(R.string.lata_chile_morron_1),
                getString(R.string.cubo_caldo_pollo_1),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.lata_media_crema_1),
                getString(R.string.leche_10ml),
                getString(R.string.limones_3))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.pechuga_asada),
                getString(R.string.pan_con_mantequilla),
                getString(R.string.ensalada_campesina))

            val preparation = getString(R.string.spaghetti_pimiento_cremoso_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiRojoCremoso.setOnClickListener {

            val title = getString(R.string.title_spaghetti_rojo_cremoso)

            val image = R.drawable.spaghetti_cremoso

            val ingredientList = arrayOf(
                getString(R.string.spaghetti_500g),
                getString(R.string.jitomate_rebanado_sin_semilla_6),
                getString(R.string.cucharadas_aceite_2),
                getString(R.string.sal_gusto),
                getString(R.string.hierbas_finas_cda_1),
                getString(R.string.pimienta_negra_molida_1_4_cda),
                getString(R.string.leche_evaporada_250ml),
                getString(R.string.cubo_caldo_pollo_1))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.pechuga_asada),
                getString(R.string.albondigas),
                getString(R.string.ensalada_campesina))

            val preparation = getString(R.string.spaghetti_rojo_cremoso_preparation)

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