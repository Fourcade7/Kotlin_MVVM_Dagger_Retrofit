package com.pr.kotlin_mvvm_dagger_retrofit.dagger

import com.pr.kotlin_mvvm_dagger_retrofit.MainActivity
import dagger.Component

@Component(modules = [RetrofitModule::class])
interface RetrofitComponent {
    fun inject(mainActivity: MainActivity)
}