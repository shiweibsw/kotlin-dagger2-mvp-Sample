package com.kd.dragger.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kd.dragger.sample.di.MainModule
import com.kd.dragger.sample.extensions.app
import com.kd.dragger.sample.mvp.MainContract
import com.kd.dragger.sample.mvp.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(),MainContract.View {

    override fun setLoadingIndicator(active: Boolean) {
    }

    override fun updateUI() {
        toast.showToast("updata ui")
    }
    val component by lazy { app.component.plus(MainModule(this)) }

    @Inject lateinit var mPresenter: MainPresenter
    @Inject lateinit var toast:ToastUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        mPresenter.loadDatas()
    }
}
