package com.example.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 作者：Created by chendeqiang on 2017/8/8
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
