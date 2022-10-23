package com.pr.kotlin_mvvm_dagger_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pr.kotlin_mvvm_dagger_retrofit.dagger.DaggerRetrofitComponent
import com.pr.pr777.model.Posts
import retrofit2.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var api: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitComponent=DaggerRetrofitComponent.create()
        retrofitComponent.inject(this)

        val call=api.getdata()
        call.enqueue(object :Callback<List<Posts>>{
            override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                if (response.code()==200){
                    Toast.makeText(this@MainActivity,"200",Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<Posts>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}