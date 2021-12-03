package com.example.larestopartnersorigin.domailn.usecase

import com.example.larestopartnersorigin.data.dto.toFacebookUsersDto
import com.example.larestopartnersorigin.data.vo.FacebookUsers
import com.example.larestopartnersorigin.data.vo.RegistrationUser
import com.example.larestopartnersorigin.domailn.repository.ApiLarestoRepository
import io.reactivex.Single

class GetFacebookUserUseCase(val result: ApiLarestoRepository) {
    fun getFaceBookUser(facebookUsers: FacebookUsers):Single<RegistrationUser>{
        return result.getFacebookUser(facebookUsers.toFacebookUsersDto())
    }
}