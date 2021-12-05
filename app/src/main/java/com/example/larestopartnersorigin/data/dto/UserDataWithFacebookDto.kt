package com.example.larestopartnersorigin.data.dto

import com.example.larestopartnersorigin.data.vo.Picture
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserDataWithFacebookDto(
    @SerializedName("first_name")
    @Expose
    var firstName: String,
    @SerializedName("last_name")
    @Expose
    var lastName: String,
    @SerializedName("picture")
    @Expose
    var picture: Picture? = null,
    @SerializedName("user_id")
    @Expose
    var userId: String,
    @SerializedName("access_token")
    @Expose
    var accessToken: String,
    @SerializedName("input_token")
    @Expose
    var inputToken: String,
    @SerializedName("email")
    @Expose
    var email: String,
    @SerializedName("full_name")
    @Expose
    var fullName: String,
)