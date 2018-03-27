package com.example.ruipandong.modularization;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.common.BaseApplication;

/**
 * Created by ruipan.dong on 2018/3/6.
 */

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
