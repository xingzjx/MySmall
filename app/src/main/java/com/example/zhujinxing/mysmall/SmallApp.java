package com.example.zhujinxing.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by zhujinxing on 2017/11/28.
 */

public class SmallApp extends Application {


    public SmallApp() {
        Small.preSetUp(this);
    }
}
