package com.alexon.domain.usecase

import android.util.Log
import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.common.ResponseState
import com.alexon.domain.repo.AuthRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoginUserCase( private val authRepo: AuthRepo ) {
    fun login( loginRequest: LoginRequest ) :Flow<ResponseState<LoginResponse>> =  flow {
      try {
          emit(ResponseState.Loading())
          val response = authRepo.login( loginRequest )
          if (response.isSuccessful) {
              Log.d("testApp" , "success")
              response.body()?.let { emit(ResponseState.Success(it) ) } ?: emit(ResponseState.NullData())
          } else {
              emit(ResponseState.Error("API request failed"))
              Log.d("testApp" , "faild")

          }
      }catch (e : Throwable)
      {

      }
    }
}
