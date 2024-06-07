package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.ConsultoraModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ConsultoraService @Inject constructor(private val api:ConsultoraApiClient) {
    suspend fun getConsultora(): List<ConsultoraModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllConsultoras()
            response.body() ?: emptyList()
        }
    }

}