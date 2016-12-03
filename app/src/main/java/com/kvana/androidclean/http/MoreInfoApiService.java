package com.kvana.androidclean.http;

/**
 * Created by kris9 on 12/2/16.
 */

import com.kvana.androidclean.http.apimodel.OmdbApi;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MoreInfoApiService {

    @GET("/")
    Observable <OmdbApi> getCountry(@Query("t") String title);


}

