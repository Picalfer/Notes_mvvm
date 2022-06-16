package com.example.notes_mvvm.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notes_mvvm.database.firebase.AppFirebaseRepository
import com.example.notes_mvvm.database.room.AppRoomDatabase
import com.example.notes_mvvm.database.room.AppRoomRepository
import com.example.notes_mvvm.utilits.*

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }

            TYPE_FIREBASE -> {
                REPOSITORY = AppFirebaseRepository()
                REPOSITORY.connectToDatabase({onSuccess()}, { showToast(it)})
            }
        }
    }
}