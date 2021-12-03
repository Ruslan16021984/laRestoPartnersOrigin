package com.example.larestopartnersorigin.data.cache

import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FacebookUser")
data class FacebookUsersEntity(
    @PrimaryKey
    @NonNull
    var userId: String,

    var accessToken: String,
    var expirationDate: String,
    var firstName: String,
    var lastName: String,
    var fullName: String,
    var email: String,
    @Embedded
    var picture: FacebookUserPictureEntity
)
