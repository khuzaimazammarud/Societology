package com.example.societology.api;

import com.example.societology.model.olympic;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONplaceholder {

    @GET("api")
    Call<ArrayList<olympic>> getplayers();

    @POST("api")
    Call<olympic> addplayer(@Body olympic oly);

    @PATCH("/{id}")
    Call<olympic> updatePlayer(@Path("id") String id, @Body olympic oly);
}
