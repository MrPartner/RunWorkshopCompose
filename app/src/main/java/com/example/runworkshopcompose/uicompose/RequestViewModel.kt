package com.example.runworkshopcompose.uicompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.domain.GetInstitutoUseCase
import com.example.runworkshopcompose.domain.model.Instituto
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(private val getInstitutoUseCase: GetInstitutoUseCase) :
    ViewModel() {

    private val _institutoUseCase = MutableLiveData<Instituto>()
    val institutoViewModel: LiveData<Instituto> = _institutoUseCase

    //Aqui tenemos otra captura de la llamada a db, que tampoco ha sido llamada
    val resultOne = getInstitutoUseCase

    //Aqui tenemos capturada la llamada a la db en la variable result que no ha sido llamada todavia
    fun requestUseCase() {
        viewModelScope.launch {
            val result = getInstitutoUseCase()
        }
    }

}


