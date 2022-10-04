package com.example.cocinarapida

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import android.widget.Toast
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

//        binding.shareMail.setOnClickListener {
//
//            val info = database.getAllNotes()
//
//            info.forEach { note ->
//                val lissend = arrayListOf(note)
//
//            }
//            val intent = Intent(Intent.ACTION_SENDTO).apply {
//                data = Uri.parse("mailto:")
//                putExtra(Intent.EXTRA_EMAIL, arrayOf("micorreo@gmail.com"))
//                putExtra(Intent.EXTRA_SUBJECT, "base de datos")
//                putExtra(Intent.EXTRA_TEXT, lissend.toString())
//            }
//            startActivity(intent)
//
//        }

        binding.etDescription.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                if (binding.etDescription.text.toString().isNotBlank()){
                    val note = Note (description = binding.etDescription.text.toString().trim())
                    note.id = database.insertNote(note)
                    if (note.id != Constants.ID_ERROR ) {
                        addNoteAuto(note)
                        Toast.makeText(this, "Se agrego " +
                                "${binding.etDescription.text.toString()} a la lista de compras",
                            Toast.LENGTH_SHORT).show()
                        binding.etDescription.text?.clear()
                    }else{
                        showMesssage(R.string.message_write_database_error)
                    }
                }else{
                    binding.etDescription.error = "Campo Requerido"
                }
                return@OnKeyListener true
            }
            false
        })
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

    fun sendList(note: Note){




    }

    override fun onLongClick(note: Note, currentAdapter: NoteAdapter) {
        val builder = AlertDialog.Builder(this)
            .setTitle(getString(R.string.alert_dialog))
            .setPositiveButton(getString(R.string.dialog_ok), { dialogInterface, i ->
                if (database.deleteNote(note)) {
                    currentAdapter.remove(note)
                    Toast.makeText(this, "Se elimino " +
                            "${note.description} a la lista de compras",
                               Toast.LENGTH_SHORT).show()
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




//intent = Intent(Intent.ACTION_SEND)
//intent.putExtra(Intent.EXTRA_TEXT, "${notesAdapter.noteList}")
//intent.setType("text/plain")
//intent.setPackage("com.whatsapp")
//startActivity(intent)