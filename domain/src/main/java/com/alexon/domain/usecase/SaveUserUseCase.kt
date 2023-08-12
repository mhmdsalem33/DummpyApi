package com.alexon.domain.usecase

import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.repo.LocalDataSourceRepository
import javax.inject.Inject

class SaveUserUseCase @Inject constructor(private val localDataSourceRepository: LocalDataSourceRepository) {
    operator fun  invoke(loginResponse: LoginResponse) = localDataSourceRepository.saveUser(loginResponse)
}