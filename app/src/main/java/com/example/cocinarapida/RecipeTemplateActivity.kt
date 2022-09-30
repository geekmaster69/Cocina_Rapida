package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding
import com.google.android.material.snackbar.Snackbar

class RecipeTemplateActivity : AppCompatActivity(), OnClickListenerIngredient {
    private lateinit var binding: ActivityRecipeTemplateBinding
    private lateinit var database: DatabaseHelper
    private lateinit var ingredientAdapter: IngredientAdapter
    lateinit var list: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = DatabaseHelper(this)

        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.title = intent.extras?.getString("title")
        }

        binding.basicosIcon.setOnClickListener {
            startActivity(Intent(this, BasicosActivity::class.java))
        }
        binding.shopingListIcon.setOnClickListener {
            startActivity(Intent(this, ShoppingListActivity::class.java))
        }

        val imgRecipe = intent?.getIntExtra("img_top_recipe", 0)
        binding.imgRecipe.setImageResource(imgRecipe!!)

        val args = intent.getBundleExtra("BUNDLE")
        val serialisableList = args!!.getSerializable("ARRAYLIST") as ArrayList<Ingredient>

//        val substituteargs = intent.getBundleExtra("SubstituteListBundle")
//        val subtitutesList = substituteargs!!.getSerializable("SubstituteList") as ArrayList<Ingredient>
//
//        val optionalargs = intent.getBundleExtra("OptionalListBundle")
//        val optionsList = optionalargs!!.getSerializable("OptionalList") as ArrayList<Ingredient>
//




        ingredientAdapter = IngredientAdapter(serialisableList, this)

        binding.rvIngredient.apply {
            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
            adapter = ingredientAdapter
        }
//        binding.rvSubstitutes.apply {
//            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
//            adapter = ingredientAdapter
//        }
//        binding.rvOptionals.apply {
//            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
//            adapter = ingredientAdapter
//        }


        binding.tvPreparation.text = intent.extras?.getString("preparation")
    }

    private fun addlistaCompras(ingredientAdd: String) {
        val note = Note (description = ingredientAdd)
        note.id = database.insertNote(note)
        Toast.makeText(this, "$ingredientAdd Se agrego a la Lista de Compras", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onLongClick(ingredient: Ingredient) {
        TODO("Not yet implemented")
    }
}