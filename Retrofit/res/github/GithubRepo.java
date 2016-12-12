package com.vogella.android.retrofitgithub;

// This is used to map the JSON keys to the object by GSON
public class GithubRepo {

    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}