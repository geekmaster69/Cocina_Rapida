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




           // openspaghettiPestoActivity()
        }
        binding.btSpaghettiCremaAguacate.setOnClickListener {
          //  openspaghettiCremaAguacateActivity()
        }
        binding.btSpaghettiPimientosCremoso.setOnClickListener {
           // openSpaghettiPimientosCremosoActivity()
        }
        binding.btSpaghettiRojoCremoso.setOnClickListener {
           // openSpaghettiRojoCremosoActivity()
        }
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