package com.alexon.data.remote

import com.alexon.domain.entity.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("products/1")
    suspend fun getDummyProducts() : Response<ProductResponse>
}