package com.example.larestopartnersorigin.domailn.repository

import io.reactivex.Single

interface AuthRepository {
    fun getUser(): Single<Int>
}