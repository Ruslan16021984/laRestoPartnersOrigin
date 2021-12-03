package com.example.larestopartnersorigin.data.cache

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserSignUpOptions")
data class UserSignUpOptionsEntity(
    @PrimaryKey
    val id: Long,
    val signUpOption: Int
)
