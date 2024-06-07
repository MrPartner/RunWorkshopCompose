package com.example.runworkshopcompose.data.network.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.runworkshopcompose.domain.model.Instituto

//Esta entidad se usa para Room
@Entity(tableName = "institutos") //Este es el nombre de la tabla en la db
data class InstitutoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "instituto") val instituto: String,
    @ColumnInfo(name = "direccion") val direccion: String,
    @ColumnInfo(name = "audiencia") val audiencia: String,
    @ColumnInfo(name = "taller") val taller: String,
    @ColumnInfo(name = "descripcion") val descripcion: String,
    @ColumnInfo(name = "costo") val costo: String,
    @ColumnInfo(name = "fecha") val fecha: String,
    @ColumnInfo(name = "hora") val hora: String,
)

fun Instituto.toDatabase() = InstitutoEntity(
    instituto = instituto,
    direccion = direccion,
    audiencia = audiencia,
    taller = taller,
    descripcion = descripcion,
    costo = costo,
    fecha = fecha,
    hora = hora
)
//1