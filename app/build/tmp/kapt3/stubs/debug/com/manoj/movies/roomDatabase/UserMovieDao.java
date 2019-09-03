package com.manoj.movies.roomDatabase;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/manoj/movies/roomDatabase/UserMovieDao;", "", "delete", "", "userMovie", "Lcom/manoj/movies/roomDatabase/UserMovie;", "deleteAll", "insert", "loadAll", "Lio/reactivex/Flowable;", "", "loadByimdbId", "Lio/reactivex/Maybe;", "imdbId", "", "app_debug"})
public abstract interface UserMovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from user_movie order by bookmarked desc, imdb_id")
    public abstract io.reactivex.Flowable<java.util.List<com.manoj.movies.roomDatabase.UserMovie>> loadAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from user_movie where imdb_id = :imdbId LIMIT 1")
    public abstract io.reactivex.Maybe<com.manoj.movies.roomDatabase.UserMovie> loadByimdbId(@org.jetbrains.annotations.NotNull()
    java.lang.String imdbId);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.manoj.movies.roomDatabase.UserMovie userMovie);
    
    @android.arch.persistence.room.Query(value = "delete from user_movie")
    public abstract void deleteAll();
}