package com.example.runworkshopcompose.uicompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.runworkshopcompose.domain.GetInstitutoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(private val institutoUseCase: GetInstitutoUseCase) :ViewModel() {

    private val _instituto = MutableLiveData<String>()
    val instituto:LiveData<String> = _instituto


}


