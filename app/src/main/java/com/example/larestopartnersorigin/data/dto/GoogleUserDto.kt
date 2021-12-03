package com.example.larestopartnersorigin.data.dto

import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GoogleUserDto(
    @PrimaryKey
    @SerializedName("userId")
    @Expose
    val userId: String,
    @SerializedName("accessToken")
    @Expose
    val accessToken: String,
    @SerializedName("expirationDate")
    @Expose
    val expirationDate: String,
    @Expose
    @SerializedName("email")
    val email: String,
    @Expose
    @SerializedName("name")
    val name: String,
    @Expose
    @SerializedName("lastName")
    val lastName: String
)
