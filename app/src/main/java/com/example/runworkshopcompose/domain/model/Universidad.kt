package com.example.runworkshopcompose.domain.model

import com.example.runworkshopcompose.data.network.database.entities.UniversidadEntity
import com.example.runworkshopcompose.data.network.response.UniversidadModel

data class Universidad(
    val universidad: String,
    val direccion: String,
    val audiencia: String,
    val taller: String,
    val descripcion: String,
    val costo: String,
    val fecha: String,
    val hora: String,
)

fun UniversidadModel.toDomain() =
    Universidad(universidad, direccion, audiencia, taller, descripcion, costo, fecha, hora)

fun UniversidadEntity.toDomain() =
    Universidad(universidad, direccion, audiencia, taller, descripcion, costo, fecha, hora)
