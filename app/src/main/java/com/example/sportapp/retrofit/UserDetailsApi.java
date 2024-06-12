package com.example.sportapp.retrofit;

import com.example.sportapp.model.UserDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
//pagina asta se sterge
public interface UserDetailsApi {
    @GET("/userDetails/get-all")
    Call<List<UserDetails>> getAllUserDetails();

    @POST("/userDetails/save")
    Call<UserDetails> createPost(@Body UserDetails userDetails);

    @POST("/userDetails/save")
    Call<UserDetails> save(@Body UserDetails userDetails);

}
