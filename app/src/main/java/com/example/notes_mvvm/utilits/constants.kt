package com.example.notes_mvvm.utilits

import com.example.notes_mvvm.MainActivity
import com.example.notes_mvvm.database.DatabaseRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: DatabaseRepository
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"