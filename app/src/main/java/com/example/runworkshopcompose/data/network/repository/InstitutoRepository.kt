package com.example.runworkshopcompose.data.network.repository

import com.example.runworkshopcompose.data.network.database.entities.InstitutoEntity
import com.example.runworkshopcompose.data.network.database.entities.dao.InstitutoDao
import com.example.runworkshopcompose.data.network.response.InstitutoModel
import com.example.runworkshopcompose.data.network.service.InstitutoService
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.domain.model.toDomain
import javax.inject.Inject

class InstitutoRepository @Inject constructor(
    private val api: InstitutoService,
    private val institutoDao: InstitutoDao
) {

    suspend fun getAllInstitutosFromApi(): List<Instituto> {
        val response: List<InstitutoModel> = api.getInstituto()
        return response.map { it.toDomain() }
    }

    suspend fun getAllInstitutosFromDatabase(): List<Instituto> {
        val response: List<InstitutoEntity> = institutoDao.getAllInstitutos()
        return response.map { it.toDomain() }
    }

    suspend fun insertInstitutos(institutos: List<InstitutoEntity>) {
        institutoDao.insertAllInstitutos(institutos)
    }

    suspend fun clearInstitutos() {
        institutoDao.deleteAllInstitutos()
    }

}
//5
//Esta clase se encarga de gestionar si accedemos a network o a database


