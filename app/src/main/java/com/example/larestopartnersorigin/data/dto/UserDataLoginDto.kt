package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserDataLoginDto(
    @SerializedName("email")
    @Expose
    val email: String,
    @SerializedName("password")
    @Expose
    val password: String
)
