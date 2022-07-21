package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.cocinarapida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btParaLlevar.setOnClickListener {
            openRideActivity()
        }
        binding.btParaIrComiendo.setOnClickListener {
            openTogoActivity()
        }
        binding.btParaComerAqui.setOnClickListener {
            openParaComerAquiActivity()
        }
        binding.btBasicos.setOnClickListener {
            openBasicosActivity()
        }
        binding.shopingList.setOnClickListener {
            openShoppingList()
        }}

    private fun openShoppingList() {
        startActivity(Intent(this, ShoppingListActivity::class.java))
    }

    private fun openParaComerAquiActivity() {
        startActivity(Intent(this, ParaComerAquiActivity::class.java))
    }

    private fun openBasicosActivity() {
        startActivity(Intent(this, BasicosActivity::class.java))
    }

    private fun openTogoActivity() {
        startActivity(Intent(this, IrComiendo::class.java))
    }

    private fun openRideActivity() {
        startActivity( Intent(this, Parallevar::class.java))
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_contactus){
            startActivity(Intent(this, ContactUsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}