package com.example.cocinarapida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.databinding.ActivityShoppingListBinding
import com.google.android.material.snackbar.Snackbar

class ShoppingListActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityShoppingListBinding
    private lateinit var notesAdapter: NoteAdapter
    private lateinit var notesFinishedAdapter: NoteAdapter
    private lateinit var database: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = DatabaseHelper(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        notesAdapter = NoteAdapter(mutableListOf(), this)
        binding.rvNotes.apply {
            layoutManager = LinearLayoutManager(this@ShoppingListActivity)
            adapter = notesAdapter
        }

        notesFinishedAdapter = NoteAdapter(mutableListOf(), this)
        binding.rvNotesFinished.apply {
            layoutManager = LinearLayoutManager(this@ShoppingListActivity)
            adapter = notesFinishedAdapter
        }


        binding.btnAdd.setOnClickListener {
            if (binding.etDescription.text.toString().isNotBlank()){
                val note = Note (description = binding.etDescription.text.toString().trim())
                note.id = database.insertNote(note)
                if (note.id != Constants.ID_ERROR ) {
                    addNoteAuto(note)
                    binding.etDescription.text?.clear()
                    showMesssage(R.string.message_write_database_success)

                }else{
                   showMesssage(R.string.message_write_database_error)
                }
            }else{
                binding.etDescription.error = "Campo Requerido"
            }
        }
    }

    override fun onStart() {
        super.onStart()
        getData()
    }

    private fun getData(){
        val data = database.getAllNotes()
        data.forEach { note ->
            addNoteAuto(note)
        }
    }

    private fun addNoteAuto(note: Note) {
        if (note.isFinished){
            notesFinishedAdapter.add(note)
        }else{
            notesAdapter.add(note)
        }
    }

    private fun deleteNoteAuto(note: Note) {
        if (note.isFinished) {
            notesAdapter.remove(note)
        }else{
            notesFinishedAdapter.remove(note)
        }
    }

    override fun onLongClick(note: Note, currentAdapter: NoteAdapter) {
        val builder = AlertDialog.Builder(this)
            .setTitle(getString(R.string.alert_dialog))
            .setPositiveButton(getString(R.string.dialog_ok), { dialogInterface, i ->
                if (database.deleteNote(note)) {
                    currentAdapter.remove(note)
                    showMesssage(R.string.message_write_database_success)
                }else{
                    showMesssage(R.string.message_write_database_error)
                }
            })
            .setNegativeButton(getString(R.string.dialog_cancel), null)
        builder.create().show()
    }

    override fun onChecked(note: Note) {
        if (database.updateNote(note)) {
            deleteNoteAuto(note)
            addNoteAuto(note)
        }else{
            showMesssage(R.string.message_write_database_error)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMesssage(msgRes: Int){
        Snackbar.make(binding.root, getString(msgRes), Snackbar.LENGTH_SHORT).show()

    }
}