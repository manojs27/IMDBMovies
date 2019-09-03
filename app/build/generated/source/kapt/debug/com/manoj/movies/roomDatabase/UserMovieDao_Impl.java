package com.manoj.movies.roomDatabase;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class UserMovieDao_Impl implements UserMovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserMovie;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserMovie;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserMovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserMovie = new EntityInsertionAdapter<UserMovie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_movie`(`imdb_id`,`title`,`actors`,`plot`,`imdb_rating`,`poster`,`bookmarked`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserMovie value) {
        if (value.getImdbId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getActors() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getActors());
        }
        if (value.getPlot() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPlot());
        }
        if (value.getImdbRating() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImdbRating());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPoster());
        }
        final int _tmp;
        _tmp = value.getBookmarked() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__deletionAdapterOfUserMovie = new EntityDeletionOrUpdateAdapter<UserMovie>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_movie` WHERE `imdb_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserMovie value) {
        if (value.getImdbId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from user_movie";
        return _query;
      }
    };
  }

  @Override
  public void insert(UserMovie userMovie) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserMovie.insert(userMovie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserMovie userMovie) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserMovie.handle(userMovie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Flowable<List<UserMovie>> loadAll() {
    final String _sql = "select * from user_movie order by bookmarked desc, imdb_id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"user_movie"}, new Callable<List<UserMovie>>() {
      public List<UserMovie> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfImdbId = _cursor.getColumnIndexOrThrow("imdb_id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfActors = _cursor.getColumnIndexOrThrow("actors");
          final int _cursorIndexOfPlot = _cursor.getColumnIndexOrThrow("plot");
          final int _cursorIndexOfImdbRating = _cursor.getColumnIndexOrThrow("imdb_rating");
          final int _cursorIndexOfPoster = _cursor.getColumnIndexOrThrow("poster");
          final int _cursorIndexOfBookmarked = _cursor.getColumnIndexOrThrow("bookmarked");
          final List<UserMovie> _result = new ArrayList<UserMovie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserMovie _item;
            final String _tmpImdbId;
            _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpActors;
            _tmpActors = _cursor.getString(_cursorIndexOfActors);
            final String _tmpPlot;
            _tmpPlot = _cursor.getString(_cursorIndexOfPlot);
            final String _tmpImdbRating;
            _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final boolean _tmpBookmarked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfBookmarked);
            _tmpBookmarked = _tmp != 0;
            _item = new UserMovie(_tmpImdbId,_tmpTitle,_tmpActors,_tmpPlot,_tmpImdbRating,_tmpPoster,_tmpBookmarked);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Maybe<UserMovie> loadByimdbId(String imdbId) {
    final String _sql = "select * from user_movie where imdb_id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (imdbId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, imdbId);
    }
    return Maybe.fromCallable(new Callable<UserMovie>() {
      public UserMovie call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfImdbId = _cursor.getColumnIndexOrThrow("imdb_id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfActors = _cursor.getColumnIndexOrThrow("actors");
          final int _cursorIndexOfPlot = _cursor.getColumnIndexOrThrow("plot");
          final int _cursorIndexOfImdbRating = _cursor.getColumnIndexOrThrow("imdb_rating");
          final int _cursorIndexOfPoster = _cursor.getColumnIndexOrThrow("poster");
          final int _cursorIndexOfBookmarked = _cursor.getColumnIndexOrThrow("bookmarked");
          final com.manoj.movies.roomDatabase.UserMovie _result;
          if(_cursor.moveToFirst()) {
            final java.lang.String _tmpImdbId;
            _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            final java.lang.String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final java.lang.String _tmpActors;
            _tmpActors = _cursor.getString(_cursorIndexOfActors);
            final java.lang.String _tmpPlot;
            _tmpPlot = _cursor.getString(_cursorIndexOfPlot);
            final java.lang.String _tmpImdbRating;
            _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
            final java.lang.String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final boolean _tmpBookmarked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfBookmarked);
            _tmpBookmarked = _tmp != 0;
            _result = new com.manoj.movies.roomDatabase.UserMovie(_tmpImdbId,_tmpTitle,_tmpActors,_tmpPlot,_tmpImdbRating,_tmpPoster,_tmpBookmarked);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    });
  }
}
