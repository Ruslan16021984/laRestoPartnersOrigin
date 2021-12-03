package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FacebookResponse(
    @SerializedName("access_token")
    @Expose
    val accessToken: String,
    @SerializedName("token_type")
    @Expose
    val tokenType: String,
)