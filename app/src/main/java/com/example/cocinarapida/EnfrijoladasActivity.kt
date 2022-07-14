package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cocinarapida.databinding.ActivityEnfrijoladasBinding

class EnfrijoladasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEnfrijoladasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnfrijoladasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ingrediente1.setOnClickListener {
            Toast.makeText(this, "${binding.ingrediente1.text}", Toast.LENGTH_SHORT).show()
            val ingredient_1 = binding.ingrediente1.text.toString()

            openEnfrijoladas(ingredient_1)
        }
    }

    private fun openEnfrijoladas(ingredient1: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("img_top_recipe", R.drawable.crema_verduras)


        intent.putExtra("ingredient_1", ingredient1)
        startActivity(intent)

    }
}