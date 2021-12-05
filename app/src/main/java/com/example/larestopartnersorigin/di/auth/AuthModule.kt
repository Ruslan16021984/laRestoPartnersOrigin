package com.example.larestopartnersorigin.di.auth

import com.example.larestopartnersorigin.data.network.ApiFacebookService
import com.example.larestopartnersorigin.data.network.ApiLaRestoService
import com.example.larestopartnersorigin.data.repository.ApiFacebookRepositoryImpl
import com.example.larestopartnersorigin.data.repository.ApiLarestoRepositoryImpl
import com.example.larestopartnersorigin.data.repository.AuthRepositoryImpl
import com.example.larestopartnersorigin.domailn.repository.ApiLarestoRepository
import com.example.larestopartnersorigin.domailn.repository.AppFacebookRepository
import com.example.larestopartnersorigin.domailn.repository.AuthRepository
import com.example.larestopartnersorigin.domailn.utils.Constants.Companion.API_URL_FACEBOOK
import com.example.larestopartnersorigin.domailn.utils.Constants.Companion.API_URL_LARESTO
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.FlowPreview
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@FlowPreview
@Module
@InstallIn(SingletonComponent::class)
class AuthModule {

    @Singleton
    @Provides
    fun provideRetrofit( builder: Retrofit.Builder): Retrofit {
        return builder.baseUrl(API_URL_LARESTO).build()
    }
    @Singleton
    @Provides
    @Inject
    @Named("ApiFaceBookRetrofit")
    fun provideRetrofitFB( @Named("ApiFaceBook")builder: Retrofit.Builder): Retrofit {
        return builder.baseUrl(API_URL_FACEBOOK).build()
    }
    @Singleton
    @Provides
    @Inject
    fun provideFBApiService(@Named("ApiFaceBookRetrofit")retrofit: Retrofit): ApiFacebookService {
        return retrofit.create(ApiFacebookService::class.java)
    }
    @Singleton
    @Provides
    @Named("ApiLaRestoRetrofit")
    @Inject
    fun provideLaRestoRetrofit( @Named("ApiLaResto")builder: Retrofit.Builder): Retrofit{
        return builder.baseUrl(API_URL_LARESTO).build()
    }
    @Singleton
    @Provides
    @Inject
    fun provideApiLarestoService(@Named("ApiLaRestoRetrofit")retrofit: Retrofit): ApiLaRestoService{
        return retrofit.create(ApiLaRestoService::class.java)
    }

}

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule{
    @Singleton
    @Binds
   abstract fun provideAuthRepository(mainDatabase: AuthRepositoryImpl): AuthRepository
    @Singleton
    @Binds
   abstract fun provideApiLarestoRepository(apiLaRestoService: ApiLarestoRepositoryImpl): ApiLarestoRepository
    @Singleton
    @Binds
   abstract fun provideAppFacebookRepository(client: ApiFacebookRepositoryImpl):AppFacebookRepository
}