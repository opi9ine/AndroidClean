package com.kvana.androidclean.topmovies;

/**
 * Created by kris9 on 12/2/16.
 */


import com.kvana.androidclean.http.apimodel.Result;

import rx.Observable;


public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
