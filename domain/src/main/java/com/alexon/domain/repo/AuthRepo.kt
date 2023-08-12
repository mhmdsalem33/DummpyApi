package com.alexon.domain.repo

import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import retrofit2.Response


interface AuthRepo {
    suspend fun login(loginRequest: LoginRequest): Response<LoginResponse>
}
