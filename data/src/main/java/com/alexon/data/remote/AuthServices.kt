package com.alexon.data.remote

import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthServices {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>
}