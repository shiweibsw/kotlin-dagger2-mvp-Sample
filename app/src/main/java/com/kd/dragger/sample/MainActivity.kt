package com.kd.dragger.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kd.dragger.sample.di.MainModule
import com.kd.dragger.sample.extensions.app
import com.kd.dragger.sample.mvp.MainContract
import com.kd.dragger.sample.mvp.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(),MainContract.View {

    override fun setPresenter(presenter: MainContract.Presenter) {
    }

    override fun setLoadingIndicator(active: Boolean) {
    }

    override fun updateUI() {
        Toast.makeText(this,"update ui",Toast.LENGTH_SHORT).show()
    }

    val component by lazy { app.component.plus(MainModule(this)) }

    @Inject lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        mPresenter.loadDatas()
    }
}
