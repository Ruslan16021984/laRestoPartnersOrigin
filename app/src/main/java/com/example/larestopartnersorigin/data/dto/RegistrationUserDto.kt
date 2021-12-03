package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegistrationUserDto(
    @SerializedName("status")
    @Expose
    var status: Boolean = false,
    @SerializedName("user_name")
    @Expose
    var username: String,
    @SerializedName("access_token")
    @Expose
    var accessToken: String,
    @SerializedName("expired")
    @Expose
    var expirationDate: String
)
