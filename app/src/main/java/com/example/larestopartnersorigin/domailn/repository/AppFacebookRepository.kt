package com.example.larestopartnersorigin.domailn.repository

import com.example.larestopartnersorigin.data.dto.FacebookResponse
import io.reactivex.Single

interface AppFacebookRepository {
    fun getUserToken(
        grantType: String,
        clientId: String,
        clientSecretKey: String
    ): Single<FacebookResponse>

}