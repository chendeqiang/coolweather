package com.example.coolweather.gson;

/**
 * 作者：Created by chendeqiang on 2017/8/9
 * 邮箱：keshuixiansheng@126.com
 * 描述：
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
