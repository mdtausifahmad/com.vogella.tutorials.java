package com.vogella.android.retrofitstackoverflow;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.Call;
import retrofit2.http.Url;

public interface StackOverflowAPI {
    String BASE_URL = "https://api.stackexchange.com";

    @GET("/2.2/questions?order=desc&sort=votes&site=stackoverflow&tagged=android")
    Call<QuestionsList> getQuestions();

    @GET("/2.2/questions/{id}/answers?order=desc&sort=votes&site=stackoverflow")
    Call<AnswersList> getAnswersForQuestion(@Path("id") String questionId);

    @FormUrlEncoded
    @POST("/2.2/answers/{id}/upvote")
    Call<ResponseBody> postUpvoteOnAnswer(@Path("id") int answerId, @Field("access_token") String accessToken, @Field("key") String key, @Field("site") String site, @Field("preview") boolean preview, @Field("filter") String filter);
}