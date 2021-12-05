package com.example.larestopartnersorigin.data.repository

import com.example.larestopartnersorigin.data.dto.*
import com.example.larestopartnersorigin.data.network.ApiLaRestoService
import com.example.larestopartnersorigin.data.vo.RegistrationUser
import com.example.larestopartnersorigin.domailn.repository.ApiLarestoRepository
import io.reactivex.Single
import javax.inject.Inject

class ApiLarestoRepositoryImpl @Inject
constructor(val client: ApiLaRestoService) : ApiLarestoRepository {
    override fun postUserEmail(user: EmailUserServerDto): Single<StatusResponse> {
        return client.registerAccount(user)
    }

    override fun loginRepo(login: EmailUserLoginDto): Single<RegistrationUser> {
        return client.loginUserEmail(login)
            .map {
                RegistrationUser(status = it.status,
                    username = it.username,
                    accessToken = it.accessToken,
                    expirationDate = it.expirationDate)
            }
    }

    override fun getFacebookUser(facebookUser: FacebookUsersDto): Single<RegistrationUser> {
        return client.postFaceBookUsers(facebookUser)
            .map { RegistrationUser(it.status, it.username, it.accessToken, it.expirationDate) }
    }
}