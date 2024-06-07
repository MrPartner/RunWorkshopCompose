package com.example.runworkshopcompose.data.network.service

import com.example.runworkshopcompose.data.network.UniversidadApiClient
import com.example.runworkshopcompose.data.network.response.UniversidadModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UniversidadService @Inject constructor(private val universidadApiClient: UniversidadApiClient) {
    suspend fun getUniversidad(): List<UniversidadModel> {
        return withContext(Dispatchers.IO) {
            val response = universidadApiClient.getAllUniversidades()
            response.body() ?: emptyList()
        }
    }

}