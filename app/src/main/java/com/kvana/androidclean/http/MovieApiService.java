package com.kvana.androidclean.http;

/**
 * Created by kris9 on 12/2/16.
 */


import com.kvana.androidclean.http.apimodel.TopRated;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MovieApiService {

    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);





}