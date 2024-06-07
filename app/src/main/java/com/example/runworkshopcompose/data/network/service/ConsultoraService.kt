package com.example.runworkshopcompose.data.network.service

import com.example.runworkshopcompose.data.network.ConsultoraApiClient
import com.example.runworkshopcompose.data.network.response.ConsultoraModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ConsultoraService @Inject constructor(private val consultoraApiClient: ConsultoraApiClient) {
    suspend fun getConsultora(): List<ConsultoraModel> {
        return withContext(Dispatchers.IO) {
            val response = consultoraApiClient.getAllConsultoras()
            response.body() ?: emptyList()
        }
    }

}