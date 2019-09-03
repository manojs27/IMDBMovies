package com.manoj.movies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/manoj/movies/network/MoviesService;", "", "getMovie", "Lio/reactivex/Observable;", "Lcom/manoj/movies/network/Movie;", "id", "", "searchMovies", "Lcom/manoj/movies/network/SearchResult;", "searchKey", "app_debug"})
public abstract interface MoviesService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract io.reactivex.Observable<com.manoj.movies.network.SearchResult> searchMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String searchKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract io.reactivex.Observable<com.manoj.movies.network.Movie> getMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String id);
}