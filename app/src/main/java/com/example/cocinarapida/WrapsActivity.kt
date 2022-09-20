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

            val title = getString(R.string.title_wrap_sushi)

            val image = R.drawable.wrap_sushi

            val ingredientList = arrayOf(
                getString(R.string.hoja_nori),
                getString(R.string.aguacate_1_2),
                getString(R.string.pepino),
                getString(R.string.barra_surimi_2),
                getString(R.string.taza_arroz_vapor_1_2),
                getString(R.string.queso_crema))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(
                getString(R.string.no_optios))

            val preparation = getString(R.string.wrap_sushi_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btWrapJitomateEspinacai.setOnClickListener {

            val title = getString(R.string.title_wrap_jitomate_espinaca)

            val image = R.drawable.wrap_jitomate_espinaca

            val ingredientList = arrayOf(
                getString(R.string.jitomate_1),
                getString(R.string.sal_pimineta_gusto),
                getString(R.string.mezcla_quesos_1tz),
                getString(R.string.espinacas_desinfectadas_1tz),
                getString(R.string.tortilla_wrap_1),
                getString(R.string.mantequilla_cda_1))

            val substitutesList = arrayOf(getString(R.string.espinacas_bolsa))

            val optionsList = arrayOf(
                getString(R.string.no_optios))

            val preparation = getString(R.string.wrap_jitomate_espinaca_preparation)

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