package com.pr.kotlin_mvvm_dagger_retrofit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.pr.kotlin_mvvm_dagger_retrofit.dagger.DaggerRetrofitComponent
import com.pr.kotlin_mvvm_dagger_retrofit.model.api.Api
import com.pr.kotlin_mvvm_dagger_retrofit.model.repository.MainRepository
import com.pr.kotlin_mvvm_dagger_retrofit.viewmodel.MainViewModel
import com.pr.pr777.model.Posts
import retrofit2.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


 lateinit var textView: TextView
 lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textviewresponse)
        progressBar=findViewById(R.id.progressbar1)

        val liveData=MutableLiveData<String>()
        liveData.value="axaxax"

        liveData.observe(this,{
            textView.text=it
        })
        liveData.value="uaxaxax"


        val mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.makeApicall()
        mainViewModel.getAllPosts().observe(this,object :Observer<ArrayList<Posts>>{
            override fun onChanged(t: ArrayList<Posts>?) {

                if (t!=null){
                    progressBar.visibility=View.INVISIBLE
                    textView.text="${t.size}"
                }

            }
        })






    }
}