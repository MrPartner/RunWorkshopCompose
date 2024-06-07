package com.example.runworkshopcompose.core.network.di

import android.content.Context
import androidx.room.Room
import com.example.runworkshopcompose.data.network.database.entities.InstitutoDatabase
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

    @Singleton
    @Provides
    fun provideRoomInstituto(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, InstitutoDatabase::class.java, INSTITUTO_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideInstitutoDao(db:InstitutoDatabase) = db.getInstitutoDao()
}
//4