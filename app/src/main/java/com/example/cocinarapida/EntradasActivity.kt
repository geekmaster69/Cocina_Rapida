package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityEntradasBinding
import java.io.Serializable
import java.util.ArrayList

class EntradasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEntradasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.btCebollasCarneRes.setOnClickListener {

            val title = getString(R.string.title_bento_cerdo_agridulce)

            val image = R.drawable.bento_cerdo_agridulce

            val ingredientList = arrayListOf(
                Ingredient("180g de carne molida de res"),
                Ingredient("½ manojo de cilantro "),
                Ingredient("30g de pan molido"),
                Ingredient("2 cebollas moradas"),
                Ingredient("mezcla de especias para cerne"),
                Ingredient("aceite"),
                Ingredient("sal y pimienta"))

            val substitutesList = arrayListOf(
                Ingredient("carne de cerdo"))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation =  getString(R.string.cebollas_rellenas_carne_molida)

            val helpList = arrayListOf(
                Help("Sin sugerencias",
                    R.drawable.ic_help_null,
                    "No hay sugerencias disponibles"))

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation, helpList)
        }
    }


    fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                   substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>,
                                   preparation: String, helpList: ArrayList<Help>) {

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

        args.putSerializable("HelpList", helpList as Serializable)
        intent.putExtra("HelpListBundle", args)

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