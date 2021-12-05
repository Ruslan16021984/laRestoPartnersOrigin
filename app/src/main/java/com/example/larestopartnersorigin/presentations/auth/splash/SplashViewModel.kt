package com.example.larestopartnersorigin.presentations.auth.splash

import androidx.lifecycle.ViewModel
import com.example.larestopartnersorigin.domailn.usecase.GetUserFromDbUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(val useCase: GetUserFromDbUseCase) :ViewModel(){

}