package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.databinding.ActivityShoppingListBinding

class ShoppingListActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityShoppingListBinding
    private lateinit var noteAdapter: NoteAdapter
    private lateinit var database: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = DatabaseHelper(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        noteAdapter = NoteAdapter(mutableListOf(), this)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ShoppingListActivity)
            adapter = noteAdapter
        }

        binding.btnAdd.setOnClickListener {
            if (binding.etDescription.text.toString().isNotBlank()){
                val note = Note((noteAdapter.itemCount + 1).toLong(), binding.etDescription.text.toString().trim())
                addNoteAuto(note)
                binding.etDescription.text?.clear()
            }

        }
//        binding.etDescription.setText(intent.extras?.getString("add1"))
//        if (binding.etDescription.text.toString().isNotBlank()){
//            val note = Note((noteAdapter.itemCount + 1).toLong(), binding.etDescription.text.toString().trim())
//            addNoteAuto(note)
//            binding.etDescription.text?.clear()
//
//        }
    }

    override fun onStart() {
        super.onStart()
        getData()
    }

    private fun getData(){
        var data = mutableListOf<Note>()

        data.forEach { note ->
            addNoteAuto(note)

        }
    }

    private fun addNoteAuto(note: Note) {
        noteAdapter.add(note)
    }
    private fun deleteNoteAuto(note: Note) {
        val builder = AlertDialog.Builder(this)
            .setTitle(getString(R.string.alert_dialog))
            .setPositiveButton(getString(R.string.dialog_ok), { dialogInterface, i ->
                noteAdapter.remove(note)
            })
            .setNegativeButton(getString(R.string.dialog_cancel), null)

        builder.create().show()


    }

    override fun onLongClick(note: Note) {
        deleteNoteAuto(note)
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}