package com.alexon.dummpyapi.presentation.ui.main_activity

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.usecase.GetDummyProductsUseCase
import com.alexon.domain.usecase.LocalDataSourceUseCase
import com.alexon.domain.usecase.LoginUserCase
//import com.alexon.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
//    private val loginUseCase: LoginUseCase,
//private val mainRepository: MainRepository,
    private val getDummyProductsUseCase: GetDummyProductsUseCase,
    private val loginUserCase: LoginUserCase,
    private val localDataSourceUseCase: LocalDataSourceUseCase
) : ViewModel() {

//
//            fun getLoginResponse(loginRequest: LoginRequest) = viewModelScope.launch(Dispatchers.IO){
//                mainRepository.getLoginResponse(loginRequest)
//            }


    fun getDummyProducts() = viewModelScope.launch(Dispatchers.IO) {
        try {
            getDummyProductsUseCase.dummyProducts()
        } catch (e: Throwable) {
            Log.d("testApp", e.message.toString())
        }
    }


    fun login(loginRequest: LoginRequest) = viewModelScope.launch(Dispatchers.IO)
    {
        loginUserCase.login(loginRequest).catch { t ->
            Log.d("testApp", t.message.toString())

        }
            .collect {

            }

    }
    fun saveUser( loginResponse: LoginResponse ) = localDataSourceUseCase.saveUser(loginResponse)
    fun getUser() = localDataSourceUseCase.getUser()



}