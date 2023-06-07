package com.backtocding.noteappjetpackcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.backtocding.noteappjetpackcompose.model.Note
import com.backtocding.noteappjetpackcompose.util.DateConverter
import com.backtocding.noteappjetpackcompose.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}