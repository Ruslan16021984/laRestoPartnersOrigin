package com.example.larestopartnersorigin.data.repository

import com.example.larestopartnersorigin.data.network.ApiFacebookService
import com.example.larestopartnersorigin.data.vo.FacebookUsers
import com.example.larestopartnersorigin.domailn.repository.AppFacebookRepository
import io.reactivex.Single
import org.json.JSONObject
import javax.inject.Inject

class ApiFacebookRepositoryImpl @Inject
constructor(val client: ApiFacebookService): AppFacebookRepository {
    override fun getUserToken(
        grantType: String,
        clientId: String,
        clientSecretKey: String,
        jsonObject: JSONObject,
        accessToken: String,
    ): Single<FacebookUsers> {
        TODO("Not yet implemented")
    }
}