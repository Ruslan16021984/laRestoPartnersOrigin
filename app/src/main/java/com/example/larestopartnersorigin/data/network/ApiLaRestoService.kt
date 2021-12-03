package com.example.larestopartnersorigin.data.network

import com.example.larestopartnersorigin.data.dto.*
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiLaRestoService {
    @POST("api/v1/user/registration")
    fun registerAccount(@Body emailUserServer: EmailUserServerDto): Single<StatusResponse>

    @POST("api/v1/user/login")
    fun loginUserEmail(@Body loginUserEmail: EmailUserLoginDto): Single<RegistrationUserDto>

    @POST("api/v1/user/login")
    fun postFaceBookUsers(@Body facebookUsersModel: FacebookUsersDto): Single<RegistrationUserDto>

}