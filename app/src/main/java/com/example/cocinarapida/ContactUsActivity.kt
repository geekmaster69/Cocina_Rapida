package com.example.cocinarapida

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityContactUsBinding
import com.example.cocinarapida.databinding.ActivityDesayunosBinding

class ContactUsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btRecetaplus.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("albeitarray@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Sugerencia de receta")
                putExtra(Intent.EXTRA_TEXT, "Hola!!! Me encantaria que agregaran la siguiente receta...")
            }
            startActivity(intent)
        }

        binding.btSugerencia.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("albeitarray@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Sugerencia de apliacacion")
                putExtra(Intent.EXTRA_TEXT, "Hola!!! Tengo una sugerencia para su aplicacion...")
            }
            startActivity(intent)
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}