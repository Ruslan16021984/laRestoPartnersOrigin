package com.example.larestopartnersorigin.data.network

import com.example.larestopartnersorigin.data.dto.FacebookResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiFacebookService {
    @GET("/oauth/access_token")
    fun getFaceBookResponse(@Query("grant_type")grantType : String = "client_credentials",
                            @Query("client_id")clientId: String,
                            @Query("client_secret")clientSecret: String ): Single<FacebookResponse>
}