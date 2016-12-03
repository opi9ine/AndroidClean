package com.kvana.androidclean.topmovies;

/**
 * Created by kris9 on 12/2/16.
 */

import com.kvana.androidclean.http.ApiModuleForName;
import com.kvana.androidclean.http.MoreInfoApiService;
import com.kvana.androidclean.http.MovieApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ApiModuleForName.class})

public class TopMoviesModule {

    @Provides
    public TopMoviesActivityMVP.Presenter provideTopMoviesActivityPresenter(TopMoviesActivityMVP.Model topMoviesModel) {
        return new TopMoviesPresenter(topMoviesModel);
    }

    @Provides
    public TopMoviesActivityMVP.Model provideTopMoviesActivityModel(Repository repository) {
        return new TopMoviesModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideRepo(MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        return new TopMoviesRepository(movieApiService, moreInfoApiService);
    }


}
