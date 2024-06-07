package com.example.runworkshopcompose.domain.usecase

import com.example.runworkshopcompose.data.network.database.entities.toDatabase
import com.example.runworkshopcompose.data.network.repository.UniversidadRepository
import com.example.runworkshopcompose.domain.model.Universidad
import javax.inject.Inject

class GetUniversidadesUseCase @Inject constructor(private val repository: UniversidadRepository) {

    suspend operator fun invoke():List<Universidad>{
        val universidades = repository.getAllUniversidadesFromApi()

        return if (universidades.isNotEmpty()){
            repository.clearUniversidades()
            repository.insertUniversidades(universidades.map { it.toDatabase() })
            universidades
        }else{
            repository.getAllUniversidadesFromDatabase()
        }
    }
}