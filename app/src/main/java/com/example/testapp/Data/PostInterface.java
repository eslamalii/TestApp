package com.example.testapp.Data;

import com.example.testapp.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    Call<List<PostModel>> getPosts();
}
