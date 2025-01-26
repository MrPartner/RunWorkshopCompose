package com.example.runworkshopcompose.data.network.service

import com.example.runworkshopcompose.data.network.LoginApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginService @Inject constructor(private val loginApiClient: LoginApiClient)  {

    suspend fun doLoginService(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val response = loginApiClient.doLogin()
            response.body()?.success ?: false
        }
    }

}