package com.example.larestopartnersorigin.domailn.usecase

import com.example.larestopartnersorigin.data.dto.toEmailUserLoginDto
import com.example.larestopartnersorigin.data.vo.EmailUserLogin
import com.example.larestopartnersorigin.data.vo.RegistrationUser
import com.example.larestopartnersorigin.domailn.repository.ApiLarestoRepository
import io.reactivex.Single

class LoginRepoUseCase(val result: ApiLarestoRepository) {
    fun loginRepo(login: EmailUserLogin): Single<RegistrationUser>{
        return result.loginRepo(login.toEmailUserLoginDto())
    }
}