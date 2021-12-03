package com.example.larestopartnersorigin.data.vo

data class RegistrationUser(
    var status: Boolean = false,
    var username: String,
    var accessToken: String,
    var expirationDate: String
)
