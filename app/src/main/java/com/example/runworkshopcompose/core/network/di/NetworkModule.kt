package com.example.runworkshopcompose.core.network.di

import com.example.runworkshopcompose.data.network.ConsultoraApiClient
import com.example.runworkshopcompose.data.network.InstitutoApiClient
import com.example.runworkshopcompose.data.network.UniversidadApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//esta clase nos provee Retrofit y solo es usado para Retrofit
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.8:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideInstitutoApiClient(retrofit: Retrofit): InstitutoApiClient {
        return retrofit.create(InstitutoApiClient::class.java)
    }

    @Singleton
    @Provides
    fun provideConsultoraApiClient(retrofit: Retrofit): ConsultoraApiClient {
        return retrofit.create(ConsultoraApiClient::class.java)
    }

    @Singleton
    @Provides
    fun provideUniversidadApiClient(retrofit: Retrofit): UniversidadApiClient {
        return retrofit.create(UniversidadApiClient::class.java)
    }

}

