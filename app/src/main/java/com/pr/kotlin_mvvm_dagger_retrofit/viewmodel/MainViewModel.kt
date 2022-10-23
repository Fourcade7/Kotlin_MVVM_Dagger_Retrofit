package com.pr.kotlin_mvvm_dagger_retrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pr.kotlin_mvvm_dagger_retrofit.model.repository.MainRepository
import com.pr.pr777.model.Posts

class MainViewModel:ViewModel() {
   var mylivedata=MutableLiveData<ArrayList<Posts>>()
   val mainRepository: MainRepository

   init {
      mainRepository= MainRepository(this)
   }


   fun getAllPosts():MutableLiveData<ArrayList<Posts>>{
      mylivedata=mainRepository.getAllposts()
      return mylivedata
   }

   fun makeApicall(){
      mainRepository.gorequest()
   }

}