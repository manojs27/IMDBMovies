// Generated by Dagger (https://google.github.io/dagger).
package com.manoj.movies.moviedetails;

import com.manoj.movies.moviedetails.presenter.MovieDetailsPresenter;
import com.manoj.movies.moviedetails.view.MovieDetailsView;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MovieDetailsActivity_MembersInjector
    implements MembersInjector<MovieDetailsActivity> {
  private final Provider<MovieDetailsView> viewProvider;

  private final Provider<MovieDetailsPresenter> presenterProvider;

  public MovieDetailsActivity_MembersInjector(
      Provider<MovieDetailsView> viewProvider, Provider<MovieDetailsPresenter> presenterProvider) {
    this.viewProvider = viewProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MovieDetailsActivity> create(
      Provider<MovieDetailsView> viewProvider, Provider<MovieDetailsPresenter> presenterProvider) {
    return new MovieDetailsActivity_MembersInjector(viewProvider, presenterProvider);
  }

  @Override
  public void injectMembers(MovieDetailsActivity instance) {
    injectView(instance, viewProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectView(MovieDetailsActivity instance, MovieDetailsView view) {
    instance.view = view;
  }

  public static void injectPresenter(
      MovieDetailsActivity instance, MovieDetailsPresenter presenter) {
    instance.presenter = presenter;
  }
}
