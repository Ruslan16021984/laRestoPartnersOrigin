package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EmailUserLoginDto(
    @SerializedName("registration_type")
    @Expose
    val registrationType: Int,
    @SerializedName("user_data")
    @Expose
    val userData: UserDataDto
)
