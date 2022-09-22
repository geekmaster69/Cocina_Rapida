package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityLicuadosBinding

class LicuadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLicuadosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLicuadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLicMangoCremaCoco.setOnClickListener {

            val title = getString(R.string.title_licuado_mango_crema_coco)

            val image = R.drawable.omelette_jamon_queso

            val ingredientList = arrayOf(
                getString(R.string.mango_1tz),
                getString(R.string.crema_coco_1tz),
                getString(R.string.yogurt_natural_1tz),
                getString(R.string.hielo),
                getString(R.string.chichitos_colores_1_2tz),
                getString(R.string.azucar_glas),
                getString(R.string.agua_1cda))

            val substitutesList = arrayOf(getString(R.string.no_subtitutes))

            val optionsList = arrayOf(getString(R.string.no_optios))

            val preparation: String = getString(R.string.licuado_mango_crema_coco_preparation)

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
}