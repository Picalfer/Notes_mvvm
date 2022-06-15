package com.example.notes_mvvm.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_tables")
data class AppNote (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo val name: String = "",
    @ColumnInfo val text: String = ""

)