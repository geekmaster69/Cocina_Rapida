package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBebidasBinding
import java.io.Serializable

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

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.flor_jamaica_1tz)),
                Ingredient(getString(R.string.agua_12tz)),
                Ingredient(getString(R.string.azucar_stevia_al_gusto)),
                Ingredient(getString(R.string.hielo)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.agua_jamaica_natural_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLimonadaFrutosRojos.setOnClickListener {

            val title = getString(R.string.title_limonada_frutos_rojos)

            val image = R.drawable.agua_jamaica_natural

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.frutos_rojos_congelados_1tz)),
                Ingredient(getString(R.string.jugo_limon_1_4tz)),
                Ingredient(getString(R.string.jarabe_natural_1cda)),
                Ingredient(getString(R.string.agua_agua_mineral_1tz)),
                Ingredient(getString(R.string.hielo)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(Ingredient(getString(R.string.hojas_menta)))

            val preparation = getString(R.string.limonada_frutos_rojos_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteFresaTeverdes.setOnClickListener {

            val title = getString(R.string.title_latte_fresa_te_verde)

            val image = R.drawable.latte_fresa_te_verde

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.fresas_congeladas_6pz)),
                Ingredient(getString(R.string.azucar_1cda)),
                Ingredient(getString(R.string.taza_leche_1)),
                Ingredient(getString(R.string.te_verde_polvo_1cda)),
                Ingredient(getString(R.string.agua_caliente_1_4tz)),
                Ingredient(getString(R.string.hielo)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.fresas_frescas)),
                Ingredient(getString(R.string.hojas_menta)))

            val preparation = getString(R.string.latte_fresa_te_verde_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLatteCafeBaileys.setOnClickListener {

            val title = getString(R.string.title_latte_cafe_baileys)

            val image = R.drawable.cafe_baileys

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.licor_cafe_30ml)),
                Ingredient(getString(R.string.hielo)),
                Ingredient(getString(R.string.baileys_30ml)),
                Ingredient(getString(R.string.crema_leche_30ml)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.consentrado_jugo_limon)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.crema_batida)),
                Ingredient(getString(R.string.nuez_moscada_polvo)))

            val preparation = getString(R.string.latte_cafe_baileys_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }




        binding.btLicuadoPinaPlatanoCoco.setOnClickListener {

            val title = getString(R.string.title_licuado_pina_platano_coco)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.ralladura_coco_1_2tz)),
                Ingredient(getString(R.string.leche_coco_1_2tz)),
                Ingredient(getString(R.string.pina_pelada_1_2tz)),
                Ingredient(getString(R.string.platano_1)),
                Ingredient(getString(R.string.azucar_4cda)),
                Ingredient(getString(R.string.leche_1tz)),
                Ingredient(getString(R.string.canela_molida_1cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.licuado_pina_platano_coco_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoGalletaOreoChocolate.setOnClickListener {

            val title = getString(R.string.title_licuado_oreo_chocolate)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayListOf(

                Ingredient(getString(R.string.chocolate_liquido)),
                Ingredient(getString(R.string.galletas_chocolate_6pz)),
                Ingredient(getString(R.string.leche_1_1_2tz)),
                Ingredient(getString(R.string.helado_vainilla_1tz)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.licuado_ore_chocolate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoDuraznoFresaPlatano.setOnClickListener {

            val title = getString(R.string.title_licuado_duraazno_fresa_platano)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.leche_2tz)),
                Ingredient(getString(R.string.fresa_125g)),
                Ingredient(getString(R.string.durazno_100g)),
                Ingredient(getString(R.string.platano_1)),
                Ingredient(getString(R.string.azucar_2cda)),
                Ingredient(getString(R.string.naranja_jugo_1_2pz)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.licuado_durazno_fresa_platano_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btLicuadoMameyNuez.setOnClickListener {

            val title = getString(R.string.title_licuado_mamey_nuez)

            val image = R.drawable.licuado_mango_crema_coco

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.mamey_1_2pz)),
                Ingredient(getString(R.string.leche_2tz)),
                Ingredient(getString(R.string.azucar_3cds)),
                Ingredient(getString(R.string.nueces_1_4_tza)),
                Ingredient(getString(R.string.canela_molida_1_2cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation: String = getString(R.string.licuado_mamey_nuez_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
    }

    fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                   substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>,
                                   preparation: String) {

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