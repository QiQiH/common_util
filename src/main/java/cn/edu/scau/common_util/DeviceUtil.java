package cn.edu.scau.common_util;

/**
 * Created by QiHuang on 2018/1/30.
 */

public class DeviceUtil {
    public static String getUniqueId() {
        return android.os.Build.SERIAL;
    }
}
