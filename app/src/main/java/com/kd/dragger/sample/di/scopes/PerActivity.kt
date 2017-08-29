package com.kd.dragger.sample.di.scopes

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Scope

/**
 * Created by shiwei on 2017/8/29.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
internal annotation class PerActivity
