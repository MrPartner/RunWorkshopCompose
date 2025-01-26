package com.example.runworkshopcompose.data.network.repository

import com.example.runworkshopcompose.data.network.service.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val apiLogin: LoginService
){
    suspend fun getLoginFromApi(user: String, password: String): Boolean {
        return apiLogin.doLoginService(user, password)
    }

}