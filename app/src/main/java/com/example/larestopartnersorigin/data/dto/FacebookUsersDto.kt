package com.example.larestopartnersorigin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FacebookUsersDto (
    @SerializedName("registration_type")
    @Expose
    var registrationType: Int,
    @SerializedName("user_data")
    @Expose
    var userData: UserDataDto
)