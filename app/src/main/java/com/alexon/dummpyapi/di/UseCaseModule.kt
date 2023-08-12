package com.alexon.dummpyapi.di


import com.alexon.domain.repo.AuthRepo
import com.alexon.domain.repo.DummyRepo
import com.alexon.domain.usecase.GetDummyProductsUseCase
import com.alexon.domain.usecase.LoginUserCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

   @Provides
   fun provideUseCase(dummyRepo: DummyRepo) : GetDummyProductsUseCase = GetDummyProductsUseCase(dummyRepo)

   @Provides
   fun provideLoginUseCase(authRepo: AuthRepo) : LoginUserCase = LoginUserCase(authRepo)


}