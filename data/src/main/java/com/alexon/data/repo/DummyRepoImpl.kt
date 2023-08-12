package com.alexon.data.repo

import com.alexon.data.remote.ApiServices
import com.alexon.domain.entity.ProductResponse
import com.alexon.domain.repo.DummyRepo
import retrofit2.Response

class DummyRepoImpl( private val apiServices: ApiServices ) :  DummyRepo{
    override suspend fun getDummyProducts(): Response<ProductResponse> = apiServices.getDummyProducts()
}