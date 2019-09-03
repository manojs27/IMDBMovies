package com.manoj.movies.startApp;

import android.app.Activity;
import com.manoj.movies.movielist.MainActivity;
import com.manoj.movies.movielist.model.MovieListModule;
import com.manoj.movies.movielist.model.MovieListScope;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilder_BindMainActivity {
  private ActivityBuilder_BindMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MovieListModule.class)
  @MovieListScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
