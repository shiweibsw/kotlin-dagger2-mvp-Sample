package com.kd.dragger.sample

import android.app.Application
import com.kd.dragger.sample.di.AppComponent
import com.kd.dragger.sample.di.AppModule
import com.kd.dragger.sample.di.DaggerAppComponent

/**
 * Created by shiwei on 2017/8/29.
 */
class App:Application() {

    val component:AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}