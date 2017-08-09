package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：Created by chendeqiang on 2017/8/9
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
