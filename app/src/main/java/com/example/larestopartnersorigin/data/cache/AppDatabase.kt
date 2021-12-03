package com.example.larestopartnersorigin.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserSignUpOptionsEntity::class, FacebookUsersEntity::class],
    version = 1,
    exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userSignUpOptionsDao(): UserSignUpOptionsDao

    companion object{
        val DATABASE_NAME: String = "app_db"
    }
}