package com.manoj.movies.moviedetails.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/manoj/movies/moviedetails/model/MovieDetailsModel;", "", "database", "Lcom/manoj/movies/roomDatabase/MoviesDatabase;", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "(Lcom/manoj/movies/roomDatabase/MoviesDatabase;Lcom/manoj/movies/roomDatabase/UserMovie;)V", "getUserMovie", "()Lcom/manoj/movies/roomDatabase/UserMovie;", "bookmarkMovie", "Lio/reactivex/Observable;", "unBookmarkMovie", "app_debug"})
public final class MovieDetailsModel {
    private final com.manoj.movies.roomDatabase.MoviesDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.manoj.movies.roomDatabase.UserMovie userMovie = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> bookmarkMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> unBookmarkMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.manoj.movies.roomDatabase.UserMovie getUserMovie() {
        return null;
    }
    
    public MovieDetailsModel(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.MoviesDatabase database, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie) {
        super();
    }
}