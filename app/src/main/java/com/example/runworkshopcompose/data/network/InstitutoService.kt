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
/*Cuando el repositorio decide hacer el llamado por internet, lo hace a traves de esta clase service
Si en un futuro decidimos cambiar firebase, o retrofit, o los endpoint etc, solo modificamos esta clase,
porque esta clase es la dedicada a hacer la peticion  a internet*/