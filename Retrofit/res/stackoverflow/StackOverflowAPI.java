package com.vogella.android.retrofitstackoverflow;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<List<Question>> loadQuestions(@Query("tagged") String tags);
}