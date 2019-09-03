package com.manoj.movies.moviedetails.model

import com.manoj.movies.roomDatabase.MoviesDatabase
import com.manoj.movies.roomDatabase.UserMovie
import com.manoj.movies.moviedetails.MovieDetailsActivity
import com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter
import com.manoj.movies.moviedetails.view.MovieDetailsView
import dagger.Module
import dagger.Provides

@Module
class MovieDetailsModule {

    @MovieDetailsScope
    @Provides
    fun provideUserMovie(activity: MovieDetailsActivity): UserMovie {
        if (!activity.intent.hasExtra(MovieDetailsActivity.EXTRA_USER_MOVIE)) {
            throw IllegalArgumentException("Activity is missing extra user movie parameter")
        }
        return activity.intent.extras.getParcelable(MovieDetailsActivity.EXTRA_USER_MOVIE)
    }

    @MovieDetailsScope
    @Provides
    fun provideMovieDetailsModel(database: MoviesDatabase, userMovie: UserMovie) = MovieDetailsModel(database, userMovie)

    @MovieDetailsScope
    @Provides
    fun provideMovieDetailsView(activity: MovieDetailsActivity) = MovieDetailsView(activity)

    @MovieDetailsScope
    @Provides
    fun provideMovieDetailsPresenter(model: MovieDetailsModel, view: MovieDetailsView) = MovieDetailsPresenter(model, view)
}
