package com.example.runworkshopcompose.uicompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.domain.usecase.GetInstitutoUseCase
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.domain.usecase.GetConsultorasUseCase
import com.example.runworkshopcompose.domain.usecase.GetUniversidadesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(
    private val getInstitutoUseCase: GetInstitutoUseCase,
    private val getUniversidadUseCase: GetUniversidadesUseCase,
    private val getConsultorasUseCase: GetConsultorasUseCase
) :
    ViewModel() {

    private val _institutoUseCase = MutableLiveData<Instituto>()
    val institutoViewModel: LiveData<Instituto> = _institutoUseCase


    init {
        viewModelScope.launch {
            val result = getInstitutoUseCase()
        }
    }

    private val _state = MutableStateFlow<Instituto>(Instituto("", "", "", "", "", "", "", ""))
    val state: StateFlow<Instituto> = _state


}



