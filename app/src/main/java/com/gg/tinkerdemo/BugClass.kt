package com.gg.tinkerdemo

import android.util.Log

/**
 * Creator : GG
 * Date    : 2018/3/8
 * Mail    : gg.jin.yu@gmai.com
 * Explain :
 */
class BugClass {
    companion object {
        fun bug(): String {
//            val str: String? = null
//            Log.w("bug", "get bug string length ${str!!.length}")
            return "this a bug class!!!!! this a test toast"
        }
    }
}