package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityOniguiriBinding
import java.io.Serializable
import java.util.ArrayList

class OniguiriActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOniguiriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOniguiriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btOniguiriSalmon.setOnClickListener {
            val title = getString(R.string.title_oniguiri_salmon)

            val image = R.drawable.onigiri_menu

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.arroz_300g)),
                Ingredient(getString(R.string.agua_400ml)),
                Ingredient(getString(R.string.hoja_nori)),
                Ingredient(getString(R.string.salmon_sobre_lata_400g)),
                Ingredient(getString(R.string.mantequilla_cda_1)),
                Ingredient(getString(R.string.crema_acida_120ml)),
                Ingredient(getString(R.string.cebollin_10pz)),
                Ingredient(getString(R.string.sal_pimineta_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.nori_salmon_preparation)

            starRecipeTemplateActivity(title, image, ingredientList, substitutesList, optionsList,
                preparation)
        }
    }

    private fun starRecipeTemplateActivity(title: String, image: Int, ingredientList: ArrayList<Ingredient>,
                                           substituteList: ArrayList<Ingredient>, optionsList: ArrayList<Ingredient>, preparation: String) {

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