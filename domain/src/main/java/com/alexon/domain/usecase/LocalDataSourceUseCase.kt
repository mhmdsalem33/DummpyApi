package com.alexon.domain.usecase

import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.repo.LocalDataSourceRepository
import javax.inject.Inject

class LocalDataSourceUseCase @Inject constructor(private val localDataSourceRepository: LocalDataSourceRepository) {
     fun saveUser(loginResponse: LoginResponse) = localDataSourceRepository.saveUser(loginResponse)
     fun getUser() = localDataSourceRepository.getUser()

}