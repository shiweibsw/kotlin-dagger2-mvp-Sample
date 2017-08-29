package com.kd.dragger.sample.di

import com.kd.dragger.sample.mvp.MainContract
import dagger.Module
import dagger.Provides

/**
 * Created by shiwei on 2017/8/29.
 */
@Module
class MainModule( view: MainContract.View) {
    var mView: MainContract.View=view
    @Provides fun provideMainView(): MainContract.View=mView
}