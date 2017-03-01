package cn.fanrunqi.materiallogin.tool;

import android.widget.Toast;

import cn.fanrunqi.materiallogin.config.MyApplication;

/**
 * Created by Wengdada on 2017/3/1.
 */

public class MyToast {
    public static void toast(String stringtoToast) {
        Toast.makeText(MyApplication.getContext(), stringtoToast, Toast.LENGTH_SHORT).show();
    }
}
