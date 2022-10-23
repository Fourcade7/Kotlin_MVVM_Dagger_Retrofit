package com.pr.kotlin_mvvm_dagger_retrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pr.kotlin_mvvm_dagger_retrofit.model.repository.MainRepository
import com.pr.pr777.model.Posts

class MainViewModel:ViewModel() {
   val mylivedata=MutableLiveData<List<Posts>>()

   init {
      val mainRepository= MainRepository(this)
      mainRepository.getAllposts()
   }

}