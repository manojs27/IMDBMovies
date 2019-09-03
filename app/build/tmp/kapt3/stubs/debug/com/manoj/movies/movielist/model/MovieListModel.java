package com.manoj.movies.movielist.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/manoj/movies/movielist/model/MovieListModel;", "", "database", "Lcom/manoj/movies/roomDatabase/MoviesDatabase;", "client", "Lcom/manoj/movies/network/MoviesClient;", "(Lcom/manoj/movies/roomDatabase/MoviesDatabase;Lcom/manoj/movies/network/MoviesClient;)V", "getMovieById", "Lio/reactivex/Observable;", "Lcom/manoj/movies/network/Movie;", "imdbId", "", "getMoviesListBySearch", "", "searchKey", "loadUserMovies", "Lio/reactivex/Flowable;", "Lcom/manoj/movies/roomDatabase/UserMovie;", "persistMovie", "Lio/reactivex/Single;", "movie", "searchMovies", "Companion", "app_debug"})
public class MovieListModel {
    private final com.manoj.movies.roomDatabase.MoviesDatabase database = null;
    private final com.manoj.movies.network.MoviesClient client = null;
    private static final java.lang.String SEARCH_KEY = "friends";
    public static final com.manoj.movies.movielist.model.MovieListModel.Companion Companion = null;
    
    /**
     * * Performs an online search of movies with default parameters and stores them in cache with bookmark info.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.manoj.movies.network.Movie> searchMovies() {
        return null;
    }
    
    /**
     * * Loads movies with bookmark info from cache.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.manoj.movies.roomDatabase.UserMovie>> loadUserMovies() {
        return null;
    }
    
    /**
     * * Stores a movie on cache with its bookmark info.
     */
    private final io.reactivex.Single<com.manoj.movies.network.Movie> persistMovie(com.manoj.movies.network.Movie movie) {
        return null;
    }
    
    /**
     * * Performs an online search of movies and converts the result into a list of incomplete movies.
     */
    private final io.reactivex.Observable<java.util.List<com.manoj.movies.network.Movie>> getMoviesListBySearch(java.lang.String searchKey) {
        return null;
    }
    
    /**
     * * Retrieves complete information of a movie online.
     */
    private final io.reactivex.Observable<com.manoj.movies.network.Movie> getMovieById(java.lang.String imdbId) {
        return null;
    }
    
    public MovieListModel(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.MoviesDatabase database, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.network.MoviesClient client) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/manoj/movies/movielist/model/MovieListModel$Companion;", "", "()V", "SEARCH_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}