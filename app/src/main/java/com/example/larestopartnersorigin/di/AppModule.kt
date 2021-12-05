package com.example.larestopartnersorigin.di

import android.app.Application
import androidx.room.Room
import com.example.larestopartnersorigin.BuildConfig
import com.example.larestopartnersorigin.data.cache.AppDatabase
import com.example.larestopartnersorigin.data.cache.UserSignUpOptionsDao
import com.example.larestopartnersorigin.domailn.utils.Constants
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .create()
    }

    @Singleton
    @Provides
    @Named("ApiLaResto")
    fun provideRetrofitLarestoBuilder(): Retrofit.Builder{
        val builder = OkHttpClient.Builder()
            .connectionPool(ConnectionPool(5, 30, TimeUnit.SECONDS))
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG){
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            builder.addInterceptor(httpLoggingInterceptor)
        }
        return Retrofit.Builder().client(builder.build())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }
    @Provides
    @Singleton
    @Named("ApiFaceBook")
    fun provideRetrofitFaceBookBuilder(): Retrofit.Builder{
        val builder = OkHttpClient.Builder()
            .connectionPool(ConnectionPool(5, 30, TimeUnit.SECONDS))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG){
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            builder.addInterceptor(httpLoggingInterceptor)
        }
        return Retrofit.Builder().client(builder.build())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }
    @Singleton
    @Provides
    fun providerAppDb(app: Application): AppDatabase{
        return Room
            .databaseBuilder(app, AppDatabase::class.java, "database")
            .fallbackToDestructiveMigration().build()
    }
    @Singleton
    @Provides
    fun providesUserSignUpOptionDao(db: AppDatabase): UserSignUpOptionsDao {
        return db.userSignUpOptionsDao()
    }
}