package com.example.sportapp.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//pagina asta se sterge
public class RetrofitService {

    private Retrofit retrofit;


     public RetrofitService()
    {
        initializeRetrofit();
    }

    private void initializeRetrofit() {
        retrofit =  new Retrofit.Builder()
                .baseUrl("http://192.168.0.167:8083")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}



/* private static final String BASE_URL = "http://192.168.9.111:8083";
    private static RetrofitService mInstance;

    private RetrofitService()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static synchronized RetrofitService getInstance()
    {
        if(mInstance == null)
        {
            mInstance = new RetrofitService();
        }

        return mInstance;
    }


    public UsersApi getApi()
    {
        return retrofit.create(UsersApi.class);

    }*/