package com.pr.kotlin_mvvm_dagger_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pr.kotlin_mvvm_dagger_retrofit.dagger.DaggerRetrofitComponent
import com.pr.kotlin_mvvm_dagger_retrofit.model.api.Api
import com.pr.kotlin_mvvm_dagger_retrofit.model.repository.MainRepository
import com.pr.pr777.model.Posts
import retrofit2.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }
}