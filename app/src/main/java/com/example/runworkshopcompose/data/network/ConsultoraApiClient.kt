package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.ConsultoraModel
import retrofit2.Response
import retrofit2.http.GET

interface ConsultoraApiClient {
    @GET("/rwconsultoras")
    suspend fun getAllConsultoras(): Response<List<ConsultoraModel>>
}