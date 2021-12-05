package com.example.larestopartnersorigin.presentations.auth.splash

sealed class SplashEvent {
    object loading : SplashEvent()
    class GetUser(value: Int) : SplashEvent()
}
