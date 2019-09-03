package com.manoj.movies.startApp

import com.manoj.movies.movielist.MainActivity
import com.manoj.movies.movielist.model.MovieListModule
import com.manoj.movies.movielist.model.MovieListScope
import com.manoj.movies.moviedetails.MovieDetailsActivity
import com.manoj.movies.moviedetails.model.MovieDetailsModule
import com.manoj.movies.moviedetails.model.MovieDetailsScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @MovieListScope
    @ContributesAndroidInjector(modules = [MovieListModule::class])
    abstract fun bindMainActivity(): MainActivity

    @MovieDetailsScope
    @ContributesAndroidInjector(modules = [MovieDetailsModule::class])
    abstract fun bindMovieDetailsActivity(): MovieDetailsActivity
}
