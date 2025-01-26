package com.example.runworkshopcompose.uicompose.login

import android.util.Patterns
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(): ViewModel(){

    private val _email = MutableStateFlow<String>("")
    val email : StateFlow<String> = _email

    private val _password = MutableStateFlow<String>("")
    val password : StateFlow<String> = _password

    private val _isLoginEnable = MutableStateFlow<Boolean>(false)
    val isLoginEnable : StateFlow<Boolean> = _isLoginEnable

    fun onLoginChanged(email:String, password:String){
        _email.value = email
        _password.value = password
        _isLoginEnable.value = enableLogin(email, password)
    }

    private fun enableLogin(email: String, password: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6
}