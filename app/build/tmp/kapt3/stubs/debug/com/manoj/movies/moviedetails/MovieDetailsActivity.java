package com.manoj.movies.moviedetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/manoj/movies/moviedetails/MovieDetailsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "presenter", "Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter;", "getPresenter", "()Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter;", "setPresenter", "(Lcom/manoj/movies/moviedetails/presenter/MovieDetailsPresenter;)V", "view", "Lcom/manoj/movies/moviedetails/view/MovieDetailsView;", "getView", "()Lcom/manoj/movies/moviedetails/view/MovieDetailsView;", "setView", "(Lcom/manoj/movies/moviedetails/view/MovieDetailsView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "app_debug"})
public final class MovieDetailsActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.manoj.movies.moviedetails.view.MovieDetailsView view;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_USER_MOVIE = "user_movie";
    public static final com.manoj.movies.moviedetails.MovieDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.manoj.movies.moviedetails.view.MovieDetailsView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.view.MovieDetailsView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MovieDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/manoj/movies/moviedetails/MovieDetailsActivity$Companion;", "", "()V", "EXTRA_USER_MOVIE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}