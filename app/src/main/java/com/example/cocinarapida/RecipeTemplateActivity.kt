package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding
import java.io.Serializable

class RecipeTemplateActivity : AppCompatActivity(), OnClickListenerIngredient {
    private lateinit var binding: ActivityRecipeTemplateBinding
    private lateinit var database: DatabaseHelper
    private lateinit var ingredientListAdapter: IngredientAdapter
    private lateinit var sustitutesListAdapter: IngredientAdapter
    private lateinit var optionListAdapter: IngredientAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val args = intent.getBundleExtra("Bundle")
        val recipe = args!!.getSerializable("Recipe") as Recipe
        // n.n

        database = DatabaseHelper(this)

        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.title = recipe.title
        }

        binding.basicosIcon.setOnClickListener {

            val intent = Intent(this, HelpActivity::class.java)
            val sendhelpargs = Bundle()
            sendhelpargs.putSerializable("sendHelpList", recipe.help as Serializable)
            intent.putExtra("sendHelpListBundle", sendhelpargs)
            startActivity(intent)
        }
        binding.shopingListIcon.setOnClickListener {
            startActivity(Intent(this, ShoppingListActivity::class.java))
        }

        binding.imgRecipe.setImageResource(recipe.image)

        ingredientListAdapter = IngredientAdapter(recipe.ingredients, this)
        binding.rvIngredient.apply {
            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
            adapter = ingredientListAdapter
        }

        sustitutesListAdapter = IngredientAdapter(recipe.substitutes, this)
        binding.rvSubstitutes.apply {
            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
            adapter = sustitutesListAdapter
        }

        optionListAdapter = IngredientAdapter(recipe.optional, this)
        binding.rvOptionals.apply {
            layoutManager = LinearLayoutManager(this@RecipeTemplateActivity)
            adapter = optionListAdapter
        }

        binding.tvPreparation.text = recipe.process

    }

    private fun addlistaCompras(ingredient: Ingredient) {
        val ingredientAdd = ingredient.description
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
          addlistaCompras(ingredient)    }
}