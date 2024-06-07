package com.example.runworkshopcompose.domain.usecase

import com.example.runworkshopcompose.data.network.database.entities.toDatabase
import com.example.runworkshopcompose.data.network.repository.ConsultoraRepository
import com.example.runworkshopcompose.domain.model.Consultora
import javax.inject.Inject

class GetConsultorasUseCase @Inject constructor(private val repository: ConsultoraRepository) {

    suspend operator fun invoke():List<Consultora>{
        val consultoras = repository.getAllConsultorasFromApi()

        return if (consultoras.isNotEmpty()){
            repository.clearConsultoras()
            repository.insertConsultoras(consultoras.map { it.toDatabase() })
            consultoras
        }else{
            repository.getAllConsultorasFromDatabase()
        }
    }
}