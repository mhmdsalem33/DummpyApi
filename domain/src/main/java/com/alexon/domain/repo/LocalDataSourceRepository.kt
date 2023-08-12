package com.alexon.domain.repo

import com.alexon.domain.entity.LoginResponse

interface LocalDataSourceRepository {
    fun saveUser( loginResponse: LoginResponse  )
    fun getUser() : LoginResponse?
    fun clearUserData()
    fun clearAllData()
}
