package com.example.runworkshopcompose.domain

import com.example.runworkshopcompose.data.network.InstitutoRepository
import com.example.runworkshopcompose.data.network.response.InstitutoModel
import javax.inject.Inject

class GetInstitutoUseCase @Inject constructor(private val repository: InstitutoRepository){

    //Esta funcion siempre debe retornar lo que el nombre de la clase esta pidiendo
    suspend operator fun invoke(): List<InstitutoModel> {
        val institutos = repository.getAllInstitutosFromApi()
        return institutos
    }
}
//6

//suspend operator fun invoke():List<Instituto>{
//    val institutos = repository.getAllInstitutosFromApi()
//
//    return if (institutos.isNotEmpty()){
//        repository.clearInstitutos()
//        repository.insertInstitutos(institutos.map { it.toDatabase() })
//        institutos
//    }else{
//        repository.getAllInstitutosFromDatabase()
//    }
//}