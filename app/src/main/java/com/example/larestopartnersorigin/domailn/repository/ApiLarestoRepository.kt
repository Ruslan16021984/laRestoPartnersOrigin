package com.example.larestopartnersorigin.domailn.repository

import com.example.larestopartnersorigin.data.dto.*
import com.example.larestopartnersorigin.data.vo.FacebookUsers
import com.example.larestopartnersorigin.data.vo.RegistrationUser
import io.reactivex.Single

interface ApiLarestoRepository {
    fun postUserEmail(user: EmailUserServerDto): Single<StatusResponse>
    fun loginRepo(login: EmailUserLoginDto): Single<RegistrationUser>
    fun getFacebookUser(facebookUser: FacebookUsersDto): Single<RegistrationUser>
}