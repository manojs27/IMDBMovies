package com.manoj.movies.moviedetails.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter;", "Lcom/manoj/movies/base/BasePresenter;", "model", "Lcom/manoj/movies/moviedetails/model/MovieDetailsModel;", "view", "Lcom/manoj/movies/moviedetails/view/MovieDetailsView;", "(Lcom/manoj/movies/moviedetails/model/MovieDetailsModel;Lcom/manoj/movies/moviedetails/view/MovieDetailsView;)V", "bookmarked", "", "onClickBookmark", "Lio/reactivex/Observable;", "", "onCreate", "", "Companion", "app_debug"})
public final class MovieDetailsPresenter extends com.manoj.movies.base.BasePresenter {
    private boolean bookmarked;
    private final com.manoj.movies.moviedetails.model.MovieDetailsModel model = null;
    private final com.manoj.movies.moviedetails.view.MovieDetailsView view = null;
    private static final java.lang.String LOG_TAG = null;
    public static final com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final io.reactivex.Observable<java.lang.Object> onClickBookmark() {
        return null;
    }
    
    public MovieDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.model.MovieDetailsModel model, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.view.MovieDetailsView view) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "getLOG_TAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getLOG_TAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}