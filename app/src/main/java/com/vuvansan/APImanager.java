package com.vuvansan;

import com.vuvansan.model.ItemData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APImanager {

public static String DOMAIN="http://dataservice.accuweather.com/forecasts/";
@GET("v1/hourly/12hour/353412?apikey=xPSRhXsZ1ApXEjCUhHWKKsHRNjBMOAxt&language=vi-vn&metric=true")
Call<List<ItemData>> getdata();
}
