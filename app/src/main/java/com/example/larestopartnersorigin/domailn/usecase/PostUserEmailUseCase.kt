package com.example.larestopartnersorigin.domailn.usecase

import com.example.larestopartnersorigin.data.dto.StatusResponse
import com.example.larestopartnersorigin.data.dto.toEmailUserServerDto
import com.example.larestopartnersorigin.data.vo.EmailUserServer
import com.example.larestopartnersorigin.domailn.repository.ApiLarestoRepository
import io.reactivex.Single

class PostUserEmailUseCase(val result: ApiLarestoRepository) {
    fun postUserToEmail(emailUserServer: EmailUserServer): Single<StatusResponse> {
       return result.postUserEmail(emailUserServer.toEmailUserServerDto())
    }
}