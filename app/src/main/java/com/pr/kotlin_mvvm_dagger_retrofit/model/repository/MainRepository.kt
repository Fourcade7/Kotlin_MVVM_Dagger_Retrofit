package com.pr.kotlin_mvvm_dagger_retrofit.model.repository

import android.util.Log
import com.pr.kotlin_mvvm_dagger_retrofit.MainActivity
import com.pr.kotlin_mvvm_dagger_retrofit.dagger.DaggerRetrofitComponent
import com.pr.kotlin_mvvm_dagger_retrofit.model.api.Api
import com.pr.kotlin_mvvm_dagger_retrofit.viewmodel.MainViewModel
import com.pr.pr777.model.Posts
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainRepository constructor(mainViewModel: MainViewModel) {

    @Inject
    lateinit var api: Api
    init {
        val retrofitComponent= DaggerRetrofitComponent.create()
        retrofitComponent.inject(this)
    }

    fun getAllposts(){
        val call=api.getdata()
        call.enqueue(object : Callback<List<Posts>> {
            override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                if (response.code()==200){
                    Log.d("PR77777", "provideApi: invoked response code ${response.code()}")

                }
            }

            override fun onFailure(call: Call<List<Posts>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

}


