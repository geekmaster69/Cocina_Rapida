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
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding
import com.google.android.material.snackbar.Snackbar

class RecipeTemplateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeTemplateBinding
    private lateinit var database: DatabaseHelper
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

        val ingredientsList = intent.extras?.getStringArray("ingredientsList")
        val substitutesList = intent.extras?.getStringArray("substitutesList")
        val optionList = intent.extras?.getStringArray("optionList")

        list = binding.lvIngredients
        list.adapter = ArrayAdapter<String>(this,R.layout.item_ingredient_list, ingredientsList!!)
        ListHelper.getListViewSize(list)
        binding.lvIngredients.setOnItemLongClickListener { adapterView, view, i, l ->
            val ingredientSelect = adapterView.getItemAtPosition(i).toString()
            addlistaCompras(ingredientSelect)
            true
        }

        list = binding.lvSubstitutes
        list.adapter = ArrayAdapter<String>(this,R.layout.item_ingredient_list, substitutesList!!)
        ListHelper.getListViewSize(list)
        binding.lvSubstitutes.setOnItemLongClickListener { adapterView, view, i, l ->
            val ingredientSelect = adapterView.getItemAtPosition(i).toString()
            addlistaCompras(ingredientSelect)
            true
        }

        list = binding.lvOptionals
        list.adapter = ArrayAdapter<String>(this,R.layout.item_ingredient_list, optionList!!)
        ListHelper.getListViewSize(list)
        binding.lvOptionals.setOnItemLongClickListener { adapterView, view, i, l ->
            val ingredientSelect = adapterView.getItemAtPosition(i).toString()
            addlistaCompras(ingredientSelect)
            true
        }

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
}