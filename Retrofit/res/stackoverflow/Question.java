package com.vogella.android.retrofitstackoverflow;

import com.google.gson.annotations.SerializedName;

public class Question {

    @SerializedName("question_id")
    public String questionId;

    public String title;
    public  String link;

    @Override
    public String toString() {
        return(title);
    }
}