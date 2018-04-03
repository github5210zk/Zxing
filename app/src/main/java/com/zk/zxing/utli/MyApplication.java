package com.zk.zxing.utli;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by ${zk} on 2018/4/3 0003.
 * 欢迎每一天
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //最好在Demo Application初始化操作
        ZXingLibrary.initDisplayOpinion(this);
    }
}
