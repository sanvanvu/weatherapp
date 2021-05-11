package com.vuvansan;

import com.vuvansan.model.ItemData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APImanager {

public static String DOMAIN="http://dataservice.accuweather.com/";
@GET("forecasts/v1/hourly/12hour/353412?apikey=n7aDTBlsTgPp343cPLOUAfxs42TGDjWB&language=vi-vn&metric=true")
Call<List<ItemData>> getdata();
}
