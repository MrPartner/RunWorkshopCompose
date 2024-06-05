package com.example.runworkshopcompose.data.network

import com.example.runworkshopcompose.data.network.response.InstitutoModel
import javax.inject.Inject

class InstitutoRepository @Inject constructor(private val api : InstitutoService) {

    suspend fun getAllInstitutosFromApi(): List<InstitutoModel>{
        val response: List<InstitutoModel> = api.getInstituto()
        return response
    }
}
//5


//suspend fun getAllInstitutosFromApi(): List<Instituto> {
//    val response: List<InstitutoModel> = api.getInstituto()
//    return response.map { it.toDomain() }
//}