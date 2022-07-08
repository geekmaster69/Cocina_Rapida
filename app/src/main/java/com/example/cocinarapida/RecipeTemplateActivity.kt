package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityRecipeTemplateBinding

class RecipeTemplateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeTemplateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}