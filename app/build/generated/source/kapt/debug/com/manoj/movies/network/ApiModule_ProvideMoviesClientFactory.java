// Generated by Dagger (https://google.github.io/dagger).
package com.manoj.movies.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApiModule_ProvideMoviesClientFactory implements Factory<MoviesClient> {
  private final ApiModule module;

  public ApiModule_ProvideMoviesClientFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public MoviesClient get() {
    return Preconditions.checkNotNull(
        module.provideMoviesClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApiModule_ProvideMoviesClientFactory create(ApiModule module) {
    return new ApiModule_ProvideMoviesClientFactory(module);
  }

  public static MoviesClient proxyProvideMoviesClient(ApiModule instance) {
    return Preconditions.checkNotNull(
        instance.provideMoviesClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
