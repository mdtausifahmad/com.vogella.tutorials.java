package com.vogella.android.retrofitgithub;

import retrofit2.Call;

public interface GithubUserAPI {
    Call<GithubUser> getUser();
}
