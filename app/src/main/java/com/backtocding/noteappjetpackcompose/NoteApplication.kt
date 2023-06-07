package com.backtocding.noteappjetpackcompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @HiltAndroidApp - This gives hilt access to the entire Application hence below we extend Application class
 * It creates a Dependency Container as it's called at the top level, at the application level.
 * In other words, Hilt can now supply dependencies to any part of the application.
 */
@HiltAndroidApp
class NoteApplication : Application() {
}