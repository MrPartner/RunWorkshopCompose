package com.example.runworkshopcompose.core.network.di

import android.content.Context
import androidx.room.Room
import com.example.runworkshopcompose.data.network.database.entities.ConsultoraDatabase
import com.example.runworkshopcompose.data.network.database.entities.InstitutoDatabase
import com.example.runworkshopcompose.data.network.database.entities.UniversidadDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Este objeto nos provee las database creadas en las clases abstractas
@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val INSTITUTO_DATABASE_NAME = "rwinstitutos"
    private const val CONSULTORA_DATABASE_NAME = "rwconsultoras"
    private const val UNIVERSIDAD_DATABASE_NAME = "rwuniversidades"

    @Singleton
    @Provides
    fun provideRoomInstituto(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, InstitutoDatabase::class.java, INSTITUTO_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideInstitutoDao(db:InstitutoDatabase) = db.getInstitutoDao()

    @Singleton
    @Provides
    fun provideRoomConsultora(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, ConsultoraDatabase::class.java, CONSULTORA_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideConsultoraDao(db:ConsultoraDatabase) = db.getConsultoraDao()

    @Singleton
    @Provides
    fun provideRoomUniversidad(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, UniversidadDatabase::class.java, UNIVERSIDAD_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideUniversidadDao(db:UniversidadDatabase) = db.getUniversidadDao()
}
//4