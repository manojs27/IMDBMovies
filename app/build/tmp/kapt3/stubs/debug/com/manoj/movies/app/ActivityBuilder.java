package com.manoj.movies.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/manoj/movies/app/ActivityBuilder;", "", "()V", "bindMainActivity", "Lcom/manoj/movies/movielist/MainActivity;", "bindMovieDetailsActivity", "Lcom/manoj/movies/moviedetails/MovieDetailsActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.manoj.movies.movielist.model.MovieListModule.class})
    @com.manoj.movies.movielist.model.MovieListScope()
    public abstract com.manoj.movies.movielist.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.manoj.movies.moviedetails.model.MovieDetailsModule.class})
    @com.manoj.movies.moviedetails.model.MovieDetailsScope()
    public abstract com.manoj.movies.moviedetails.MovieDetailsActivity bindMovieDetailsActivity();
    
    public ActivityBuilder() {
        super();
    }
}