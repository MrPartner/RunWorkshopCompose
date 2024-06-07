package com.example.runworkshopcompose.data.network.database.entities.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.runworkshopcompose.data.network.database.entities.InstitutoEntity

//Las Dao recuperan los datos de la db a traves de las Entities
@Dao
interface InstitutoDao {

    @Query("SELECT * FROM institutos ORDER BY fecha DESC")
    suspend fun getAllInstitutos():List<InstitutoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllInstitutos(institutos:List<InstitutoEntity>)

    @Query("DELETE FROM institutos")
    suspend fun deleteAllInstitutos()
}