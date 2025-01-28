package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginApiClient {
    @GET("v3/a5b12465-f5d3-4b43-bd5f-0c39acb0433d")
    suspend fun doLogin():Response<LoginResponse>
//    suspend fun doLogin(user:String, password:String):Response<LoginResponse>

}