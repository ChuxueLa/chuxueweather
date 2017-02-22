package com.chuxueweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 楚雪 on 2017/2/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
