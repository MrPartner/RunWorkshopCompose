package com.example.runworkshopcompose.domain.model

import com.example.runworkshopcompose.data.network.database.entities.ConsultoraEntity
import com.example.runworkshopcompose.data.network.response.ConsultoraModel

data class Consultora(
    val consultora: String,
    val direccion: String,
    val audiencia: String,
    val taller: String,
    val descripcion: String,
    val costo: String,
    val fecha: String,
    val hora: String,
)

fun ConsultoraModel.toDomain() =
    Consultora(consultora, direccion, audiencia, taller, descripcion, costo, fecha, hora)

fun ConsultoraEntity.toDomain() =
    Consultora(consultora, direccion, audiencia, taller, descripcion, costo, fecha, hora)
