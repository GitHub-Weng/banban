package cn.fanrunqi.materiallogin.config;


import android.app.Application;
import android.content.ContentProvider;
import android.content.Context;

/**
 * Created by Wengdada on 2017/3/1.
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        mContext=getApplicationContext();
    }
    public static Context getContext(){
        return mContext;
    }


}
