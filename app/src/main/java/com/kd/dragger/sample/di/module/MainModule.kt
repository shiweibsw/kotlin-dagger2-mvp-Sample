package com.kd.dragger.sample.di

import com.kd.dragger.sample.MainActivity
import com.kd.dragger.sample.di.scopes.PerActivity
import com.kd.dragger.sample.mvp.MainContract
import dagger.Module
import dagger.Provides

/**
 * Created by shiwei on 2017/8/29.
 */
@Module
class MainModule(var activity: MainActivity) {

    @Provides @PerActivity fun provideMainView(): MainContract.View=activity

}