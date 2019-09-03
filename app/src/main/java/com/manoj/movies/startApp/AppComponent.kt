package com.manoj.movies.startApp

import android.app.Application
import com.manoj.movies.network.ApiModule
import com.manoj.movies.roomDatabase.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityBuilder::class,
    AppModule::class, ApiModule::class, DatabaseModule::class])
interface AppComponent {

    fun inject(app: MoviesApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
