package com.kd.dragger.sample.di

import com.kd.dragger.sample.App
import com.kd.dragger.sample.ToastUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by shiwei on 2017/8/29.
 */

@Module
class AppModule(val app: App) {

    @Provides @Singleton fun provideApp() = app

    @Provides @Singleton fun provideToastUtil():ToastUtil=ToastUtil(app.applicationContext)

}