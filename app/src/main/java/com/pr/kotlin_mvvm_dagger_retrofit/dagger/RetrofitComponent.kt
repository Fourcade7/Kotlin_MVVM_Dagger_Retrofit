package com.pr.kotlin_mvvm_dagger_retrofit.dagger

import com.pr.kotlin_mvvm_dagger_retrofit.MainActivity
import com.pr.kotlin_mvvm_dagger_retrofit.dagger.module.RetrofitModule
import com.pr.kotlin_mvvm_dagger_retrofit.model.repository.MainRepository
import dagger.Component

@Component(modules = [RetrofitModule::class])
interface RetrofitComponent {
    fun inject(mainRepository: MainRepository)
}