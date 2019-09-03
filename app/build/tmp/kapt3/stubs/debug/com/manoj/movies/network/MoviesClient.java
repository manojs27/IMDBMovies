package com.manoj.movies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/manoj/movies/network/MoviesClient;", "", "baseUrl", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;)V", "service", "Lcom/manoj/movies/network/MoviesService;", "createHttpClient", "Lokhttp3/OkHttpClient;", "getMovie", "Lio/reactivex/Observable;", "Lcom/manoj/movies/network/Movie;", "imdbId", "searchMovies", "Lcom/manoj/movies/network/SearchResult;", "searchKey", "app_debug"})
public final class MoviesClient {
    private final com.manoj.movies.network.MoviesService service = null;
    
    private final okhttp3.OkHttpClient createHttpClient(java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.manoj.movies.network.SearchResult> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.manoj.movies.network.Movie> getMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String imdbId) {
        return null;
    }
    
    public MoviesClient(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        super();
    }
}