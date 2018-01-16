package com.coolweather.android.gson;

/**
 * Created by 64 on 2018/1/15.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
