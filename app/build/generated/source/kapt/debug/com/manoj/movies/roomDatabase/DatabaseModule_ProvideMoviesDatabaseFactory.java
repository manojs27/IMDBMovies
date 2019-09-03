// Generated by Dagger (https://google.github.io/dagger).
package com.manoj.movies.roomDatabase;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DatabaseModule_ProvideMoviesDatabaseFactory implements Factory<MoviesDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideMoviesDatabaseFactory(
      DatabaseModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MoviesDatabase get() {
    return Preconditions.checkNotNull(
        module.provideMoviesDatabase(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DatabaseModule_ProvideMoviesDatabaseFactory create(
      DatabaseModule module, Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideMoviesDatabaseFactory(module, contextProvider);
  }

  public static MoviesDatabase proxyProvideMoviesDatabase(
      DatabaseModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideMoviesDatabase(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
