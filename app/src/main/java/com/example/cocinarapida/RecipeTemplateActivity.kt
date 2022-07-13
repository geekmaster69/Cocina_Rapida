package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding

class RecipeTemplateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeTemplateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val imagen_receta = intent?.getIntExtra("img_top_recipe", 0)
        val imagen_final = imagen_receta?.let { resources.getDrawable(it) }
        binding.imgRecipe.setImageDrawable(imagen_final)



        binding.ingredient1.text = intent.extras?.getString("ingredient_1")
        if (binding.ingredient1.text.isBlank()){
            binding.ingredient1.visibility = View.GONE
        }else{
            binding.ingredient1.visibility = View.VISIBLE
        }



        binding.ingredient2.text = intent.extras?.getString("ingredient_2")
        if (binding.ingredient2.text.isBlank()){
            binding.ingredient2.visibility = View.GONE
        }else{
            binding.ingredient2.visibility = View.VISIBLE
        }
        binding.ingredient3.text = intent.extras?.getString("ingredient_3")
        if (binding.ingredient3.text.isBlank()){
            binding.ingredient3.visibility = View.GONE
        }else{
            binding.ingredient3.visibility = View.VISIBLE
        }
        binding.ingredient4.text = intent.extras?.getString("ingredient_4")
        if (binding.ingredient4.text.isBlank()){
            binding.ingredient4.visibility = View.GONE
        }else{
            binding.ingredient4.visibility = View.VISIBLE
        }
        binding.ingredient5.text = intent.extras?.getString("ingredient_5")
        if (binding.ingredient5.text.isBlank()){
            binding.ingredient5.visibility = View.GONE
        }else{
            binding.ingredient5.visibility = View.VISIBLE
        }
        binding.ingredient6.text = intent.extras?.getString("ingredient_6")
        if (binding.ingredient6.text.isBlank()){
            binding.ingredient6.visibility = View.GONE
        }else{
            binding.ingredient6.visibility = View.VISIBLE
        }
        binding.ingredient7.text = intent.extras?.getString("ingredient_7")
        if (binding.ingredient7.text.isBlank()){
            binding.ingredient7.visibility = View.GONE
        }else{
            binding.ingredient7.visibility = View.VISIBLE
        }
        binding.ingredient8.text = intent.extras?.getString("ingredient_8")
        if (binding.ingredient8.text.isBlank()){
            binding.ingredient8.visibility = View.GONE
        }else{
            binding.ingredient8.visibility = View.VISIBLE
        }
        binding.ingredient9.text = intent.extras?.getString("ingredient_9")
        if (binding.ingredient9.text.isBlank()){
            binding.ingredient9.visibility = View.GONE
        }else{
            binding.ingredient9.visibility = View.VISIBLE
        }
        binding.ingredient10.text = intent.extras?.getString("ingredient_10")
        if (binding.ingredient10.text.isBlank()){
            binding.ingredient10.visibility = View.GONE
        }else{
            binding.ingredient10.visibility = View.VISIBLE
        }
        binding.ingredient11.text = intent.extras?.getString("ingredient_11")
        if (binding.ingredient11.text.isBlank()){
            binding.ingredient11.visibility = View.GONE
        }else{
            binding.ingredient11.visibility = View.VISIBLE
        }

        binding.substitute1.text = intent.extras?.getString("sustituto_1")
        if (binding.substitute1.text.isBlank()){
            binding.substitute1.visibility = View.GONE
        }else{
            binding.substitute1.visibility = View.VISIBLE
        }

        binding.substitute2.text = intent.extras?.getString("sustituto_2")
        if (binding.substitute2.text.isBlank()){
            binding.substitute2.visibility = View.GONE
        }else{
            binding.substitute2.visibility = View.VISIBLE
        }
        binding.substitute3.text = intent.extras?.getString("sustituto_3")
        if (binding.substitute3.text.isBlank()){
            binding.substitute3.visibility = View.GONE
        }else{
            binding.substitute3.visibility = View.VISIBLE
        }
        binding.substitute4.text = intent.extras?.getString("sustituto_4")
        if (binding.substitute4.text.isBlank()){
            binding.substitute4.visibility = View.GONE
        }else{
            binding.substitute4.visibility = View.VISIBLE
        }

        binding.tvPreparation.text = intent.extras?.getString("preparation1")


        binding.optional1.text = intent.extras?.getString("optional_1")

        binding.ingredient1.setOnClickListener {
           listaCompras()
        }

















    }

    private fun listaCompras() {
        Toast.makeText(this, "${binding.ingredient1.text} Se añadio a la lista de compras", Toast.LENGTH_SHORT).show()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }



}