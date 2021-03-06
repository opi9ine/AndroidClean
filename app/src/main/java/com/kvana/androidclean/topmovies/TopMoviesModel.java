package com.kvana.androidclean.topmovies;

import com.kvana.androidclean.http.apimodel.*;
import rx.Observable;
import rx.functions.Func2;

/**
 * Created by kris9 on 12/2/16.
 */

public class TopMoviesModel implements TopMoviesActivityMVP.Model {

    private Repository repository;

    public TopMoviesModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {

        return Observable.zip(repository.getResultData(), repository.getCountryData(), new Func2<Result, String, ViewModel>() {
            @Override
            public ViewModel call(Result result, String s) {
                return new ViewModel(result.title,s);
            }
        });
    }

}