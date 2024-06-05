package com.example.runworkshopcompose.core.network.di

import com.example.runworkshopcompose.data.network.InstitutoApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.2:9090/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideInstitutoApiClient(retrofit: Retrofit): InstitutoApiClient {
        return retrofit.create(InstitutoApiClient::class.java)
    }

}

//@Singleton
//@Provides
//fun provideRetrofit(): Retrofit {
//    return Retrofit.Builder()
//        .baseUrl("http://192.168.1.7:9090/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//}

