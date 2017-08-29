package com.kd.dragger.sample.di

import com.kd.dragger.sample.App
import dagger.Component
import javax.inject.Singleton

/**
 * Created by shiwei on 2017/8/29.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app:App)

    fun plus(homeModule: MainModule): MainComponent
}