package com.vuvansan;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBase {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(APImanager.DOMAIN)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
