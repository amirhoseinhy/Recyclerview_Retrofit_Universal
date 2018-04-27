package com.niksan.recyclerviewretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APiService {
    @GET("/json")
    Call<List<Product>> getbookdetails();
}
