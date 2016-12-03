package com.kvana.androidclean.root;

import android.app.Application;

import com.kvana.androidclean.http.ApiModuleForInfo;
import com.kvana.androidclean.http.ApiModuleForName;
import com.kvana.androidclean.topmovies.TopMoviesModule;

/**
 * Created by kris9 on 12/2/16.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}