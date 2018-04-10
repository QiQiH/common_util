package cn.edu.scau.common_util;

import android.widget.Toast;

//Toast统一管理类
public class ToastUtils {
    private static Toast mToast = null;

    private ToastUtils() {
            /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }



    public static void showShort(CharSequence message) {
        if (mToast == null) {
            mToast = Toast.makeText(AppUtil.getApplicationContext(), message, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(message);
        }
        mToast.show();
    }



    public static void showLong(CharSequence message) {
        if (mToast == null) {
            mToast = Toast.makeText(AppUtil.getApplicationContext(), message, Toast.LENGTH_LONG);
        } else {
            mToast.setText(message);
        }
        mToast.show();
    }


}