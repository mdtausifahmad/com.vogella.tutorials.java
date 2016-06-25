package com.vogella.android.retrofitgithub;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity implements Callback<GithubUser> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.stackexchange.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        // prepare call in Retrofit 2.0
        GithubUserAPI githubUserAPI = retrofit.create(GithubUserAPI.class);

        Call<GithubUser> call = githubUserAPI.getUser();
        //asynchronous call
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
        Toast.makeText(this, "Got the info back", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(Call<GithubUser> call, Throwable t) {
        Toast.makeText(this, "Nope", Toast.LENGTH_LONG).show();

    }
}
