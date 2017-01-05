package com.vogella.java.retrofitstackoverflow;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<StackOverflowQuestions> {

	public void start() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.stackexchange.com")
				.addConverterFactory(GsonConverterFactory.create()).build();
		
		// prepare call in Retrofit 2.0
		StackOverflowAPI stackOverflowAPI = retrofit.create(StackOverflowAPI.class);

		Call<StackOverflowQuestions> call = stackOverflowAPI.loadQuestions("java");
		
		// asynchronous call
		call.enqueue(this);
	}

	@Override
	public void onResponse(Call<StackOverflowQuestions> call, Response<StackOverflowQuestions> response) {
		List<Question> list = response.body().items;
		for (Question q : list) {
			System.out.println(q.title + ": " + q.link);
		}
	}

	@Override
	public void onFailure(Call<StackOverflowQuestions> call, Throwable t) {
		System.out.println(t.getLocalizedMessage());
	}
}
