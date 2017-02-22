package com.chuxueweather.android.gson;

import java.util.List;

/**
 * Created by 楚雪 on 2017/2/22.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SuppressWarnings("daily_forecast")
    public List<Forecast> forecastList;
}
