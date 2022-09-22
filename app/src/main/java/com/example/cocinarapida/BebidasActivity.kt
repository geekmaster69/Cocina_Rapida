package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBebidasBinding

class BebidasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBebidasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBebidasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btAguaJamaicaNatural.setOnClickListener {

            val title = getString(R.string.title_agua_jamaica_natural)

            val image = R.drawable.agua_jamaica_natural

            val ingredientList = arrayOf(
                getString(R.string.flor_jamaica_1tz),
                getString(R.string.agua_12tz),
                getString(R.string.azucar_stevia_al_gusto),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.agua_jamaica_natural_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLimonadaFrutosRojos.setOnClickListener {

            val title = getString(R.string.title_limonada_frutos_rojos)

            val image = R.drawable.agua_jamaica_natural

            val ingredientList = arrayOf(
                getString(R.string.frutos_rojos_congelados_1tz),
                getString(R.string.jugo_limon_1_4tz),
                getString(R.string.jarabe_natural_1cda),
                getString(R.string.agua_agua_mineral_1tz),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.hojas_menta))

            val preparation = getString(R.string.limonada_frutos_rojos_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteFresaTeverdes.setOnClickListener {

            val title = getString(R.string.title_latte_fresa_te_verde)

            val image = R.drawable.latte_fresa_te_verde

            val ingredientList = arrayOf(
                getString(R.string.fresas_congeladas_6pz),
                getString(R.string.azucar_1cda),
                getString(R.string.taza_leche_1),
                getString(R.string.te_verde_polvo_1cda),
                getString(R.string.agua_caliente_1_4tz),
                getString(R.string.hielo))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.fresas_frescas),
                getString(R.string.hojas_menta))

            val preparation = getString(R.string.latte_fresa_te_verde_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteCafeBaileys.setOnClickListener {

            val title = getString(R.string.title_latte_cafe_baileys)

            val image = R.drawable.cafe_baileys

            val ingredientList = arrayOf(
                getString(R.string.licor_cafe_30ml),
                getString(R.string.hielo),
                getString(R.string.baileys_30ml),
                getString(R.string.crema_leche_30ml))

            val substitutesList = arrayOf(getString(R.string.consentrado_jugo_limon))

            val optionsList = arrayOf(
                getString(R.string.crema_batida),
                getString(R.string.nuez_moscada_polvo))

            val preparation = getString(R.string.latte_cafe_baileys_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoMangoCremaCoco.setOnClickListener {

            val title = getString(R.string.title_licuado_mango_crema_coco)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayOf(
                getString(R.string.mango_1tz),
                getString(R.string.crema_coco_1tz),
                getString(R.string.yogurt_natural_1tz),
                getString(R.string.hielo),
                getString(R.string.chichitos_colores_1_2tz),
                getString(R.string.azucar_glas),
                getString(R.string.agua_1cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_mango_crema_coco_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoPinaPlatanoCoco.setOnClickListener {

            val title = getString(R.string.title_licuado_pina_platano_coco)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayOf(
                getString(R.string.ralladura_coco_1_2tz),
                getString(R.string.leche_coco_1_2tz),
                getString(R.string.pina_pelada_1_2tz),
                getString(R.string.platano_1),
                getString(R.string.azucar_4cda),
                getString(R.string.leche_1tz),
                getString(R.string.canela_molida_1cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_pina_platano_coco_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoGalletaOreoChocolate.setOnClickListener {

            val title = getString(R.string.title_licuado_oreo_chocolate)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayOf(
                getString(R.string.agua_1tz),
                getString(R.string.azucar_1_2tz),
                getString(R.string.chocolate_polvo_3_4tz),
                getString(R.string.chocolate_amargo_50g),
                getString(R.string.galletas_chocolate_6pz),
                getString(R.string.leche_1_1_2tz),
                getString(R.string.helado_vainilla_1tz))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_ore_chocolate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoDuraznoFresaPlatano.setOnClickListener {

            val title = getString(R.string.title_licuado_duraazno_fresa_platano)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayOf(
                getString(R.string.leche_2tz),
                getString(R.string.fresa_125g),
                getString(R.string.durazno_100g),
                getString(R.string.platano_1),
                getString(R.string.azucar_2cda),
                getString(R.string.naranja_jugo_1_2pz))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_durazno_fresa_platano_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoMameyNuez.setOnClickListener {

            val title = getString(R.string.title_licuado_mamey_nuez)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayOf(
                getString(R.string.mamey_1_2pz),
                getString(R.string.leche_2tz),
                getString(R.string.azucar_3cds),
                getString(R.string.nueces_1_4_tza),
                getString(R.string.canela_molida_1_2cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_mamey_nuez_preparation)

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
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}