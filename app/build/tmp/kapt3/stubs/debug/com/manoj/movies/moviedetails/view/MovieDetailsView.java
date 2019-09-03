package com.manoj.movies.moviedetails.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/manoj/movies/moviedetails/view/MovieDetailsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actors", "Landroid/widget/TextView;", "bookmarkButoon", "Landroid/support/design/widget/FloatingActionButton;", "clickBookmarkButtonObservable", "Lio/reactivex/Observable;", "", "getClickBookmarkButtonObservable", "()Lio/reactivex/Observable;", "plot", "posterImageView", "Landroid/widget/ImageView;", "rating", "title", "enableBookmarkButton", "", "enabled", "", "showBookmarked", "bookmarked", "showUserMovie", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "app_debug"})
public final class MovieDetailsView extends android.widget.FrameLayout {
    private final android.widget.TextView title = null;
    private final android.widget.TextView rating = null;
    private final android.widget.TextView plot = null;
    private final android.widget.TextView actors = null;
    private final android.support.design.widget.FloatingActionButton bookmarkButoon = null;
    private final android.widget.ImageView posterImageView = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Object> clickBookmarkButtonObservable = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getClickBookmarkButtonObservable() {
        return null;
    }
    
    public final void showUserMovie(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie) {
    }
    
    public final void showBookmarked(boolean bookmarked) {
    }
    
    public final void enableBookmarkButton(boolean enabled) {
    }
    
    public MovieDetailsView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
}