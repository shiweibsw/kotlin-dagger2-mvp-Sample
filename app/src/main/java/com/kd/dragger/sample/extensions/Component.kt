package com.kd.dragger.sample.extensions

import android.app.Activity
import com.kd.dragger.sample.App

/**
 * Created by shiwei on 2017/8/29.
 */
val Activity.app: App
    get() = application as App