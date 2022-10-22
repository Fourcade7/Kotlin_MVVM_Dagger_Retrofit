package com.pr.kotlin_mvvm_dagger_retrofit

import com.pr.pr777.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("posts")
    fun getdata():Call<List<Posts>>

}