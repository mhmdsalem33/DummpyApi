package com.alexon.domain.usecase

import com.alexon.domain.repo.DummyRepo

class GetDummyProductsUseCase( private val dummyRepo: DummyRepo ) {
    suspend fun dummyProducts() = dummyRepo.getDummyProducts()
}