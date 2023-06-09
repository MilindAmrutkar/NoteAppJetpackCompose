package com.backtocding.noteappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import com.backtocding.noteappjetpackcompose.screen.NoteScreen
import com.backtocding.noteappjetpackcompose.screen.NoteViewModel
import com.backtocding.noteappjetpackcompose.ui.theme.NoteAppJetpackComposeTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @AndroidEntryPoint annotation will identify that this is a dependency container,
 * which means we are able to get the dependencies here.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val noteViewModel = viewModel<NoteViewModel>() // also works
                    val noteViewModel: NoteViewModel by viewModels()
                    NotesApp(noteViewModel)
                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel) {
    val notesList = noteViewModel.noteList.collectAsState().value
    NoteScreen(
        notes = notesList,
        onAddNote = {
            noteViewModel.addNote(it)
        },
        onRemoveNote = {
            noteViewModel.removeNote(it)
        })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteAppJetpackComposeTheme {
    }
}