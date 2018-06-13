package com.morteza.retrofittest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mori on 6/13/18.
 */

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Call<Weather> getWeatherFromApi (
            @Query("q") String cityName,
            @Query("APPID") String appId,
            @Query("units") String unit);
}