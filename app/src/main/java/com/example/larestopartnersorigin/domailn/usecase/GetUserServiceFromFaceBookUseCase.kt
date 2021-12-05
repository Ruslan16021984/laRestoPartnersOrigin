package com.example.larestopartnersorigin.domailn.usecase

import android.annotation.SuppressLint
import android.util.Log
import com.example.larestopartnersorigin.data.dto.FacebookResponse
import com.example.larestopartnersorigin.data.vo.FacebookUsers
import com.example.larestopartnersorigin.data.vo.Picture
import com.example.larestopartnersorigin.data.vo.UserDataWithFacebook
import com.example.larestopartnersorigin.domailn.repository.AppFacebookRepository
import io.reactivex.Single
import org.json.JSONObject

class GetUserServiceFromFaceBookUseCase(val repository: AppFacebookRepository) {
    @SuppressLint("CheckResult")
    private lateinit var facebookUsers: FacebookUsers
    @SuppressLint("CheckResult")
    fun getUserToken(
        grantType: String,
        clientId: String,
        clientSecretKey: String,
        jsonObject: JSONObject,
        accessToken: String
    ): Single<FacebookUsers>{
       return repository.getUserToken(grantType, clientId, clientSecretKey).map {
            Log.d("getFaceBookUserService", "$it")
            val faceBookDataToken: FacebookResponse = it
            val facebookPictureObject = jsonObject.getJSONObject("picture")
            val facebookDataObject = facebookPictureObject.getJSONObject("data")
            val facebookProfilePicURL = facebookDataObject.getString("url")
            val facebookProfilePicSilhouette = facebookDataObject.getString("is_silhouette")
            val width: Int = facebookDataObject.getString("width").toInt()
            val height: Int = facebookDataObject.getString("height").toInt()
            val is_silhouette: Boolean = facebookProfilePicSilhouette.toBoolean()
            val picture = Picture(facebookProfilePicURL, width, is_silhouette, height)
            val userData = UserDataWithFacebook(
                jsonObject.getString("first_name")
                , jsonObject.getString("last_name")
                , picture, jsonObject.getString("id")
                , faceBookDataToken.accessToken, accessToken
                , jsonObject.getString("email")
                , jsonObject.getString("name")
            )

            facebookUsers = FacebookUsers(2, userData)
            facebookUsers
        }
    }

}