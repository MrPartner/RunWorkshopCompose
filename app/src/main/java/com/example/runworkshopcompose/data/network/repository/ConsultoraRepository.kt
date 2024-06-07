package com.example.runworkshopcompose.data.network.repository

import com.example.runworkshopcompose.data.network.database.entities.ConsultoraEntity
import com.example.runworkshopcompose.data.network.database.entities.dao.ConsultoraDao
import com.example.runworkshopcompose.data.network.response.ConsultoraModel
import com.example.runworkshopcompose.data.network.service.ConsultoraService
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.domain.model.toDomain
import javax.inject.Inject

class ConsultoraRepository @Inject constructor(
    private val api: ConsultoraService,
    private val consultoraDao: ConsultoraDao
) {

    suspend fun getAllConsultorasFromApi(): List<Consultora> {
        val response: List<ConsultoraModel> = api.getConsultora()
        return response.map { it.toDomain() }
    }

    suspend fun getAllConsultorasFromDatabase(): List<Consultora> {
        val response: List<ConsultoraEntity> = consultoraDao.getAllConsultoras()
        return response.map { it.toDomain() }
    }

    suspend fun insertConsultoras(consultoras: List<ConsultoraEntity>) {
        consultoraDao.insertAllConsultoras(consultoras)
    }

    suspend fun clearConsultoras() {
        consultoraDao.deleteAllConsultoras()
    }
}