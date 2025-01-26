package com.example.runworkshopcompose.domain.usecase

import com.example.runworkshopcompose.data.network.repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository
) {
    suspend operator fun invoke(user: String, password: String): Boolean {
        return loginRepository.getLoginFromApi(user, password)
    }

}