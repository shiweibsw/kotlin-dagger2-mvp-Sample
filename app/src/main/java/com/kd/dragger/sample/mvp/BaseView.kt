package com.kd.dragger.sample.mvp

/**
 * Created by shiwei on 2017/8/29.
 */
interface BaseView<T> {

    fun setPresenter(presenter:T)

    fun setLoadingIndicator(active:Boolean)
}