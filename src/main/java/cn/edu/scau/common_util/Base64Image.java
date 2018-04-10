package cn.edu.scau.common_util;

import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by QiHuang on 2018/2/5.
 */

public class Base64Image {
    public static String transferToString(String path) {
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(path);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024 * 4];
            int n = 0;
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
            }
            data = out.toByteArray();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //对字节数组Base64编码
        return Base64.encodeToString(data, 0, data.length, Base64.DEFAULT);//返回Base64编码过的字节数组字符串

    }

}
