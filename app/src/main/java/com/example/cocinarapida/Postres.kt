package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityPostresBinding
import java.io.Serializable
import java.util.ArrayList

class Postres : AppCompatActivity() {
    private lateinit var binding: ActivityPostresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostresBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.btPanquePlatanoTaza.setOnClickListener {

            val title = getString(R.string.title_panque_platano_taza)

            val image = R.drawable.panque_platano_taza

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.platano_1pza)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.leche_3cds)),
                Ingredient(getString(R.string.cucharadas_aceite_2)),
                Ingredient(getString(R.string.esencia_vainilla_1cda)),
                Ingredient(getString(R.string.miel_2cda)),
                Ingredient(getString(R.string.harina_65g)),
                Ingredient(getString(R.string.polvo_hornear_1cda)),
                Ingredient(getString(R.string.chispas_chocolate_50grs)),
                Ingredient(getString(R.string.mantequilla)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.azucar_glas)),
                Ingredient(getString(R.string.cajeta)),
                Ingredient(getString(R.string.dulce_leche)),
                Ingredient(getString(R.string.crema_batida)),
                Ingredient(getString(R.string.chocolate_liquido)))

            val preparation = getString(R.string.panque_platano_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPanqueAvena.setOnClickListener {

            val title = getString(R.string.title_panque_avena)

            val image = R.drawable.panke_avena

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.platano_1)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.yogurt_griego_1_3_tz)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.miel_cda)),
                Ingredient(getString(R.string.avena_1_3_tza)),
                Ingredient(getString(R.string.chispas_chocolate_50grs)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.panque_avena_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCheescakeFrutosRojos.setOnClickListener {

            val title = getString(R.string.title_cheesecake_frutos_rojos)

            val image = R.drawable.cheesecake_frutos_rojos

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.galletas_mariaMolidas_2tzs)),
                Ingredient(getString(R.string.azucar_1_3tzs)),
                Ingredient(getString(R.string.mantequilla_3_4tz)),
                Ingredient(getString(R.string.queso_crema_900g)),
                Ingredient(getString(R.string.azucar_2tz)),
                Ingredient(getString(R.string.leche_1_4tz)),
                Ingredient(getString(R.string.esencia_vainilla_2cda)),
                Ingredient(getString(R.string.grenetina_14g)),
                Ingredient(getString(R.string.mezcla_frutos_rojos_400g)),
                Ingredient(getString(R.string.azucar_1tz)),
                Ingredient(getString(R.string.grenetina_14g)),
                Ingredient(getString(R.string.almidon_maiz_2cda)),
                Ingredient(getString(R.string.jugo_limon_1_4tz)),
                Ingredient(getString(R.string.fresas_400g)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.mermelada_fresa)),
                Ingredient(getString(R.string.base_galleta)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.cheesecake_frutos_rojos_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }

        binding.bttartaQuesoMicroondas.setOnClickListener {

            val title = getString(R.string.title_tarta_queso_microondas)

            val image = R.drawable.tarta_queso_microondas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.queso_crema_4cda)),
                Ingredient(getString(R.string.yogurt_natural_2cda)),
                Ingredient(getString(R.string.azucar_2_1_2tz)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.galletas_trituradas_4cda)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.mantequilla_engrasar)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.tarta_queso_microondas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCarlotaLimon.setOnClickListener {

            val title = getString(R.string.title_carlota_limon)

            val image = R.drawable.carlota_limon

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.galletas_maria)),
                Ingredient(getString(R.string.yogurt_griego_1tz)),
                Ingredient(getString(R.string.limon)),
                Ingredient(getString(R.string.endulzante)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.galletas_trituradas_4cda)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.mantequilla_engrasar)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.carlota_limon_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCheesecakeMangotaza.setOnClickListener {


            val title = getString(R.string.title_cheesecake_mango_taza)

            val image = R.drawable.carlota_limon

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.queso_crema_4cda)),
                Ingredient(getString(R.string.media_crema_4cda)),
                Ingredient(getString(R.string.azucar)),
                Ingredient(getString(R.string.esencia_vainilla)),
                Ingredient(getString(R.string.mango_manila)),
                Ingredient(getString(R.string.galettas_vainilla)),
                Ingredient(getString(R.string.mantequilla_cda_1)))

            val substitutesList = arrayListOf(Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(Ingredient(getString(R.string.mermelada_mango)))

            val preparation = getString(R.string.cheesecake_mango_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }

        binding.btArrozLeche.setOnClickListener {

            val title = getString(R.string.title_arroz_leche)

            val image = R.drawable.arroz_leche

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.agua_1l)),
                Ingredient(getString(R.string.raja_canela)),
                Ingredient(getString(R.string.arroz_1tz)),
                Ingredient(getString(R.string.leche_condensada_1lata)),
                Ingredient(getString(R.string.leche_evaporada_1lata)),
                Ingredient(getString(R.string.canela_molida_1_2cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.pasas_1_2tz)))

            val preparation = getString(R.string.arroz_leche_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btBudinPane.setOnClickListener {

            val title = getString(R.string.title_budin_pan)

            val image = R.drawable.budin_pan

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.pan_300g)),
                Ingredient(getString(R.string.huevos_3pz)),
                Ingredient(getString(R.string.leche_500ml)),
                Ingredient(getString(R.string.azucar_125g)),
                Ingredient(getString(R.string.chocolate_100g)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.caramelo_liquido)),
                Ingredient(getString(R.string.mantequilla_3cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.budin_pan_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPanqueZanahoriaTaza.setOnClickListener {

            val title = getString(R.string.title_panque_zanahoria_taza)

            val image = R.drawable.panque_zanahoria_taza

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.harina_1_4tz)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.canela_molida_1cda)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.nueces_1_4_tza)),
                Ingredient(getString(R.string.zanahoria_grande)),
                Ingredient(getString(R.string.yogurt_natural_1cda)),
                Ingredient(getString(R.string.polvo_hornear_1_2cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.sustituto_azucar)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.glaseado)),
                Ingredient(getString(R.string.crema_batida)),
                Ingredient(getString(R.string.nueces_trozo)))

            val preparation = getString(R.string.panque_zanahoria_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btRolCanelaTaza.setOnClickListener {

            val title = getString(R.string.title_rol_canela_taza)

            val image = R.drawable.rol_canela_taza

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.azucar_1_4tz)),
                Ingredient(getString(R.string.canela_molida_1cda)),
                Ingredient(getString(R.string.pan_blanco_4pz)),
                Ingredient(getString(R.string.nueces_1_4_tza)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.leche_1_3tz)),
                Ingredient(getString(R.string.vainilla_cda_1)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.sustituto_azucar)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.glaseado)),
                Ingredient(getString(R.string.crema_batida)),
                Ingredient(getString(R.string.nueces_trozo)))

            val preparation = getString(R.string.rol_canela_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCrumbleManzanaTaza.setOnClickListener {

            val title = getString(R.string.title_crumble_manzana_taza)

            val image = R.drawable.crumble_manzana_taza

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.manzana_1pza)),
                Ingredient(getString(R.string.jugo_limon_1_2cda)),
                Ingredient(getString(R.string.canela_molida_1_2cda)),
                Ingredient(getString(R.string.vainilla_1_4cda)),
                Ingredient(getString(R.string.para_masa)),
                Ingredient(getString(R.string.harina_2cda)),
                Ingredient(getString(R.string.mantequilla_2_cda)),
                Ingredient(getString(R.string.azucar_1cda)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.masa_hojaldre)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.helado_vainilla)))

            val preparation = getString(R.string.crumble_manzana_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPastelTresLechesTaza.setOnClickListener {

            val title = getString(R.string.title_pastel_tres_leches_taza)

            val image = R.drawable.pastel_3_lehes_taza

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.mantequilla_2_cda)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.azuca_2cda)),
                Ingredient(getString(R.string.leche_1cda)),
                Ingredient(getString(R.string.harina_4cda)),
                Ingredient(getString(R.string.polvo_hornear_1_2cda)),
                Ingredient(getString(R.string.leche_1_4tz)),
                Ingredient(getString(R.string.leche_evaporada_1_4tz)),
                Ingredient(getString(R.string.leche_condensada_1_4tz)),
                Ingredient(getString(R.string.fresas_1_2tz)),
                Ingredient(getString(R.string.crema_batida)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.stevia)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.pastel_tres_leches_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btGalletasMicroondas.setOnClickListener {

            val title = getString(R.string.title_galletas_microondas)

            val image = R.drawable.galletas_microondas

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.azucar_mascabada_4cda)),
                Ingredient(getString(R.string.sal_pizca)),
                Ingredient(getString(R.string.vainilla_cda_1)),
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.mantequilla_sin_sal_1_2barra)),
                Ingredient(getString(R.string.harina_10cda)),
                Ingredient(getString(R.string.chispas_chocolate_1_4tz)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.nues_picada)),
                Ingredient(getString(R.string.chispas_colores)))

            val preparation = getString(R.string.galletas_microondas_preparation)

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
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}