package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：Created by chendeqiang on 2017/8/9
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
