package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class StatusResponse(
    @Expose
    @SerializedName("status")
    val status: Boolean = false
)
