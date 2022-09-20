package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityPostresBinding

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

            val ingredientList = arrayOf(
                getString(R.string.platano_1pza),
                getString(R.string.huevo_1),
                getString(R.string.leche_3cds),
                getString(R.string.cucharadas_aceite_2),
                getString(R.string.esencia_vainilla_1cda),
                getString(R.string.miel_2cda),
                getString(R.string.harina_65g),
                getString(R.string.polvo_hornear_1cda),
                getString(R.string.chispas_chocolate_50grs),
                getString(R.string.mantequilla))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.azucar_glas),
                getString(R.string.cajeta),
                getString(R.string.dulce_leche),
                getString(R.string.crema_batida),
                getString(R.string.chocolate_liquido))

            val preparation = getString(R.string.panque_platano_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPanqueAvena.setOnClickListener {

            val title = getString(R.string.title_panque_avena)

            val image = R.drawable.panke_avena

            val ingredientList = arrayOf(
                getString(R.string.platano_1),
                getString(R.string.huevo_1),
                getString(R.string.yogurt_griego_1_3_tz),
                getString(R.string.vainilla_cda_1),
                getString(R.string.miel_cda),
                getString(R.string.avena_1_3_tza),
                getString(R.string.chispas_chocolate_50grs))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.panque_avena_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCheescakeFrutosRojos.setOnClickListener {

            val title = getString(R.string.title_cheesecake_frutos_rojos)

            val image = R.drawable.cheesecake_frutos_rojos

            val ingredientList = arrayOf(
                getString(R.string.galletas_mariaMolidas_2tzs),
                getString(R.string.azucar_1_3tzs),
                getString(R.string.mantequilla_3_4tz),
                getString(R.string.queso_crema_900g),
                getString(R.string.azucar_2tz),
                getString(R.string.leche_1_4tz),
                getString(R.string.esencia_vainilla_2cda),
                getString(R.string.grenetina_14g),
                getString(R.string.mezcla_frutos_rojos_400g),
                getString(R.string.azucar_1tz),
                getString(R.string.grenetina_14g),
                getString(R.string.almidon_maiz_2cda),
                getString(R.string.jugo_limon_1_4tz),
                getString(R.string.fresas_400g))

            val substitutesList = arrayOf(
                getString(R.string.mermelada_fresa),
                getString(R.string.base_galleta))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.cheesecake_frutos_rojos_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }

        binding.bttartaQuesoMicroondas.setOnClickListener {

            val title = getString(R.string.title_tarta_queso_microondas)

            val image = R.drawable.tarta_queso_microondas

            val ingredientList = arrayOf(
                getString(R.string.queso_crema_4cda),
                getString(R.string.yogurt_natural_2cda),
                getString(R.string.azucar_2_1_2tz),
                getString(R.string.huevo_1),
                getString(R.string.vainilla_cda_1),
                getString(R.string.galletas_trituradas_4cda),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.mantequilla_engrasar))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.tarta_queso_microondas_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCarlotaLimon.setOnClickListener {

            val title = getString(R.string.title_carlota_limon)

            val image = R.drawable.carlota_limon

            val ingredientList = arrayOf(
                getString(R.string.galletas_maria),
                getString(R.string.yogurt_griego_1tz),
                getString(R.string.limon),
                getString(R.string.endulzante),
                getString(R.string.vainilla_cda_1),
                getString(R.string.galletas_trituradas_4cda),
                getString(R.string.mantequilla_cda_1),
                getString(R.string.mantequilla_engrasar))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.carlota_limon_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCheesecakeMangotaza.setOnClickListener {


            val title = getString(R.string.title_cheesecake_mango_taza)

            val image = R.drawable.carlota_limon

            val ingredientList = arrayOf(
                getString(R.string.queso_crema_4cda),
                getString(R.string.media_crema_4cda),
                getString(R.string.azucar),
                getString(R.string.esencia_vainilla),
                getString(R.string.mango_manila),
                getString(R.string.galettas_vainilla),
                getString(R.string.mantequilla_cda_1))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.mermelada_mango))

            val preparation = getString(R.string.cheesecake_mango_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)

        }

        binding.btArrozLeche.setOnClickListener {

            val title = getString(R.string.title_arroz_leche)

            val image = R.drawable.arroz_leche

            val ingredientList = arrayOf(
                getString(R.string.agua_1l),
                getString(R.string.raja_canela),
                getString(R.string.arroz_1tz),
                getString(R.string.leche_condensada_1lata),
                getString(R.string.leche_evaporada_1lata),
                getString(R.string.canela_molida_1_2cda))

            val substitutesList = arrayOf(
                getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.pasas_1_2tz))

            val preparation = getString(R.string.arroz_leche_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btBudinPane.setOnClickListener {

            val title = getString(R.string.title_budin_pan)

            val image = R.drawable.budin_pan

            val ingredientList = arrayOf(
                getString(R.string.pan_300g),
                getString(R.string.huevos_3pz),
                getString(R.string.leche_500ml),
                getString(R.string.azucar_125g),
                getString(R.string.chocolate_100g),
                getString(R.string.vainilla_cda_1),
                getString(R.string.caramelo_liquido),
                getString(R.string.mantequilla_3cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.no_optios))

            val preparation = getString(R.string.budin_pan_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPanqueZanahoriaTaza.setOnClickListener {

            val title = getString(R.string.title_panque_zanahoria_taza)

            val image = R.drawable.panque_zanahoria_taza

            val ingredientList = arrayOf(
                getString(R.string.harina_1_4tz),
                getString(R.string.huevo_1),
                getString(R.string.canela_molida_1cda),
                getString(R.string.vainilla_cda_1),
                getString(R.string.nueces_1_4_tza),
                getString(R.string.zanahoria_grande),
                getString(R.string.yogurt_natural_1cda),
                getString(R.string.polvo_hornear_1_2cda))

            val substitutesList = arrayOf(getString(R.string.sustituto_azucar))

            val optionsList = arrayOf(
                getString(R.string.glaseado),
                getString(R.string.crema_batida),
                getString(R.string.nueces_trozo))

            val preparation = getString(R.string.panque_zanahoria_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btRolCanelaTaza.setOnClickListener {

            val title = getString(R.string.title_rol_canela_taza)

            val image = R.drawable.rol_canela_taza

            val ingredientList = arrayOf(
                getString(R.string.mantequilla_cda_1),
                getString(R.string.azucar_1_4tz),
                getString(R.string.canela_molida_1cda),
                getString(R.string.pan_blanco_4pz),
                getString(R.string.nueces_1_4_tza),
                getString(R.string.huevo_1),
                getString(R.string.leche_1_3tz),
                getString(R.string.vainilla_cda_1))

            val substitutesList = arrayOf(getString(R.string.sustituto_azucar))

            val optionsList = arrayOf(
                getString(R.string.glaseado),
                getString(R.string.crema_batida),
                getString(R.string.nueces_trozo))

            val preparation = getString(R.string.rol_canela_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btCrumbleManzanaTaza.setOnClickListener {

            val title = getString(R.string.title_crumble_manzana_taza)

            val image = R.drawable.crumble_manzana_taza

            val ingredientList = arrayOf(
                getString(R.string.manzana_1pza),
                getString(R.string.jugo_limon_1_2cda),
                getString(R.string.canela_molida_1_2cda),
                getString(R.string.vainilla_1_4cda),
                getString(R.string.para_masa),
                getString(R.string.harina_2cda),
                getString(R.string.mantequilla_2_cda),
                getString(R.string.azucar_1cda))

            val substitutesList = arrayOf(getString(R.string.masa_hojaldre))

            val optionsList = arrayOf(getString(R.string.helado_vainilla))

            val preparation = getString(R.string.crumble_manzana_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btPastelTresLechesTaza.setOnClickListener {

            val title = getString(R.string.title_pastel_tres_leches_taza)

            val image = R.drawable.pastel_3_lehes_taza

            val ingredientList = arrayOf(
                getString(R.string.mantequilla_2_cda),
                getString(R.string.vainilla_cda_1),
                getString(R.string.huevo_1),
                getString(R.string.azuca_2cda),
                getString(R.string.leche_1cda),
                getString(R.string.harina_4cda),
                getString(R.string.polvo_hornear_1_2cda),
                getString(R.string.leche_1_4tz),
                getString(R.string.leche_evaporada_1_4tz),
                getString(R.string.leche_condensada_1_4tz),
                getString(R.string.fresas_1_2tz),
                getString(R.string.crema_batida))

            val substitutesList = arrayOf(getString(R.string.stevia))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation = getString(R.string.pastel_tres_leches_taza_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btGalletasMicroondas.setOnClickListener {

            val title = getString(R.string.title_galletas_microondas)

            val image = R.drawable.galletas_microondas

            val ingredientList = arrayOf(
                getString(R.string.azucar_mascabada_4cda),
                getString(R.string.sal_pizca),
                getString(R.string.vainilla_cda_1),
                getString(R.string.huevo_1),
                getString(R.string.mantequilla_sin_sal_1_2barra),
                getString(R.string.harina_10cda),
                getString(R.string.chispas_chocolate_1_4tz))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.nues_picada),
                getString(R.string.chispas_colores))

            val preparation = getString(R.string.galletas_microondas_preparation)

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
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}