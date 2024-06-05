package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.InstitutoModel
import retrofit2.Response
import retrofit2.http.GET

interface InstitutoApiClient {
    @GET("/rwinstitutos")
    suspend fun getAllInstitutos(): Response<List<InstitutoModel>>
}
//2