package com.manoj.movies.roomDatabase;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;

public class MoviesDatabase_Impl extends MoviesDatabase {
  private volatile UserMovieDao _userMovieDao;

  private volatile BookmarkDao _bookmarkDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_movie` (`imdb_id` TEXT NOT NULL, `title` TEXT NOT NULL, `actors` TEXT NOT NULL, `plot` TEXT NOT NULL, `imdb_rating` TEXT NOT NULL, `poster` TEXT NOT NULL, `bookmarked` INTEGER NOT NULL, PRIMARY KEY(`imdb_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookmark` (`imdb_id` TEXT NOT NULL, PRIMARY KEY(`imdb_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6b27dff5d2003bbafbe264989d3ac015\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_movie`");
        _db.execSQL("DROP TABLE IF EXISTS `bookmark`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserMovie = new HashMap<String, TableInfo.Column>(7);
        _columnsUserMovie.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", true, 1));
        _columnsUserMovie.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsUserMovie.put("actors", new TableInfo.Column("actors", "TEXT", true, 0));
        _columnsUserMovie.put("plot", new TableInfo.Column("plot", "TEXT", true, 0));
        _columnsUserMovie.put("imdb_rating", new TableInfo.Column("imdb_rating", "TEXT", true, 0));
        _columnsUserMovie.put("poster", new TableInfo.Column("poster", "TEXT", true, 0));
        _columnsUserMovie.put("bookmarked", new TableInfo.Column("bookmarked", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserMovie = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserMovie = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserMovie = new TableInfo("user_movie", _columnsUserMovie, _foreignKeysUserMovie, _indicesUserMovie);
        final TableInfo _existingUserMovie = TableInfo.read(_db, "user_movie");
        if (! _infoUserMovie.equals(_existingUserMovie)) {
          throw new IllegalStateException("Migration didn't properly handle user_movie(com.manoj.movies.roomDatabase.UserMovie).\n"
                  + " Expected:\n" + _infoUserMovie + "\n"
                  + " Found:\n" + _existingUserMovie);
        }
        final HashMap<String, TableInfo.Column> _columnsBookmark = new HashMap<String, TableInfo.Column>(1);
        _columnsBookmark.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookmark = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookmark = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookmark = new TableInfo("bookmark", _columnsBookmark, _foreignKeysBookmark, _indicesBookmark);
        final TableInfo _existingBookmark = TableInfo.read(_db, "bookmark");
        if (! _infoBookmark.equals(_existingBookmark)) {
          throw new IllegalStateException("Migration didn't properly handle bookmark(com.manoj.movies.roomDatabase.Bookmark).\n"
                  + " Expected:\n" + _infoBookmark + "\n"
                  + " Found:\n" + _existingBookmark);
        }
      }
    }, "6b27dff5d2003bbafbe264989d3ac015");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "user_movie","bookmark");
  }

  @Override
  public UserMovieDao userMovieDao() {
    if (_userMovieDao != null) {
      return _userMovieDao;
    } else {
      synchronized(this) {
        if(_userMovieDao == null) {
          _userMovieDao = new UserMovieDao_Impl(this);
        }
        return _userMovieDao;
      }
    }
  }

  @Override
  public BookmarkDao bookmarkDao() {
    if (_bookmarkDao != null) {
      return _bookmarkDao;
    } else {
      synchronized(this) {
        if(_bookmarkDao == null) {
          _bookmarkDao = new BookmarkDao_Impl(this);
        }
        return _bookmarkDao;
      }
    }
  }
}
