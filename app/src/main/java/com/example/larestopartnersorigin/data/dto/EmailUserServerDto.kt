package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EmailUserServerDto(
    @Expose
    @SerializedName("email")
    val email: String,
    @Expose
    @SerializedName("full_name")
    val name: String,
    @Expose
    @SerializedName("password")
    val password: String
)
