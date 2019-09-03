package com.manoj.movies.startApp;

import android.app.Activity;
import com.manoj.movies.moviedetails.MovieDetailsActivity;
import com.manoj.movies.moviedetails.model.MovieDetailsModule;
import com.manoj.movies.moviedetails.model.MovieDetailsScope;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindMovieDetailsActivity.MovieDetailsActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindMovieDetailsActivity {
  private ActivityBuilder_BindMovieDetailsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MovieDetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MovieDetailsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MovieDetailsModule.class)
  @MovieDetailsScope
  public interface MovieDetailsActivitySubcomponent extends AndroidInjector<MovieDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MovieDetailsActivity> {}
  }
}
