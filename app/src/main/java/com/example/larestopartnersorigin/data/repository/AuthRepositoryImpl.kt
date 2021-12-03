package com.example.larestopartnersorigin.data.repository

import com.example.larestopartnersorigin.data.cache.AppDatabase
import com.example.larestopartnersorigin.domailn.repository.AuthRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthRepositoryImpl @Inject
constructor(val mainDatabase: AppDatabase) : AuthRepository {
    override fun getUser(): Single<Int> {
        return mainDatabase.userSignUpOptionsDao()
            .getSignUpOption().subscribeOn(Schedulers.io())
            .observeOn((AndroidSchedulers.mainThread()))
    }
}