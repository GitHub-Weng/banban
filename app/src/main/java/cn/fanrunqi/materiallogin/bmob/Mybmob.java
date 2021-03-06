package cn.fanrunqi.materiallogin.bmob;

import android.content.Context;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobConfig;
import cn.fanrunqi.materiallogin.config.Config;

/**
 * Created by Wengdada on 2017/2/28.
 */

public class Mybmob {

    public static void initBmob(Context initContext){

        //提供以下两种方式进行Bmob初始化操作：

        //第一：默认初始化
        //Bmob.initialize(this, "Your Application ID");

        //第二：自v3.4.7版本开始,设置BmobConfig,允许设置请求超时时间、文件分片上传时每片的大小、文件的过期时间(单位为秒)，
        BmobConfig config =new BmobConfig.Builder(initContext)
                ////设置appkey
                .setApplicationId(Config.APP_ID)
                ////请求超时时间（单位为秒）：默认15s
                .setConnectTimeout(30)
                ////文件分片上传时每片的大小（单位字节），默认512*1024
                .setUploadBlockSize(1024*1024)
                ////文件的过期时间(单位为秒)：默认1800s
                .setFileExpiration(2500)
                .build();
        Bmob.initialize(config);

    }



}
