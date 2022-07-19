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

            val ingredient1: String = getString(R.string.camarones_precosidos_300grs)
            val ingredient2: String = getString(R.string.sal_pimineta_gusto)
            val ingredient3: String = getString(R.string.ajo_1)
            val ingredient4: String = getString(R.string.mantequilla)
            val ingredient5: String = getString(R.string.crema)
            val ingredient6: String = getString(R.string.agua)
            val ingredient7: String = getString(R.string.pasta_espagueti)
            val ingredient8: String = getString(R.string.queso_parmesano)
            val ingredient9: String = getString(R.string.perejil)

            val preparation1: String = getString(R.string.pasta_camarones_preparation)

            openPastaCamaronBlancoActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, ingredient8, ingredient9, preparation1)
        }
        binding.btPastaTomateAlbahaca.setOnClickListener {

            val ingredient1: String = getString(R.string.jitomate_bola_3)
            val ingredient2: String = getString(R.string.manojo_albahaca_1)
            val ingredient3: String = getString(R.string.ajos_picados_4)
            val ingredient4: String = getString(R.string.sal_grano)
            val ingredient5: String = getString(R.string.pimienta)
            val ingredient6: String = getString(R.string.queso_parmesano)

            val substitute1: String = getString(R.string.substitute_pasta_albahaca_1)
            val substitute2: String = getString(R.string.pasta_albahaca_substitute_1)
            val substitute3: String = getString(R.string.pasta_albahaca_subtitute_3)

            val preparation1: String = getString(R.string.pasta_camarones_preparation)

            openPastaTomateAlbahacaActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, substitute1, substitute2, substitute3, preparation1)
        }
        binding.btPastaSalsaPesto.setOnClickListener {

            val ingredient1: String = getString(R.string.manojo_albahaca_1)
            val ingredient2: String = getString(R.string.queso_parmesano_cda)
            val ingredient3: String = getString(R.string.ajo_1)
            val ingredient4: String = getString(R.string.aceite_oliva_1_2_tza)
            val ingredient5: String = getString(R.string.nueces_1_4_tza)
            val ingredient6: String = getString(R.string.sal_gusto)
            val ingredient7: String = getString(R.string.spaghetti_500g)

            val substitute1: String = getString(R.string.spaghetti_pesto_substitute)

            val preparation1: String = getString(R.string.spaghetti_pesto_preparation)

            val optional1: String = getString(R.string.pan_con_mantequilla)
            val optional2: String = getString(R.string.ensalada_campesina)

            openspaghettiPestoActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
            ingredient6, ingredient7,substitute1, preparation1, optional1, optional2)

        }
        binding.btSpaghettiCremaAguacate.setOnClickListener {

            val ingredient1: String = getString(R.string.spaghetti_500g)
            val ingredient2: String = getString(R.string.cacahuates_1_3_tza)
            val ingredient3: String = getString(R.string.mente_fresca_tza_1)
            val ingredient4: String = getString(R.string.perejil_1_2_tza)
            val ingredient5: String = getString(R.string.cilantro_1_2_tza)
            val ingredient6: String = getString(R.string.ajo_1)
            val ingredient7: String = getString(R.string.limones_3)
            val ingredient8: String = getString(R.string.aguacates_grandes_1_1_2)
            val ingredient9: String = getString(R.string.aceite_oliva_1_4_tza)
            val ingredient10: String = getString(R.string.agua_coccion_pasta)

            val preparation1: String = getString(R.string.spaghetti_crema_aguacate_preparation)

            val optional1: String = getString(R.string.pechuga_asada)
            val optional2: String = getString(R.string.queso_parmesano)

           openspaghettiCremaAguacateActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
               ingredient6, ingredient7,ingredient8, ingredient9, ingredient10, preparation1, optional1, optional2)
        }
        binding.btSpaghettiPimientosCremoso.setOnClickListener {

            val ingredient1: String = getString(R.string.spaghetti_500g)
            val ingredient2: String = getString(R.string.lata_chile_morron_1)
            val ingredient3: String = getString(R.string.cubo_caldo_pollo_1)
            val ingredient4: String = getString(R.string.mantequilla_cda_1)
            val ingredient5: String = getString(R.string.lata_media_crema_1)
            val ingredient6: String = getString(R.string.leche_10ml)
            val ingredient7: String = getString(R.string.limones_3)

            val preparation1: String = getString(R.string.spaghetti_pimiento_cremoso_preparation)

            val optional1: String = getString(R.string.pechuga_asada)
            val optional2: String = getString(R.string.pan_con_mantequilla)
            val optional3: String = getString(R.string.ensalada_campesina)

            openSpaghettiPimientosCremosoActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, preparation1, optional1, optional2, optional3)
        }
        binding.btSpaghettiRojoCremoso.setOnClickListener {

            val ingredient1: String = getString(R.string.spaghetti_500g)
            val ingredient2: String = getString(R.string.jitomate_rebanado_sin_semilla_6)
            val ingredient3: String = getString(R.string.cucharadas_aceite_2)
            val ingredient4: String = getString(R.string.sal_gusto)
            val ingredient5: String = getString(R.string.hierbas_finas_cda_1)
            val ingredient6: String = getString(R.string.pimienta_negra_molida_1_4_cda)
            val ingredient7: String = getString(R.string.leche_evaporada_250ml)
            val ingredient8: String = getString(R.string.cubo_caldo_pollo_1)

            val preparation1: String = getString(R.string.spaghetti_rojo_cremoso_preparation)

            val optional1: String = getString(R.string.pechuga_asada)
            val optional2: String = getString(R.string.albondigas)
            val optional3: String = getString(R.string.ensalada_campesina)

           openSpaghettiRojoCremosoActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
               ingredient6, ingredient7, ingredient8, preparation1, optional1, optional2, optional3)
        }
    }

    private fun openSpaghettiRojoCremosoActivity(ingredient1: String, ingredient2: String,
        ingredient3: String, ingredient4: String, ingredient5: String, ingredient6: String,
        ingredient7: String, ingredient8: String, preparation1: String, optional1: String,
        optional2: String, optional3: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_cremoso)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional1)
        intent.putExtra("optional_2", optional2)
        intent.putExtra("optional_3", optional3)

        startActivity(intent)
    }

    private fun openSpaghettiPimientosCremosoActivity(
        ingredient1: String, ingredient2: String, ingredient3: String, ingredient4: String, ingredient5: String,
        ingredient6: String, ingredient7: String, preparation1: String, optional1: String, optional2: String,
        optional3: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_pimiento)


        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional1)
        intent.putExtra("optional_2", optional2)
        intent.putExtra("optional_3", optional3)

        startActivity(intent)

    }

    private fun openspaghettiCremaAguacateActivity(
        ingredient1: String, ingredient2: String, ingredient3: String, ingredient4: String, ingredient5: String,
        ingredient6: String, ingredient7: String, ingredient8: String, ingredient9: String, ingredient10: String,
        preparation1: String, optional1: String, optional2: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_aguacate)


        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)
        intent.putExtra("ingredient_10", ingredient10)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional1)
        intent.putExtra("optional_2", optional2)

        startActivity(intent)

    }

    private fun openspaghettiPestoActivity(
        ingredient1: String, ingredient2: String, ingredient3: String, ingredient4: String, ingredient5: String,
        ingredient6: String, ingredient7: String, substitute1: String, preparation1: String, optional1: String,
        optional2: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_pesto)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)

        intent.putExtra("preparation1", preparation1)

        intent.putExtra("optional_1", optional1)
        intent.putExtra("optional_2", optional2)

        startActivity(intent)
    }

    private fun openPastaTomateAlbahacaActivity(
        ingredient1: String, ingredient2: String, ingredient3: String, ingredient4: String, ingredient5: String,
        ingredient6: String, substitute1: String, substitute2: String, substitute3: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_albahaca)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)
        intent.putExtra("sustituto_3", substitute3)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }

    private fun openPastaCamaronBlancoActivity(
        ingredient1: String, ingredient2: String, ingredient3: String, ingredient4: String, ingredient5: String,
        ingredient6: String, ingredient7: String, ingredient8: String, ingredient9: String, preparation1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.spaghetti_camarones)

        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)
        intent.putExtra("ingredient_8", ingredient8)
        intent.putExtra("ingredient_9", ingredient9)


        intent.putExtra("preparation1", preparation1)

        startActivity(intent)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}