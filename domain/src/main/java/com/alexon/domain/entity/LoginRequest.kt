package com.alexon.domain.entity

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class LoginRequest(
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("password")
    var password: String? = null
)
