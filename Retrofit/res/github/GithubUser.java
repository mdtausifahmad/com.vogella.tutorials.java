package com.vogella.android.retrofitgithub;

// This is used to map the JSON keys to the object by GSON
public class GithubUser {

    String login;
    String name;

    @Override
    public String toString() {
        return(login);
    }
}