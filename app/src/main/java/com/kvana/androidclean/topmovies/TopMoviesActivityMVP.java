package com.kvana.androidclean.topmovies;

import rx.Observable;

/**
 * Created by kris9 on 12/1/16.
 */

public interface TopMoviesActivityMVP {
    interface View {

        void updateData(ViewModel viewModel);

        void showSnackbar(String s);

    }

    interface Presenter {

        void loadData();

        void rxUnsubscribe();

        void setView(TopMoviesActivityMVP.View view);

    }

    interface Model {

        Observable<ViewModel> result();

    }
}
