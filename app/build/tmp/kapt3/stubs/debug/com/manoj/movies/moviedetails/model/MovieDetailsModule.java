package com.manoj.movies.moviedetails.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/manoj/movies/moviedetails/model/MovieDetailsModule;", "", "()V", "provideMovieDetailsModel", "Lcom/manoj/movies/moviedetails/model/MovieDetailsModel;", "database", "Lcom/manoj/movies/roomDatabase/MoviesDatabase;", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "provideMovieDetailsPresenter", "Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter;", "model", "view", "Lcom/manoj/movies/moviedetails/view/MovieDetailsView;", "provideMovieDetailsView", "activity", "Lcom/manoj/movies/moviedetails/MovieDetailsActivity;", "provideUserMovie", "app_debug"})
@dagger.Module()
public final class MovieDetailsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieDetailsScope()
    public final com.manoj.movies.roomDatabase.UserMovie provideUserMovie(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.MovieDetailsActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieDetailsScope()
    public final com.manoj.movies.moviedetails.model.MovieDetailsModel provideMovieDetailsModel(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.MoviesDatabase database, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieDetailsScope()
    public final com.manoj.movies.moviedetails.view.MovieDetailsView provideMovieDetailsView(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.MovieDetailsActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieDetailsScope()
    public final com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter provideMovieDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.model.MovieDetailsModel model, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.view.MovieDetailsView view) {
        return null;
    }
    
    public MovieDetailsModule() {
        super();
    }
}