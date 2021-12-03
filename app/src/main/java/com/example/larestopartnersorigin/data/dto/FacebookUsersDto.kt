package com.example.larestopartnersorigin.data.dto

import com.example.larestopartnersorigin.data.vo.FacebookUsers
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FacebookUsersDto(
    @SerializedName("registration_type")
    @Expose
    var registrationType: Int,
    @SerializedName("user_data")
    @Expose
    var userData: UserDataDto,
)

fun FacebookUsers.toFacebookUsersDto(): FacebookUsersDto {
    return FacebookUsersDto(registrationType = registrationType,
        userData = UserDataDto(userData.email, userData.password))
}