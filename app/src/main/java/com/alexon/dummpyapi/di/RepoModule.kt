package com.alexon.dummpyapi.di

import com.alexon.data.remote.ApiServices
import com.alexon.data.remote.AuthServices
import com.alexon.data.repo.AuthRepoImpl
import com.alexon.data.repo.DummyRepoImpl
import com.alexon.data.repo.LocalDataSourceRepositoryImp
import com.alexon.domain.repo.AuthRepo
import com.alexon.domain.repo.DummyRepo
import com.alexon.domain.repo.LocalDataSourceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideRepo(apiServices: ApiServices) : DummyRepo = DummyRepoImpl(apiServices)


    @Provides
    @Singleton
    fun provideLoginRepo(authServices: AuthServices) : AuthRepo = AuthRepoImpl(authServices)


    @Module
    @InstallIn(SingletonComponent::class)
    object RepositoryModule {
        @Provides
        @Singleton
        fun provideUserRepository(localDataSourceRepositoryImp: LocalDataSourceRepositoryImp): LocalDataSourceRepository = localDataSourceRepositoryImp
    }

}