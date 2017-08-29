package com.kd.dragger.sample.di

import com.kd.dragger.sample.MainActivity
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by shiwei on 2017/8/29.
 */
@Singleton
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity:MainActivity)
}