package cn.edu.scau.common_util;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by QiHuang on 2018/1/20.
 */

public class Handler_ extends Handler {
    private static Handler sInstance;

    public static Handler getInstance() {
        if (sInstance == null) {
            sInstance = new Handler(Looper.getMainLooper());
        }
        return sInstance;
    }
}
