package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityEnsaladasBinding
import java.io.Serializable
import java.util.ArrayList

class EnsaladasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEnsaladasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnsaladasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btEnsaladaColMostazaMiel.setOnClickListener {
            val title = getString(R.string.title_ensalada_col_mostaza_miel)

            val image = R.drawable.spaghetti_cremoso

            val ingredientList = arrayListOf(
                Ingredient(getString(R.string.huevo_1)),
                Ingredient(getString(R.string.mostaza_miel_1cda)),
                Ingredient(getString(R.string.aceite_girasol_250ml)),
                Ingredient(getString(R.string.coco_rayado_60g)),
                Ingredient(getString(R.string.agua_fria)),
                Ingredient(getString(R.string.col_morada_ch_1_2)),
                Ingredient(getString(R.string.col_blanca_ch_1_2)),
                Ingredient(getString(R.string.zanahorias_5)),
                Ingredient(getString(R.string.sal_gusto)))

            val substitutesList = arrayListOf(
                Ingredient(getString(R.string.no_subtitutes)))

            val optionsList = arrayListOf(
                Ingredient(getString(R.string.no_optios)))

            val preparation = getString(R.string.preparation_ensalada_col_mostaza_miel)

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
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}