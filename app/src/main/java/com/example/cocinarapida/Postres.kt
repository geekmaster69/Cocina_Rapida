package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivityPostresBinding

class Postres : AppCompatActivity() {
    private lateinit var binding: ActivityPostresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostresBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btPanquePlatanoTaza.setOnClickListener {
            val intent = Intent(this, RecipeTemplateActivity::class.java)

            intent.putExtra("title", getString(R.string.title_panque_platano_taza))

            intent.putExtra("img_top_recipe", R.drawable.panque_platano_taza)

            intent.putExtra("ingredient_1", getString(R.string.platano_1pza))
            intent.putExtra("ingredient_2", getString(R.string.huevo_1))
            intent.putExtra("ingredient_3", getString(R.string.leche_3cds))
            intent.putExtra("ingredient_4", getString(R.string.cucharadas_aceite_2))
            intent.putExtra("ingredient_5", getString(R.string.esencia_vainilla_1cda))
            intent.putExtra("ingredient_6", getString(R.string.miel_2cda))
            intent.putExtra("ingredient_7", getString(R.string.harina_65g))
            intent.putExtra("ingredient_8", getString(R.string.polvo_hornear_1cda))
            intent.putExtra("ingredient_9", getString(R.string.chispas_chocolate_50grs))
            intent.putExtra("ingredient_10", getString(R.string.mantequilla))

            intent.putExtra("sustituto_1", getString(R.string.mezcla_para_panque_taza))

            intent.putExtra("optional_1", getString(R.string.azucar_glas))
            intent.putExtra("optional_2", getString(R.string.cajeta))
            intent.putExtra("optional_3", getString(R.string.dulce_leche))
            intent.putExtra("optional_4", getString(R.string.crema_batida))
            intent.putExtra("optional_5", getString(R.string.chocolate_liquido))

            intent.putExtra("preparation1", getString(R.string.panque_platano_taza_preparation))

            startActivity(intent)
        }
    }
}