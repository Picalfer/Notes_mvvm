package com.example.notes_mvvm.screens.add_new_note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.notes_mvvm.models.AppNote
import com.example.notes_mvvm.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddNewNoteViewModel(application: Application) : AndroidViewModel(application) {

    fun insert(note: AppNote, onSuccess:() -> Unit) =
        viewModelScope.launch(Dispatchers.Main) { // в курсе здесь было IO и с ним не работало!
            REPOSITORY.insert(note) {
                onSuccess()
            }
        }
}