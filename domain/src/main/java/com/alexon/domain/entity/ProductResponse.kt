package com.alexon.domain.entity


import androidx.annotation.Keep

@Keep
data class ProductResponse(
    var brand: String?,
    var category: String?,
    var description: String?,
    var discountPercentage: Double?,
    var id: Int?,
    var images: List<String?>?,
    var price: Int?,
    var rating: Double?,
    var stock: Int?,
    var thumbnail: String?,
    var title: String?
)