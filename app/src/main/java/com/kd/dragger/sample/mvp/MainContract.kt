package com.kd.dragger.sample.mvp

/**
 * Created by shiwei on 2017/8/29.
 */
interface MainContract {

    interface View :BaseView<Presenter>{
        fun updateUI()
    }

    interface Presenter:BasePresenter{
        fun loadDatas()
    }
}