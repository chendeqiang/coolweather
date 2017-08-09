package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：Created by chendeqiang on 2017/8/9
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
