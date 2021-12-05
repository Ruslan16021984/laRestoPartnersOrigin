package com.example.larestopartnersorigin.data.vo

data class UserDataWithFacebook(
    var firstName: String,
    var lastName: String,
    var picture: Picture? = null,
    var userId: String,
    var accessToken: String,
    var inputToken: String,
    var email: String,
    var fullName: String,
)