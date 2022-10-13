package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity(), OnClickListenerHelper {
    private lateinit var binding: ActivityHelpBinding
    private lateinit var helpListAdapter: HelpAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val args = intent.getBundleExtra("sendHelpListBundle")
        val serialisableList = args!!.getSerializable("sendHelpList") as ArrayList<Help>

        helpListAdapter = HelpAdapter(serialisableList, this)

        binding.rvHelper.apply {
            layoutManager = LinearLayoutManager(this@HelpActivity)
            adapter = helpListAdapter
        }






    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onLongClick(help: Help) {

    }


}























































