package com.example.runworkshopcompose.data.network.repository

import com.example.runworkshopcompose.data.network.database.entities.UniversidadEntity
import com.example.runworkshopcompose.data.network.database.entities.dao.UniversidadDao
import com.example.runworkshopcompose.data.network.response.UniversidadModel
import com.example.runworkshopcompose.data.network.service.UniversidadService
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.domain.model.toDomain
import javax.inject.Inject

class UniversidadRepository @Inject constructor(
    private val api: UniversidadService,
    private val universidadDao: UniversidadDao
) {

    suspend fun getAllUniversidadesFromApi(): List<Universidad> {
        val response: List<UniversidadModel> = api.getUniversidad()
        return response.map { it.toDomain() }
    }

    suspend fun getAllUniversidadesFromDatabase(): List<Universidad> {
        val response: List<UniversidadEntity> = universidadDao.getAllUniversidades()
        return response.map { it.toDomain() }
    }

    suspend fun insertUniversidades(universidades: List<UniversidadEntity>) {
        universidadDao.insertAllUniversidades(universidades)
    }

    suspend fun clearUniversidades() {
        universidadDao.deleteAllUniversidades()
    }
}