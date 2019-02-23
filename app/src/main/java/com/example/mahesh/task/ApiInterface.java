package com.example.mahesh.task;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {


    /*@FormUrlEncoded
           @POST("api/SalesLogin")
    Call<User> getServiceResponse(

            @Field("username") String username,
            @Field("pwd") String password
    );*/

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST("api/SalesLogin")
    Call<User> getServiceResponse(@Body UserRequest request);
}
