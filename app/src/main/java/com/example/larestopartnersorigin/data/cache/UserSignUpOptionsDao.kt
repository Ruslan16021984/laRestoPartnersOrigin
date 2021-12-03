package com.example.larestopartnersorigin.data.cache

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Single
@Dao
interface UserSignUpOptionsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUserSignUpOption(userSignUpId: UserSignUpOptionsEntity): Completable
    @Update
    fun update(userSignUpId: UserSignUpOptionsEntity): Completable

    @Query("SELECT signUpOption FROM UserSignUpOptions")
    fun getSignUpOption(): Single<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFacebookUserModel(fbUserModel: FacebookUsersEntity): Completable
}