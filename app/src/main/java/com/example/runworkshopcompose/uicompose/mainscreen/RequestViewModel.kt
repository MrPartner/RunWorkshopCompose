package com.example.runworkshopcompose.uicompose.mainscreen


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.domain.usecase.GetInstitutoUseCase
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.domain.usecase.GetConsultorasUseCase
import com.example.runworkshopcompose.domain.usecase.GetUniversidadesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
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

    private val _institutos = MutableStateFlow<List<Instituto>>(emptyList())
    val institutos: StateFlow<List<Instituto>> = _institutos

    private val _universidades = MutableStateFlow<List<Universidad>>(emptyList())
    val universidades: StateFlow<List<Universidad>> = _universidades

    private val _consultoras = MutableStateFlow<List<Consultora>>(emptyList())
    val consultoras: StateFlow<List<Consultora>> = _consultoras

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _institutos.value = getInstitutoUseCase()
            _universidades.value = getUniversidadUseCase()
            _consultoras.value = getConsultorasUseCase()
        }
    }



}







