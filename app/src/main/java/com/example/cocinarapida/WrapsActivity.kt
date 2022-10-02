package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityWrapsBinding
import java.io.Serializable
import java.util.ArrayList

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

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.hoja_nori)),
                Ingredient(getString(R.string.aguacate_1_2)),
                Ingredient(getString(R.string.pepino)),
                Ingredient(getString(R.string.barra_surimi_2)),
                Ingredient(getString(R.string.taza_arroz_vapor_1_2)),
                Ingredient(getString(R.string.queso_crema)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.wrap_sushi_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

        binding.btWrapJitomateEspinacai.setOnClickListener {

            val title = getString(R.string.title_wrap_jitomate_espinaca)

            val image = R.drawable.wrap_jitomate_espinaca

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.jitomate_1)),
                Ingredient(getString(R.string.sal_pimineta_gusto)),
                Ingredient(getString(R.string.mezcla_quesos_1tz)),
                Ingredient(getString(R.string.espinacas_desinfectadas_1tz)),
                Ingredient(getString(R.string.tortilla_wrap_1)),
                Ingredient(getString(R.string.mantequilla_cda_1)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.espinacas_bolsa)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.wrap_jitomate_espinaca_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }

    }

    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
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