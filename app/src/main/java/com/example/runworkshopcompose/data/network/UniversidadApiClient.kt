package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.UniversidadModel
import retrofit2.Response
import retrofit2.http.GET

interface UniversidadApiClient {

    @GET("/rwuniversidades")
    suspend fun getAllUniversidades(): Response<List<UniversidadModel>>
}