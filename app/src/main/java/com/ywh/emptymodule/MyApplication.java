package com.ywh.emptymodule;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("","");
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
