package com.example.notes_mvvm.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notes_mvvm.models.AppNote

@Dao // data access option
interface AppRoomDao {
    @Query("SELECT * from notes_tables")
    fun getAllNotes(): LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}