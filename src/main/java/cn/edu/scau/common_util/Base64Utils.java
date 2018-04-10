package cn.edu.scau.common_util;

import android.text.TextUtils;
import android.util.Base64;

import java.io.UnsupportedEncodingException;

public class Base64Utils {
    // 加密
    public static String encrypt(String str) {
        String result = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                result = new String(Base64.encode(str.getBytes("utf-8"), Base64.NO_WRAP), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    // 解密  
    public static String decrypt(String str) {
        String result = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                result = new String(Base64.decode(str, Base64.NO_WRAP), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}