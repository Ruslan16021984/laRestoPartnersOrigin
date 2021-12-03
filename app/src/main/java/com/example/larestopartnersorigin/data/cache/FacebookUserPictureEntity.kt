package com.example.larestopartnersorigin.data.cache

import androidx.room.Embedded

data class FacebookUserPictureEntity(
    @Embedded
    val data: FacebookUserPictureDataCache
)
