package com.backtocding.noteappjetpackcompose.data

import com.backtocding.noteappjetpackcompose.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Have a nice day", description = "It was a great day today"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Movie Plan", description = "Go for a movie"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
            Note(title = "Have a nice day too", description = "Today was a nice day"),
        )
    }
}