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
            startActivity( Intent(this, Parallevar::class.java))
        }
        binding.btParaIrComiendo.setOnClickListener {
            startActivity(Intent(this, IrComiendo::class.java))
        }
        binding.btParaComerAqui.setOnClickListener {
            startActivity(Intent(this, ParaComerAquiActivity::class.java))
        }
        binding.btBasicos.setOnClickListener {
            startActivity(Intent(this, BasicosActivity::class.java))
        }
        binding.shopingList.setOnClickListener {
            startActivity(Intent(this, ShoppingListActivity::class.java))
        }
        binding.btParaDos.setOnClickListener {
            startActivity(Intent(this, ParaDosActivity::class.java))
        }
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