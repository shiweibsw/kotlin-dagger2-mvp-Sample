package com.kd.dragger.sample.mvp

import javax.inject.Inject

/**
 * Created by shiwei on 2017/8/29.
 */
class MainPresenter  @Inject constructor(var view: MainContract.View): MainContract.Presenter {
    init {
        view.setPresenter(this)
    }
    override fun loadDatas() {
        view.updateUI()
    }
}