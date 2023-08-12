package com.alexon.dummpyapi.di

import android.content.Context
import com.alexon.data.local.datasource.LocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideSharedPreferencesHelper(@ApplicationContext context: Context): LocalDataSource {
        return LocalDataSource(context)
    }
}