package com.manoj.movies.movielist.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/manoj/movies/movielist/model/MovieListModule;", "", "()V", "provideModel", "Lcom/manoj/movies/movielist/model/MovieListModel;", "database", "Lcom/manoj/movies/roomDatabase/MoviesDatabase;", "client", "Lcom/manoj/movies/network/MoviesClient;", "providePresenter", "Lcom/manoj/movies/movielist/presenter/MainPresenter;", "model", "view", "Lcom/manoj/movies/movielist/view/MainView;", "provideView", "activity", "Lcom/manoj/movies/movielist/MainActivity;", "app_debug"})
@dagger.Module()
public final class MovieListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieListScope()
    public final com.manoj.movies.movielist.model.MovieListModel provideModel(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.MoviesDatabase database, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.network.MoviesClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieListScope()
    public final com.manoj.movies.movielist.view.MainView provideView(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.MainActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @MovieListScope()
    public final com.manoj.movies.movielist.presenter.MainPresenter providePresenter(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.model.MovieListModel model, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.view.MainView view) {
        return null;
    }
    
    public MovieListModule() {
        super();
    }
}