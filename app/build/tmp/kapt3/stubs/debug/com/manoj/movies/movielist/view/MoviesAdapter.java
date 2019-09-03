package com.manoj.movies.movielist.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/manoj/movies/movielist/view/MoviesAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/manoj/movies/movielist/view/MoviesAdapter$Companion$MoviesViewHolder;", "mContext", "Landroid/content/Context;", "mListener", "Lcom/manoj/movies/movielist/view/MoviesAdapter$OnMovieClicked;", "(Landroid/content/Context;Lcom/manoj/movies/movielist/view/MoviesAdapter$OnMovieClicked;)V", "userMovies", "", "Lcom/manoj/movies/roomDatabase/UserMovie;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "Companion", "OnMovieClicked", "app_debug"})
public final class MoviesAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.manoj.movies.movielist.view.MoviesAdapter.Companion.MoviesViewHolder> {
    private java.util.List<com.manoj.movies.roomDatabase.UserMovie> userMovies;
    private final android.content.Context mContext = null;
    private final com.manoj.movies.movielist.view.MoviesAdapter.OnMovieClicked mListener = null;
    public static final com.manoj.movies.movielist.view.MoviesAdapter.Companion Companion = null;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.manoj.movies.roomDatabase.UserMovie> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.manoj.movies.movielist.view.MoviesAdapter.Companion.MoviesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.view.MoviesAdapter.Companion.MoviesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.manoj.movies.movielist.view.MoviesAdapter.OnMovieClicked mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/manoj/movies/movielist/view/MoviesAdapter$OnMovieClicked;", "", "onClick", "", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "app_debug"})
    public static abstract interface OnMovieClicked {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.manoj.movies.roomDatabase.UserMovie userMovie);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/manoj/movies/movielist/view/MoviesAdapter$Companion;", "", "()V", "MoviesViewHolder", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/manoj/movies/movielist/view/MoviesAdapter$Companion$MoviesViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bookmarked", "Landroid/widget/ImageView;", "getBookmarked", "()Landroid/widget/ImageView;", "image", "getImage", "mTitle", "Landroid/widget/TextView;", "getMTitle", "()Landroid/widget/TextView;", "plot", "getPlot", "app_debug"})
        public static final class MoviesViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView mTitle = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView plot = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView image = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView bookmarked = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getMTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getPlot() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getImage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getBookmarked() {
                return null;
            }
            
            public MoviesViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View view) {
                super(null);
            }
        }
    }
}