package cn.edu.scau.common_util;

import android.annotation.SuppressLint;
import android.app.Application;

/**
 * Created by QiHuang on 2018/1/19.
 */

public class AppUtil {
    @SuppressLint("StaticFieldLeak")
    private static Application APP;

    public static int activityCount = 0;

    public static void init(Application app) {
        APP = app;
    }

    public static void destroy() {
        APP = null;
    }

    public static Application getApplicationContext() {
        return APP;
    }
}
