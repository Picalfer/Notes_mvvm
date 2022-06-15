package com.example.notes_mvvm.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notes_mvvm.utilits.REPOSITORY

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
}