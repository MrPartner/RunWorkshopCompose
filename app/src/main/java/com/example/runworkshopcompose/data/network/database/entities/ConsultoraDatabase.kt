package com.example.runworkshopcompose.data.network.database.entities

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.runworkshopcompose.data.network.database.entities.dao.ConsultoraDao

@Database(entities = [ConsultoraEntity::class], version = 1)
abstract class ConsultoraDatabase : RoomDatabase() {

    abstract fun getConsultoraDao(): ConsultoraDao

}