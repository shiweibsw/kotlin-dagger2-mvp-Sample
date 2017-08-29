package com.kd.dragger.sample

import android.content.Context
import android.widget.Toast

class ToastUtil(val mContext: Context) {

    fun showToast(message: String) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show()
    }
}