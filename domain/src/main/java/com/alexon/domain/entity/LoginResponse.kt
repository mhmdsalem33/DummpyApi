package com.alexon.domain.entity


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class LoginResponse(
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("firstName")
    var firstName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("lastName")
    var lastName: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("username")
    var username: String?=null
)