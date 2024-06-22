package com.example.runworkshopcompose.uicompose


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

    private val _institutoUseCase = MutableStateFlow<List<Instituto>>(emptyList())
    val institutoViewModel: StateFlow<List<Instituto>> = _institutoUseCase

    private val _universidadesUseCase = MutableStateFlow<List<Universidad>>(emptyList())
    val universidadViewModel: StateFlow<List<Universidad>> = _universidadesUseCase

    private val _consultorasUseCase = MutableStateFlow<List<Consultora>>(emptyList())
    val consultoraViewModel: StateFlow<List<Consultora>> = _consultorasUseCase

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _institutoUseCase.value = getInstitutoUseCase()
            _universidadesUseCase.value = getUniversidadUseCase()
            _consultorasUseCase.value = getConsultorasUseCase()
        }
    }


}







