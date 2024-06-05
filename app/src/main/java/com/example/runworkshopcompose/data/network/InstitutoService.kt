package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.InstitutoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class InstitutoService @Inject constructor(private val institutoApiClient: InstitutoApiClient){

    suspend fun getInstituto() :List<InstitutoModel>{
        return withContext(Dispatchers.IO) {
            val response = institutoApiClient.getAllInstitutos()
            response.body() ?: emptyList()

        }

    }

}
//4

//suspend fun getInstituto(): List<InstitutoModel> {
//    return withContext(Dispatchers.IO) {
//        val response = api.getAllInstitutos()
//        response.body() ?: emptyList()