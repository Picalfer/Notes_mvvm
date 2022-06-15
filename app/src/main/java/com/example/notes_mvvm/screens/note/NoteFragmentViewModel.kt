package com.example.notes_mvvm.screens.note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.notes_mvvm.models.AppNote
import com.example.notes_mvvm.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteFragmentViewModel(application: Application) : AndroidViewModel(application) {
    fun delete(note: AppNote, onSuccess: () -> Unit) =
        viewModelScope.launch(Dispatchers.Main) {
            REPOSITORY.delete(note) {
                onSuccess()
            }
        }
}