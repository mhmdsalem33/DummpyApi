package com.alexon.data.repo

import com.alexon.data.remote.AuthServices
import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.repo.AuthRepo
import retrofit2.Response

class AuthRepoImpl(private val authServices: AuthServices) : AuthRepo {
    override suspend fun login(loginRequest: LoginRequest) = authServices.login(loginRequest)
}
