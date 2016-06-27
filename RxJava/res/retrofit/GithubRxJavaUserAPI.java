package com.vogella.android.retrofitgithub;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GithubRxJavaUserAPI {
    String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}")
    Observable<GithubUser> getUser(@Path("user") String user);
}
