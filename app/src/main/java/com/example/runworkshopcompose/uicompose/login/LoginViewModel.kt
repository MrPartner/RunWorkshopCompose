package com.example.runworkshopcompose.uicompose.login

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
): ViewModel(){


    private val _email = MutableStateFlow<String>("")
    val email : StateFlow<String> = _email

    private val _password = MutableStateFlow<String>("")
    val password : StateFlow<String> = _password

    private val _isLoginEnable = MutableStateFlow<Boolean>(false)
    val isLoginEnable : StateFlow<Boolean> = _isLoginEnable

    private val _isLoading= MutableStateFlow<Boolean>(false)
    val isLoading : StateFlow<Boolean> = _isLoading

    fun onLoginChanged(email:String, password:String){
        _email.value = email
        _password.value = password
        _isLoginEnable.value = enableLogin(email, password)
    }

    private fun enableLogin(email: String, password: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6

    //funcion que se llama cuando el obotn de login haya sido pulsado
    fun onLoginSelected(){
        viewModelScope.launch {
            _isLoading.value = true
            val result = loginUseCase(email.value, password.value)
            if(result){
                //Navegar a la siguiente pantalla
            }
            _isLoading.value = false
        }
    }
}