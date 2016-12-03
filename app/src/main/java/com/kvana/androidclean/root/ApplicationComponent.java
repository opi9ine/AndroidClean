package com.kvana.androidclean.root;

/**
 * Created by kris9 on 12/2/16.
 */

import com.kvana.androidclean.http.ApiModuleForInfo;
import com.kvana.androidclean.http.ApiModuleForName;
import com.kvana.androidclean.topmovies.TopMoviesActivity;
import com.kvana.androidclean.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}