package com.example.runworkshopcompose.domain.model

import com.example.runworkshopcompose.data.network.database.entities.InstitutoEntity
import com.example.runworkshopcompose.data.network.response.InstitutoModel

data class Instituto(
    val instituto: String,
    val direccion: String,
    val audiencia: String,
    val taller: String,
    val descripcion: String,
    val costo: String,
    val fecha: String,
    val hora: String,
)

fun InstitutoModel.toDomain() =
    Instituto(instituto, direccion, audiencia, taller, descripcion, costo, fecha, hora)

fun InstitutoEntity.toDomain() =
    Instituto(instituto, direccion, audiencia, taller, descripcion, costo, fecha, hora)

//6 Room Esta es la data class que usa dominio y ui