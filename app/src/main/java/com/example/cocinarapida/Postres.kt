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
            openPanquePlatano()
        }

        binding.btCheescakeFrutosRojos.setOnClickListener {
            openCheesecakeFrutosRojos()
        }

        binding.bttartaQuesoMicroondas.setOnClickListener {
            openTartaQuesoMicroondas()
        }

        binding.btCarlotaLimon.setOnClickListener {
            openCarlotaLimon()
        }

        binding.btCheesecakeMangotaza.setOnClickListener {
            openCheesecakemangoTaza()
        }

        binding.btArrozLeche.setOnClickListener {
            openArrozleche()
        }

        binding.btBudinPane.setOnClickListener {
            openBudinPan()
        }

        binding.btPanqueZanahoriaTaza.setOnClickListener {
            openPanqueZanahoriaTaza()
        }

        binding.btRolCanelaTaza.setOnClickListener {
            openRolCanelaTaza()
        }

        binding.btCrumbleManzanaTaza.setOnClickListener {
            openCrumbleManzanaTaza()
        }

    }

    private fun openCrumbleManzanaTaza() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_crumble_manzana_taza))

        intent.putExtra("img_top_recipe", R.drawable.crumble_manzana_taza)

        intent.putExtra("ingredient_1", getString(R.string.manzana_1pza))
        intent.putExtra("ingredient_2", getString(R.string.jugo_limon_1_2cda))
        intent.putExtra("ingredient_3", getString(R.string.canela_molida_1_2cda))
        intent.putExtra("ingredient_4", getString(R.string.vainilla_1_4cda))
        intent.putExtra("ingredient_5", getString(R.string.para_masa))
        intent.putExtra("ingredient_6", getString(R.string.harina_2cda))
        intent.putExtra("ingredient_7", getString(R.string.mantequilla_2_cda))
        intent.putExtra("ingredient_8", getString(R.string.azucar_1cda))

        intent.putExtra("sustituto_1", getString(R.string.masa_hojaldre))

        intent.putExtra("optional_1", getString(R.string.helado_vainilla))

        intent.putExtra("preparation1", getString(R.string.crumble_manzana_taza_preparation))

        startActivity(intent)

    }

    private fun openRolCanelaTaza() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_rol_canela_taza))

        intent.putExtra("img_top_recipe", R.drawable.rol_canela_taza)

        intent.putExtra("ingredient_1", getString(R.string.mantequilla_cda_1))
        intent.putExtra("ingredient_2", getString(R.string.azucar_1_4tz))
        intent.putExtra("ingredient_3", getString(R.string.canela_molida_1cda))
        intent.putExtra("ingredient_4", getString(R.string.pan_blanco_4pz))
        intent.putExtra("ingredient_5", getString(R.string.nueces_1_4_tza))
        intent.putExtra("ingredient_6", getString(R.string.huevo_1))
        intent.putExtra("ingredient_7", getString(R.string.leche_1_3tz))
        intent.putExtra("ingredient_8", getString(R.string.vainilla_cda_1))

        intent.putExtra("sustituto_1", getString(R.string.sustituto_azucar))

        intent.putExtra("optional_1", getString(R.string.glaseado))
        intent.putExtra("optional_2", getString(R.string.crema_batida))
        intent.putExtra("optional_3", getString(R.string.nueces_trozo))

        intent.putExtra("preparation1", getString(R.string.rol_canela_taza_preparation))

        startActivity(intent)

    }

    private fun openPanqueZanahoriaTaza() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_panque_platano_taza))

        intent.putExtra("img_top_recipe", R.drawable.panque_zanahoria_taza)

        intent.putExtra("ingredient_1", getString(R.string.harina_1_4tz))
        intent.putExtra("ingredient_2", getString(R.string.huevo_1))
        intent.putExtra("ingredient_3", getString(R.string.canela_molida_1cda))
        intent.putExtra("ingredient_4", getString(R.string.vainilla_cda_1))
        intent.putExtra("ingredient_5", getString(R.string.zanahoria_grande))
        intent.putExtra("ingredient_6", getString(R.string.yogurt_natural_1cda))
        intent.putExtra("ingredient_7", getString(R.string.polvo_hornear_1_2cda))

        intent.putExtra("sustituto_1", getString(R.string.sustituto_azucar))

        intent.putExtra("optional_1", getString(R.string.glaseado))
        intent.putExtra("optional_2", getString(R.string.crema_batida))
        intent.putExtra("optional_3", getString(R.string.nueces_trozo))

        intent.putExtra("preparation1", getString(R.string.panque_zanahoria_taza_preparation))

        startActivity(intent)

    }

    private fun openBudinPan() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_budin_pan))

        intent.putExtra("img_top_recipe", R.drawable.budin_pan)

        intent.putExtra("ingredient_1", getString(R.string.pan_300g))
        intent.putExtra("ingredient_2", getString(R.string.huevos_3pz))
        intent.putExtra("ingredient_3", getString(R.string.leche_500ml))
        intent.putExtra("ingredient_4", getString(R.string.azucar_125g))
        intent.putExtra("ingredient_5", getString(R.string.chocolate_100g))
        intent.putExtra("ingredient_6", getString(R.string.vainilla_cda_1))
        intent.putExtra("ingredient_7", getString(R.string.caramelo_liquido))
        intent.putExtra("ingredient_8", getString(R.string.mantequilla_3cda))

        intent.putExtra("preparation1", getString(R.string.budin_pan_preparation))

        startActivity(intent)

    }

    private fun openArrozleche() {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_arroz_leche))

        intent.putExtra("img_top_recipe", R.drawable.arroz_leche)

        intent.putExtra("ingredient_1", getString(R.string.agua_1l))
        intent.putExtra("ingredient_2", getString(R.string.raja_canela))
        intent.putExtra("ingredient_3", getString(R.string.arroz_1tz))
        intent.putExtra("ingredient_4", getString(R.string.leche_condensada_1lata))
        intent.putExtra("ingredient_5", getString(R.string.leche_evaporada_1lata))
        intent.putExtra("ingredient_6", getString(R.string.canela_molida_1_2cda))

        intent.putExtra("optional_1", getString(R.string.pasas_1_2tz))


        intent.putExtra("preparation1", getString(R.string.arroz_leche_preparation))

        startActivity(intent)


    }

    private fun openCheesecakemangoTaza() {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_carlota_limon))

        intent.putExtra("img_top_recipe", R.drawable.carlota_limon)

        intent.putExtra("ingredient_1", getString(R.string.queso_crema_4cda))
        intent.putExtra("ingredient_2", getString(R.string.media_crema_4cda))
        intent.putExtra("ingredient_3", getString(R.string.azucar))
        intent.putExtra("ingredient_4", getString(R.string.esencia_vainilla))
        intent.putExtra("ingredient_5", getString(R.string.mango_manila))
        intent.putExtra("ingredient_6", getString(R.string.galettas_vainilla))
        intent.putExtra("ingredient_7", getString(R.string.mantequilla_cda_1))

        intent.putExtra("sustituto_1", getString(R.string.mermelada_mango))



        intent.putExtra("preparation1", getString(R.string.cheesecake_mango_taza_preparation))

        startActivity(intent)


    }

    private fun openCarlotaLimon() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_carlota_limon))

        intent.putExtra("img_top_recipe", R.drawable.carlota_limon)

        intent.putExtra("ingredient_1", getString(R.string.galletas_maria))
        intent.putExtra("ingredient_2", getString(R.string.yogurt_griego_1tz))
        intent.putExtra("ingredient_3", getString(R.string.limon))
        intent.putExtra("ingredient_4", getString(R.string.endulzante))
        intent.putExtra("ingredient_5", getString(R.string.vainilla_cda_1))
        intent.putExtra("ingredient_6", getString(R.string.galletas_trituradas_4cda))
        intent.putExtra("ingredient_7", getString(R.string.mantequilla_cda_1))
        intent.putExtra("ingredient_8", getString(R.string.mantequilla_engrasar))



        intent.putExtra("preparation1", getString(R.string.carlota_limon_preparation))

        startActivity(intent)

    }

    private fun openTartaQuesoMicroondas() {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_tarta_queso_microondas))

        intent.putExtra("img_top_recipe", R.drawable.tarta_queso_microondas)

        intent.putExtra("ingredient_1", getString(R.string.queso_crema_4cda))
        intent.putExtra("ingredient_2", getString(R.string.yogurt_natural_2cda))
        intent.putExtra("ingredient_3", getString(R.string.azucar_2_1_2tz))
        intent.putExtra("ingredient_4", getString(R.string.huevo_1))
        intent.putExtra("ingredient_5", getString(R.string.vainilla_cda_1))
        intent.putExtra("ingredient_6", getString(R.string.galletas_trituradas_4cda))
        intent.putExtra("ingredient_7", getString(R.string.mantequilla_cda_1))
        intent.putExtra("ingredient_8", getString(R.string.mantequilla_engrasar))



        intent.putExtra("preparation1", getString(R.string.tarta_queso_microondas_preparation))

        startActivity(intent)

    }

    private fun openCheesecakeFrutosRojos() {


        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_cheesecake_frutos_rojos))

        intent.putExtra("img_top_recipe", R.drawable.cheesecake_frutos_rojos)

        intent.putExtra("ingredient_1", getString(R.string.galletas_mariaMolidas_2tzs))
        intent.putExtra("ingredient_2", getString(R.string.azucar_1_3tzs))
        intent.putExtra("ingredient_3", getString(R.string.mantequilla_3_4tz))
        intent.putExtra("ingredient_4", getString(R.string.queso_crema_900g))
        intent.putExtra("ingredient_5", getString(R.string.azucar_2tz))
        intent.putExtra("ingredient_6", getString(R.string.leche_1_4tz))
        intent.putExtra("ingredient_7", getString(R.string.esencia_vainilla_2cda))
        intent.putExtra("ingredient_8", getString(R.string.grenetina_14g))
        intent.putExtra("ingredient_9", getString(R.string.mezcla_frutos_rojos_400g))
        intent.putExtra("ingredient_10", getString(R.string.azucar_1tz))
        intent.putExtra("ingredient_11", getString(R.string.grenetina_14g))
        intent.putExtra("ingredient_12", getString(R.string.almidon_maiz_2cda))
        intent.putExtra("ingredient_13", getString(R.string.jugo_limon_1_4tz))
        intent.putExtra("ingredient_14", getString(R.string.fresas_400g))

        intent.putExtra("sustituto_1", getString(R.string.mermelada_fresa))
        intent.putExtra("sustituto_2", getString(R.string.base_galleta))


        intent.putExtra("preparation1", getString(R.string.cheesecake_frutos_rojos_preparation))

        startActivity(intent)

    }

    private fun openPanquePlatano() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_panque_platano_taza))

        intent.putExtra("img_top_recipe", R.drawable.panque_platano_taza)

        intent.putExtra("ingredient_1", getString(R.string.platano_1pza))
        intent.putExtra("ingredient_2", getString(R.string.huevo_1))
        intent.putExtra("ingredient_3", getString(R.string.leche_3cds))
        intent.putExtra("ingredient_4", getString(R.string.cucharadas_aceite_2))
        intent.putExtra("ingredient_5", getString(R.string.esencia_vainilla_1cda))
        intent.putExtra("ingredient_6", getString(R.string.miel_2cda))
        intent.putExtra("ingredient_7", getString(R.string.harina_65g))
        intent.putExtra("ingredient_8", getString(R.string.polvo_hornear_1cda))
        intent.putExtra("ingredient_9", getString(R.string.chispas_chocolate_50grs))
        intent.putExtra("ingredient_10", getString(R.string.mantequilla))

        intent.putExtra("sustituto_1", getString(R.string.mezcla_para_panque_taza))

        intent.putExtra("optional_1", getString(R.string.azucar_glas))
        intent.putExtra("optional_2", getString(R.string.cajeta))
        intent.putExtra("optional_3", getString(R.string.dulce_leche))
        intent.putExtra("optional_4", getString(R.string.crema_batida))
        intent.putExtra("optional_5", getString(R.string.chocolate_liquido))

        intent.putExtra("preparation1", getString(R.string.panque_platano_taza_preparation))

        startActivity(intent)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}