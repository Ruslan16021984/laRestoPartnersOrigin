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
    var userData: UserDataWithFacebookDto,
)

fun FacebookUsers.toFacebookUsersDto(): FacebookUsersDto {
    return FacebookUsersDto(registrationType = registrationType,
        userData = UserDataWithFacebookDto(firstName = userData.firstName,
            lastName = userData.lastName,
            accessToken = userData.accessToken,
            email = userData.email,
            fullName = userData.fullName,
        inputToken = userData.inputToken,
        picture = userData.picture,
        userId = userData.userId))
}