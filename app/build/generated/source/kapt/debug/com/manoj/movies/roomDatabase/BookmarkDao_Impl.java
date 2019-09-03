package com.manoj.movies.roomDatabase;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import io.reactivex.Maybe;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.Callable;

public class BookmarkDao_Impl implements BookmarkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookmark;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfBookmark;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public BookmarkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmark = new EntityInsertionAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookmark`(`imdb_id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        if (value.getImdbId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbId());
        }
      }
    };
    this.__deletionAdapterOfBookmark = new EntityDeletionOrUpdateAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `bookmark` WHERE `imdb_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
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
        final String _query = "delete from bookmark";
        return _query;
      }
    };
  }

  @Override
  public void insert(Bookmark bookmark) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookmark.insert(bookmark);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Bookmark bookmark) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfBookmark.handle(bookmark);
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
  public Maybe<Bookmark> loadByimdbId(String imdbId) {
    final String _sql = "select * from bookmark where imdb_id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (imdbId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, imdbId);
    }
    return Maybe.fromCallable(new Callable<Bookmark>() {
      public Bookmark call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfImdbId = _cursor.getColumnIndexOrThrow("imdb_id");
          final com.manoj.movies.roomDatabase.Bookmark _result;
          if(_cursor.moveToFirst()) {
            final java.lang.String _tmpImdbId;
            _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            _result = new com.manoj.movies.roomDatabase.Bookmark(_tmpImdbId);
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
