package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：Created by chendeqiang on 2017/8/9
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
