package com.example.runworkshopcompose.uicompose


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.domain.usecase.GetInstitutoUseCase
import com.example.runworkshopcompose.domain.model.Instituto
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

    private val _institutoUseCase = MutableStateFlow<List<Instituto>>(emptyList())
    val institutoViewModel: StateFlow<List<Instituto>> = _institutoUseCase


    init {
        viewModelScope.launch {
            fetchData()
        }
    }

    private suspend fun fetchData() {
        _institutoUseCase.value = getInstitutoUseCase.invoke()

    }
}








