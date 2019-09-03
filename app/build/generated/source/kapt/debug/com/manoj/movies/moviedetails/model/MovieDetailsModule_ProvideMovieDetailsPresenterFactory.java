// Generated by Dagger (https://google.github.io/dagger).
package com.manoj.movies.moviedetails.model;

import com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter;
import com.manoj.movies.moviedetails.view.MovieDetailsView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class MovieDetailsModule_ProvideMovieDetailsPresenterFactory
    implements Factory<MovieDetailsPresenter> {
  private final MovieDetailsModule module;

  private final Provider<MovieDetailsModel> modelProvider;

  private final Provider<MovieDetailsView> viewProvider;

  public MovieDetailsModule_ProvideMovieDetailsPresenterFactory(
      MovieDetailsModule module,
      Provider<MovieDetailsModel> modelProvider,
      Provider<MovieDetailsView> viewProvider) {
    this.module = module;
    this.modelProvider = modelProvider;
    this.viewProvider = viewProvider;
  }

  @Override
  public MovieDetailsPresenter get() {
    return Preconditions.checkNotNull(
        module.provideMovieDetailsPresenter(modelProvider.get(), viewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static MovieDetailsModule_ProvideMovieDetailsPresenterFactory create(
      MovieDetailsModule module,
      Provider<MovieDetailsModel> modelProvider,
      Provider<MovieDetailsView> viewProvider) {
    return new MovieDetailsModule_ProvideMovieDetailsPresenterFactory(
        module, modelProvider, viewProvider);
  }

  public static MovieDetailsPresenter proxyProvideMovieDetailsPresenter(
      MovieDetailsModule instance, MovieDetailsModel model, MovieDetailsView view) {
    return Preconditions.checkNotNull(
        instance.provideMovieDetailsPresenter(model, view),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}