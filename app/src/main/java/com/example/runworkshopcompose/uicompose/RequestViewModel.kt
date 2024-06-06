package com.example.runworkshopcompose.uicompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runworkshopcompose.data.network.response.InstitutoModel
import com.example.runworkshopcompose.domain.GetInstitutoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(private val getInstitutoUseCase: GetInstitutoUseCase) :ViewModel() {

    private val _institutoUseCase = MutableLiveData<InstitutoModel>()
    val instituto:LiveData<InstitutoModel> = _institutoUseCase

    fun requestUseCase() {
        viewModelScope.launch {
            val result = getInstitutoUseCase()
        }
    }

}


