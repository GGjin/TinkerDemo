package com.gg.tinkerdemo

import android.app.Application
import android.content.Intent
import com.tencent.bugly.Bugly
import com.tencent.tinker.loader.app.DefaultApplicationLike
import android.support.multidex.MultiDex
import android.os.Build
import android.annotation.TargetApi
import android.content.Context
import com.tencent.bugly.beta.Beta


/**
 * Creator : GG
 * Date    : 2018/3/8
 * Mail    : gg.jin.yu@gmai.com
 * Explain :
 */
class MyApplicationLike(application: Application?, tinkerFlags: Int, tinkerLoadVerifyFlag: Boolean, applicationStartElapsedTime: Long, applicationStartMillisTime: Long, tinkerResultIntent: Intent?)
    : DefaultApplicationLike(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent) {


    override fun onCreate() {
        super.onCreate()
        Bugly.setIsDevelopmentDevice(application, true)

        Bugly.init(application, "ab41f0c7f5", true)
    }


    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    override fun onBaseContextAttached(base: Context) {
        super.onBaseContextAttached(base)
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base)

        // 安装tinker
        // TinkerManager.installTinker(this); 替换成下面Bugly提供的方法
        Beta.installTinker(this)
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    fun registerActivityLifecycleCallback(callbacks: Application.ActivityLifecycleCallbacks) {
        application.registerActivityLifecycleCallbacks(callbacks)
    }

    override fun onTerminate() {
        super.onTerminate()
        Beta.unInit()
    }
}