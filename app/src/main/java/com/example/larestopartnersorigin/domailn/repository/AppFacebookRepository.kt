package com.example.larestopartnersorigin.domailn.repository

import com.example.larestopartnersorigin.data.vo.FacebookUsers
import io.reactivex.Single
import org.json.JSONObject

interface AppFacebookRepository {
    fun getUserToken(
        grantType: String,
        clientId: String,
        clientSecretKey: String,
        jsonObject: JSONObject,
        accessToken: String
    ): Single<FacebookUsers>

}