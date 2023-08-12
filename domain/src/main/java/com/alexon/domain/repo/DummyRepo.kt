package com.alexon.domain.repo

import com.alexon.domain.entity.ProductResponse
import retrofit2.Response

interface DummyRepo {
    suspend fun getDummyProducts() : Response<ProductResponse>
}