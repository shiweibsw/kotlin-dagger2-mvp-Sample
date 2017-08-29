package com.kd.dragger.sample.di

import com.kd.dragger.sample.MainActivity
import com.kd.dragger.sample.di.scopes.PerActivity
import dagger.Subcomponent

/**
 * Created by shiwei on 2017/8/29.
 */
@PerActivity
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity:MainActivity)
}