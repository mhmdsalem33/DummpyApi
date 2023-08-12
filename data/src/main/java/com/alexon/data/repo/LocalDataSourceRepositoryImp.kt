package com.alexon.data.repo

import com.alexon.data.local.datasource.LocalDataSource
import com.alexon.domain.entity.LoginResponse
import com.alexon.domain.repo.LocalDataSourceRepository
import javax.inject.Inject

class LocalDataSourceRepositoryImp @Inject constructor(private val localDataSource: LocalDataSource) :
    LocalDataSourceRepository {

    override fun saveUser(loginResponse: LoginResponse) {
        localDataSource.saveUser(loginResponse)
    }
    override fun getUser(): LoginResponse? {
        return localDataSource.getUser()
    }
    override fun clearUserData() {
        localDataSource.clearUserData()
    }
    override fun clearAllData() {
        localDataSource.clearAllData()
    }
}