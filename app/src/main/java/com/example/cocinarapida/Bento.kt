package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBentoBinding

class Bento : AppCompatActivity() {
    private lateinit var binding: ActivityBentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btCerdoAgridulce.setOnClickListener {

            val title = getString(R.string.title_bento_cerdo_agridulce)

            val image = R.drawable.bento_cerdo_agridulce

            val ingredientList = arrayOf("- 1kg de filete de cerdo","- 2 cucharadas de salsa de soya",
                "- 1 cucharada de pimienta", "- 1 huevo","- harina de trigo","- aceite para freír",
                "- 1 cuchara de ajo picado", "- 1 cucharada de jengibre picado","- 1 taza de jugo de naranja natural",
                "- 3 cucharadas de azúcar","- 2 cucharadas de vinagre blanco", "- 2 cucharadas de puré de tomate",
                "- 4 cucharadas de salsa de soya","- 2 cucharadas de agua","- 2 cucharadas de maizena")

            val substitutesList = arrayOf("- frasco de ajo picado",
                "-jugo de naranja en tetrapack ", "- stevia ",
                  "- ketchup ")

            val optionsList = arrayOf("- cebollín", "- semillas de sésamo")

            val preparation =  getString(R.string.cerdo_agridulce_preparation)

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