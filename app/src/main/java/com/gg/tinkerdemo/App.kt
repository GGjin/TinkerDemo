package com.gg.tinkerdemo

import com.tencent.tinker.loader.app.TinkerApplication
import com.tencent.tinker.loader.shareutil.ShareConstants

/**
 * Creator : GG
 * Date    : 2018/3/8
 * Mail    : gg.jin.yu@gmai.com
 * Explain :
 */
class App() : TinkerApplication(ShareConstants.TINKER_ENABLE_ALL, "com.gg.tinkerdemo.MyApplicationLike",
        "com.tencent.tinker.loader.TinkerLoader", false)