package com.pr.kotlin_mvvm_dagger_retrofit.dagger.module

import android.util.Log
import com.pr.kotlin_mvvm_dagger_retrofit.model.api.Api
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton



@Module
class RetrofitModule {


    @Provides
    fun provideApi(retrofit: Retrofit): Api {
        val api=retrofit.create(Api::class.java)
        return api
    }

    @Provides
    fun provideRetrofit():Retrofit{
        val retrofit=Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}