package cn.edu.scau.common_util;

import android.text.TextUtils;

/**
 * Created by QiHuang on 2018/2/5.
 */

public class NumberUtil {
    public static String hidePhoneNumber(String number) {
        if (TextUtils.isEmpty(number)) {
            return number;
        }
        return number.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
    }
}
