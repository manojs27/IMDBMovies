package com.manoj.movies.network

import com.manoj.movies.BuildConfig
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideMoviesClient(): MoviesClient = MoviesClient(BuildConfig.BASE_URL, BuildConfig.API_KEY)
}
