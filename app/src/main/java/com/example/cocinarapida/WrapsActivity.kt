package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityWrapsBinding

class WrapsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWrapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWrapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btWrapSushi.setOnClickListener {
            openWrapSushi()
        }

        binding.btWrapJitomateEspinacai.setOnClickListener {
            openWrapJitomateEspinaca()
        }


    }

    private fun openWrapJitomateEspinaca() {
        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_wrap_jitomate_espinaca))

        intent.putExtra("img_top_recipe", R.drawable.wrap_jitomate_espinaca)

        intent.putExtra("ingredient_1", getString(R.string.jitomate_1))
        intent.putExtra("ingredient_2", getString(R.string.sal_pimineta_gusto))
        intent.putExtra("ingredient_3", getString(R.string.mezcla_quesos_1tz))
        intent.putExtra("ingredient_4", getString(R.string.espinacas_desinfectadas_1tz))
        intent.putExtra("ingredient_5", getString(R.string.tortilla_wrap_1))
        intent.putExtra("ingredient_6", getString(R.string.mantequilla_cda_1))

        intent.putExtra("sustituto_1", getString(R.string.espinacas_bolsa))


        intent.putExtra("preparation1", getString(R.string.wrap_jitomate_espinaca_preparation))

        startActivity(intent)
    }

    private fun openWrapSushi() {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("title", getString(R.string.title_wrap_sushi))

        intent.putExtra("img_top_recipe", R.drawable.wrap_sushi)

        intent.putExtra("ingredient_1", getString(R.string.hoja_nori))
        intent.putExtra("ingredient_2", getString(R.string.aguacate_1_2))
        intent.putExtra("ingredient_3", getString(R.string.pepino))
        intent.putExtra("ingredient_4", getString(R.string.barra_surimi_2))
        intent.putExtra("ingredient_5", getString(R.string.taza_arroz_vapor_1_2))
        intent.putExtra("ingredient_6", getString(R.string.queso_crema))

        intent.putExtra("preparation1", getString(R.string.wrap_sushi_preparation))

        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}