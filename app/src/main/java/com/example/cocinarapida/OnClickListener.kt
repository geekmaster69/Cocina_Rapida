package com.example.cocinarapida

interface OnClickListener {
    fun onChecked(note: Note)
    fun onLongClick(note: Note, currentAdapter: NoteAdapter)
}