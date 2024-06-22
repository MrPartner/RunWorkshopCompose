package com.example.runworkshopcompose.data.network.database.entities

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.runworkshopcompose.data.network.database.entities.dao.InstitutoDao


@Database(entities = [InstitutoEntity::class], version = 1, exportSchema = false)
abstract class InstitutoDatabase: RoomDatabase() {

    abstract fun getInstitutoDao(): InstitutoDao

}

//3