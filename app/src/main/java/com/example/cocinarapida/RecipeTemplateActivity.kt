package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding
import com.google.android.material.snackbar.Snackbar

class RecipeTemplateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeTemplateBinding
    private lateinit var database: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = DatabaseHelper(this)

        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.title = intent.extras?.getString("title")
        }

        val imagenReceta = intent?.getIntExtra("img_top_recipe", 0)
        val imagenFinal = imagenReceta?.let { resources.getDrawable(it) }
        binding.imgRecipe.setImageDrawable(imagenFinal)

        binding.basicosIcon.setOnClickListener {
            startActivity(Intent(this, BasicosActivity::class.java))
        }

        binding.shopingListIcon.setOnClickListener {
            startActivity(Intent(this, ShoppingListActivity::class.java))

        }

        binding.ingredient1.text = intent.extras?.getString("ingredient_1")
        if (binding.ingredient1.text.isBlank()){
            binding.ingredient1.visibility = View.GONE
        }else{
            binding.ingredient1.visibility = View.VISIBLE
        }
        binding.ingredient1.setOnLongClickListener {
            val ingredientAdd = binding.ingredient1.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient2.text = intent.extras?.getString("ingredient_2")
        if (binding.ingredient2.text.isBlank()){
            binding.ingredient2.visibility = View.GONE
        }else{
            binding.ingredient2.visibility = View.VISIBLE
        }
        binding.ingredient2.setOnLongClickListener {
            val ingredientAdd = binding.ingredient2.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient3.text = intent.extras?.getString("ingredient_3")
        if (binding.ingredient3.text.isBlank()){
            binding.ingredient3.visibility = View.GONE
        }else{
            binding.ingredient3.visibility = View.VISIBLE
        }
        binding.ingredient3.setOnLongClickListener {
            val ingredientAdd = binding.ingredient3.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient4.text = intent.extras?.getString("ingredient_4")
        if (binding.ingredient4.text.isBlank()){
            binding.ingredient4.visibility = View.GONE
        }else{
            binding.ingredient4.visibility = View.VISIBLE
        }
        binding.ingredient4.setOnLongClickListener {
            val ingredientAdd = binding.ingredient4.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient5.text = intent.extras?.getString("ingredient_5")
        if (binding.ingredient5.text.isBlank()){
            binding.ingredient5.visibility = View.GONE
        }else{
            binding.ingredient5.visibility = View.VISIBLE
        }
        binding.ingredient5.setOnLongClickListener {
            val ingredientAdd = binding.ingredient5.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient6.text = intent.extras?.getString("ingredient_6")
        if (binding.ingredient6.text.isBlank()){
            binding.ingredient6.visibility = View.GONE
        }else{
            binding.ingredient6.visibility = View.VISIBLE
        }
        binding.ingredient6.setOnLongClickListener {
            val ingredientAdd = binding.ingredient6.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient7.text = intent.extras?.getString("ingredient_7")
        if (binding.ingredient7.text.isBlank()){
            binding.ingredient7.visibility = View.GONE
        }else{
            binding.ingredient7.visibility = View.VISIBLE
        }
        binding.ingredient7.setOnLongClickListener {
            val ingredientAdd = binding.ingredient7.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient8.text = intent.extras?.getString("ingredient_8")
        if (binding.ingredient8.text.isBlank()){
            binding.ingredient8.visibility = View.GONE
        }else{
            binding.ingredient8.visibility = View.VISIBLE
        }
        binding.ingredient8.setOnLongClickListener {
            val ingredientAdd = binding.ingredient8.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient9.text = intent.extras?.getString("ingredient_9")
        if (binding.ingredient9.text.isBlank()){
            binding.ingredient9.visibility = View.GONE
        }else{
            binding.ingredient9.visibility = View.VISIBLE
        }
        binding.ingredient9.setOnLongClickListener {
            val ingredientAdd = binding.ingredient9.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient10.text = intent.extras?.getString("ingredient_10")
        if (binding.ingredient10.text.isBlank()){
            binding.ingredient10.visibility = View.GONE
        }else{
            binding.ingredient10.visibility = View.VISIBLE
        }
        binding.ingredient10.setOnLongClickListener {
            val ingredientAdd = binding.ingredient10.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient11.text = intent.extras?.getString("ingredient_11")
        if (binding.ingredient11.text.isBlank()){
            binding.ingredient11.visibility = View.GONE
        }else{
            binding.ingredient11.visibility = View.VISIBLE
        }
        binding.ingredient11.setOnLongClickListener {
            val ingredientAdd = binding.ingredient11.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient12.text = intent.extras?.getString("ingredient_12")
        if (binding.ingredient12.text.isBlank()){
            binding.ingredient12.visibility = View.GONE
        }else{
            binding.ingredient12.visibility = View.VISIBLE
        }
        binding.ingredient12.setOnLongClickListener {
            val ingredientAdd = binding.ingredient12.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient13.text = intent.extras?.getString("ingredient_13")
        if (binding.ingredient13.text.isBlank()){
            binding.ingredient13.visibility = View.GONE
        }else{
            binding.ingredient13.visibility = View.VISIBLE
        }
        binding.ingredient13.setOnLongClickListener {
            val ingredientAdd = binding.ingredient13.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient14.text = intent.extras?.getString("ingredient_14")
        if (binding.ingredient14.text.isBlank()){
            binding.ingredient14.visibility = View.GONE
        }else{
            binding.ingredient14.visibility = View.VISIBLE
        }
        binding.ingredient14.setOnLongClickListener {
            val ingredientAdd = binding.ingredient14.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient15.text = intent.extras?.getString("ingredient_15")
        if (binding.ingredient15.text.isBlank()){
            binding.ingredient15.visibility = View.GONE
        }else{
            binding.ingredient15.visibility = View.VISIBLE
        }
        binding.ingredient15.setOnLongClickListener {
            val ingredientAdd = binding.ingredient15.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient16.text = intent.extras?.getString("ingredient_16")
        if (binding.ingredient16.text.isBlank()){
            binding.ingredient16.visibility = View.GONE
        }else{
            binding.ingredient16.visibility = View.VISIBLE
        }
        binding.ingredient16.setOnLongClickListener {
            val ingredientAdd = binding.ingredient16.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient17.text = intent.extras?.getString("ingredient_17")
        if (binding.ingredient17.text.isBlank()){
            binding.ingredient17.visibility = View.GONE
        }else{
            binding.ingredient17.visibility = View.VISIBLE
        }
        binding.ingredient17.setOnLongClickListener {
            val ingredientAdd = binding.ingredient17.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient18.text = intent.extras?.getString("ingredient_18")
        if (binding.ingredient18.text.isBlank()){
            binding.ingredient18.visibility = View.GONE
        }else{
            binding.ingredient18.visibility = View.VISIBLE
        }
        binding.ingredient18.setOnLongClickListener {
            val ingredientAdd = binding.ingredient18.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient19.text = intent.extras?.getString("ingredient_19")
        if (binding.ingredient19.text.isBlank()){
            binding.ingredient19.visibility = View.GONE
        }else{
            binding.ingredient19.visibility = View.VISIBLE
        }
        binding.ingredient19.setOnLongClickListener {
            val ingredientAdd = binding.ingredient19.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.ingredient20.text = intent.extras?.getString("ingredient_20")
        if (binding.ingredient20.text.isBlank()){
            binding.ingredient20.visibility = View.GONE
        }else{
            binding.ingredient20.visibility = View.VISIBLE
        }
        binding.ingredient20.setOnLongClickListener {
            val ingredientAdd = binding.ingredient20.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }


        binding.substitute1.text = intent.extras?.getString("sustituto_1")
        if (binding.substitute1.text.isBlank()){
            val noSubstitutes = "***No hay sustitutos disponibles***"
            binding.substitute1.text = noSubstitutes
        }else{
            binding.substitute1.visibility = View.VISIBLE
        }
        binding.substitute1.setOnLongClickListener {
            val ingredientAdd = binding.substitute1.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.substitute2.text = intent.extras?.getString("sustituto_2")
        if (binding.substitute2.text.isBlank()){
            binding.substitute2.visibility = View.GONE
        }else{
            binding.substitute2.visibility = View.VISIBLE
        }
        binding.substitute2.setOnLongClickListener {
            val ingredientAdd = binding.substitute2.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.substitute3.text = intent.extras?.getString("sustituto_3")
        if (binding.substitute3.text.isBlank()){
            binding.substitute3.visibility = View.GONE
        }else{
            binding.substitute3.visibility = View.VISIBLE
        }
        binding.substitute3.setOnLongClickListener {
            val ingredientAdd = binding.substitute3.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.substitute4.text = intent.extras?.getString("sustituto_4")
        if (binding.substitute4.text.isBlank()){
            binding.substitute4.visibility = View.GONE
        }else{
            binding.substitute4.visibility = View.VISIBLE
        }
        binding.substitute4.setOnLongClickListener {
            val ingredientAdd = binding.substitute4.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.optional1.text = intent.extras?.getString("optional_1")
        if (binding.optional1.text.isBlank()){
            val notOptions = "***No hay opciones disponibles***"
            binding.optional1.text = notOptions
        }else{
            binding.optional1.visibility = View.VISIBLE
        }
        binding.optional1.setOnLongClickListener {
            val ingredientAdd = binding.optional1.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.optional2.text = intent.extras?.getString("optional_2")
        if (binding.optional2.text.isBlank()){
            binding.optional2.visibility = View.GONE
        }else{
            binding.optional2.visibility = View.VISIBLE
        }
        binding.optional2.setOnLongClickListener {
            val ingredientAdd = binding.optional2.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.optional3.text = intent.extras?.getString("optional_3")
        if (binding.optional3.text.isBlank()){
            binding.optional3.visibility = View.GONE
        }else{
            binding.optional3.visibility = View.VISIBLE
        }

        binding.optional3.setOnLongClickListener {
            val ingredientAdd = binding.optional3.text.toString()
            addlistaCompras(ingredientAdd)
            true
        }

        binding.tvPreparation.text = intent.extras?.getString("preparation1")


    }

    private fun addlistaCompras(ingredientAdd: String) {
        val note = Note (description = ingredientAdd)
        note.id = database.insertNote(note)
        Toast.makeText(this, "Se agrego $ingredientAdd a la Lista de Compras", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}