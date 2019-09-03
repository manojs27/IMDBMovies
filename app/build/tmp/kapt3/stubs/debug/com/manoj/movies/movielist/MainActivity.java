package com.manoj.movies.movielist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u0016\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170!H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/manoj/movies/movielist/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/manoj/movies/movielist/view/MoviesAdapter$OnMovieClicked;", "Lcom/manoj/movies/movielist/view/MainView;", "()V", "emptyTextView", "Landroid/widget/TextView;", "errorTextView", "indeterminateBar", "Landroid/widget/ProgressBar;", "mMoviesAdapter", "Lcom/manoj/movies/movielist/view/MoviesAdapter;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "presenter", "Lcom/manoj/movies/movielist/presenter/MainPresenter;", "getPresenter", "()Lcom/manoj/movies/movielist/presenter/MainPresenter;", "setPresenter", "(Lcom/manoj/movies/movielist/presenter/MainPresenter;)V", "onClick", "", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showError", "showLoading", "showNoUserMovies", "showUserMovies", "userMovies", "", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.manoj.movies.movielist.view.MoviesAdapter.OnMovieClicked, com.manoj.movies.movielist.view.MainView {
    private android.support.v7.widget.RecyclerView mRecyclerView;
    private android.widget.TextView emptyTextView;
    private android.widget.TextView errorTextView;
    private android.widget.ProgressBar indeterminateBar;
    private com.manoj.movies.movielist.view.MoviesAdapter mMoviesAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.manoj.movies.movielist.presenter.MainPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.manoj.movies.movielist.presenter.MainPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.presenter.MainPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showUserMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.manoj.movies.roomDatabase.UserMovie> userMovies) {
    }
    
    @java.lang.Override()
    public void showNoUserMovies() {
    }
    
    @java.lang.Override()
    public void showError() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie) {
    }
    
    public MainActivity() {
        super();
    }
}