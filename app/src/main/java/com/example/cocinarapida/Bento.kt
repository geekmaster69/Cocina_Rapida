package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityBentoBinding
import java.io.Serializable
import java.util.ArrayList

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

            val ingredientList = arrayListOf(
                Ingredient(1, "1kg de filete de cerdo"),
                Ingredient(2, "2 cucharadas de salsa de soya"),
                Ingredient(3, "1 cucharada de pimienta"),
                Ingredient(4, "1 huevo"),
                Ingredient(5, "harina de trigo"),
                Ingredient(6, "aceite para freír"),
                Ingredient(7, "1 cuchara de ajo picado"),
                Ingredient(8, "1 cucharada de jengibre picado"),
                Ingredient(9, "1 taza de jugo de naranja natural"),
                Ingredient(10, "3 cucharadas de azúcar"),
                Ingredient(11, "2 cucharadas de vinagre blanco"),
                Ingredient(12, "2 cucharadas de puré de tomate"),
                Ingredient(13, "4 cucharadas de salsa de soya"),
                Ingredient(14, "2 cucharadas de agua"),
                Ingredient(15, "2 cucharadas de maizena"))
//

            val substitutesList = arrayListOf(
                Ingredient(1, "frasco de ajo picado"),
                Ingredient(2, "jugo de naranja en tetrapack"),
                Ingredient(3, "stevia"),
                Ingredient(4, "ketchup"))

            val optionsList = arrayListOf(
                Ingredient(1, "cebollín"),
                Ingredient(2, "semillas de sésamo"))


            val preparation =  getString(R.string.cerdo_agridulce_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList, preparation)
        }
    }

    private fun starRecipeTemplateActivity(
        title: String,
        image: Int,
        ingredientList: ArrayList<Ingredient>,
        substituteList: ArrayList<Ingredient>,
        optionsList: ArrayList<Ingredient>,
        preparation: String) {
        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("img_top_recipe", image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", ingredientList as Serializable)
        intent.putExtra("BUNDLE", args)


//
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