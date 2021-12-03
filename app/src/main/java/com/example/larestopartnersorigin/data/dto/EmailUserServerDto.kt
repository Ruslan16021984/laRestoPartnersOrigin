package com.example.larestopartnersorigin.data.dto

import com.example.larestopartnersorigin.data.vo.EmailUserServer
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
fun EmailUserServerDto.toEmailUserServer(): EmailUserServer{
    return EmailUserServer(email = email, name = name, password = password)
}
fun EmailUserServer.toEmailUserServerDto(): EmailUserServerDto{
    return EmailUserServerDto(email = email, name = name, password = password)
}
