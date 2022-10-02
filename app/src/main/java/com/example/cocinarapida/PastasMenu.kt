package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityPastasMenuBinding
import java.io.Serializable
import java.util.ArrayList

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

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.camarones_precosidos_300grs)),
                Ingredient(getString(R.string.sal_pimineta_gusto)),
                Ingredient(getString(R.string.ajo_cabeza_1)),
                Ingredient(getString(R.string.mantequilla)),
                Ingredient(getString(R.string.crema)),
                Ingredient(getString(R.string.agua)),
                Ingredient(getString(R.string.pasta_espagueti)),
                Ingredient(getString(R.string.queso_parmesano)),
                Ingredient(getString(R.string.perejil)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.ajos_picados_frasco)),
                Ingredient(getString(R.string.perejil_seco)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.pasta_camarones_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPastaTomateAlbahaca.setOnClickListener {

            val title = getString(R.string.title_spaghetti_salsa_tomate_albahaca)

            val image = R.drawable.spaghetti_albahaca

            val ingredientList = arrayListOf(
               Ingredient(getString(R.string.jitomate_bola_3)),
                Ingredient(getString(R.string.manojo_albahaca_1)),
                Ingredient(getString(R.string.ajos_picados_4)),
                Ingredient(getString(R.string.sal_grano)),
                Ingredient(getString(R.string.pimienta)),
                Ingredient(getString(R.string.queso_parmesano)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.substitute_pasta_albahaca_1)),
                Ingredient(getString(R.string.pasta_albahaca_substitute_1)),
                Ingredient(getString(R.string.pasta_albahaca_subtitute_3)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.pasta_albahaca_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }
        binding.btPastaSalsaPesto.setOnClickListener {

            val title = getString(R.string.title_spaghetti_salsa_pesto)

            val image = R.drawable.spaghetti_pesto

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.manojo_albahaca_1)),
                Ingredient(getString(R.string.queso_parmesano_cda)),
                Ingredient(getString(R.string.ajo_1)),
                Ingredient(getString(R.string.aceite_oliva_1_2_tza)),
                Ingredient(getString(R.string.nueces_1_4_tza)),
                Ingredient(getString(R.string.sal_gusto)),
                Ingredient(getString(R.string.spaghetti_500g)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.spaghetti_pesto_substitute)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pan_con_mantequilla)),
                Ingredient(getString(R.string.ensalada_campesina)))

            val preparation = getString(R.string.spaghetti_pesto_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiCremaAguacate.setOnClickListener {

            val title = getString(R.string.title_spaghetti_crema_aguacate)

            val image = R.drawable.spaghetti_aguacate

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.spaghetti_500g)),
                Ingredient(getString(R.string.cacahuates_1_3_tza)),
                Ingredient(getString(R.string.mente_fresca_tza_1)),
                Ingredient(getString(R.string.perejil_1_2_tza)),
                Ingredient(getString(R.string.cilantro_1_2_tza)),
                Ingredient(getString(R.string.ajo_1)),
                Ingredient(getString(R.string.limones_3)),
                Ingredient(getString(R.string.aguacates_grandes_1_1_2)),
                Ingredient(getString(R.string.aceite_oliva_1_4_tza)),
                Ingredient(getString(R.string.agua_coccion_pasta)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pechuga_asada)),
                Ingredient(getString(R.string.queso_parmesano)))

            val preparation = getString(R.string.spaghetti_crema_aguacate_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiPimientosCremoso.setOnClickListener {

            val title = getString(R.string.title_spaghetti_pimiento_rojo_cremoso)

            val image = R.drawable.spaghetti_pimiento

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.spaghetti_500g)),
                Ingredient(getString(R.string.lata_chile_morron_1)),
                Ingredient(getString(R.string.cubo_caldo_pollo_1)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.lata_media_crema_1)),
                Ingredient(getString(R.string.leche_10ml)),
                Ingredient(getString(R.string.limones_3)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pechuga_asada)),
                Ingredient(getString(R.string.pan_con_mantequilla)),
                Ingredient(getString(R.string.ensalada_campesina)))

            val preparation = getString(R.string.spaghetti_pimiento_cremoso_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btSpaghettiRojoCremoso.setOnClickListener {

            val title = getString(R.string.title_spaghetti_rojo_cremoso)

            val image = R.drawable.spaghetti_cremoso

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.spaghetti_500g)),
                Ingredient(getString(R.string.jitomate_rebanado_sin_semilla_6)),
                Ingredient(getString(R.string.cucharadas_aceite_2)),
                Ingredient(getString(R.string.sal_gusto)),
                Ingredient(getString(R.string.hierbas_finas_cda_1)),
                Ingredient(getString(R.string.pimienta_negra_molida_1_4_cda)),
                Ingredient(getString(R.string.leche_evaporada_250ml)),
                Ingredient(getString(R.string.cubo_caldo_pollo_1)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pechuga_asada)),
                Ingredient(getString(R.string.albondigas)),
                Ingredient(getString(R.string.ensalada_campesina)))

            val preparation = getString(R.string.spaghetti_rojo_cremoso_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
    }

    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                           substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>, preparation: String) {

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
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}