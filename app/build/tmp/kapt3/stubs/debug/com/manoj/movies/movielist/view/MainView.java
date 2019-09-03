package com.manoj.movies.movielist.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lcom/manoj/movies/movielist/view/MainView;", "", "showError", "", "showLoading", "showNoUserMovies", "showUserMovies", "userMovies", "", "Lcom/manoj/movies/roomDatabase/UserMovie;", "app_debug"})
public abstract interface MainView {
    
    public abstract void showUserMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.manoj.movies.roomDatabase.UserMovie> userMovies);
    
    public abstract void showNoUserMovies();
    
    public abstract void showError();
    
    public abstract void showLoading();
}