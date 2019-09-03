package com.manoj.movies.movielist.model

import com.manoj.movies.network.MoviesClient
import com.manoj.movies.roomDatabase.MoviesDatabase
import com.manoj.movies.movielist.MainActivity
import com.manoj.movies.movielist.presenter.MainPresenter
import com.manoj.movies.movielist.view.MainView
import dagger.Module
import dagger.Provides

@Module
class MovieListModule {

    @MovieListScope
    @Provides
    fun provideModel(database: MoviesDatabase, client: MoviesClient) = MovieListModel(database, client)

    @MovieListScope
    @Provides
    fun provideView(activity: MainActivity) = activity as MainView

    @MovieListScope
    @Provides
    fun providePresenter(model: MovieListModel, view: MainView) = MainPresenter(model, view)
}
