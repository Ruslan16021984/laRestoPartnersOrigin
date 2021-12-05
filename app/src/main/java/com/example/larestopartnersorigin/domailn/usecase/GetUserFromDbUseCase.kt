package com.example.larestopartnersorigin.domailn.usecase

import com.example.larestopartnersorigin.domailn.repository.AuthRepository
import io.reactivex.Single

class GetUserFromDbUseCase(val authRepository: AuthRepository) {
    fun getUserFromDb():Single<Int>{
      return  authRepository.getUser()
    }
}