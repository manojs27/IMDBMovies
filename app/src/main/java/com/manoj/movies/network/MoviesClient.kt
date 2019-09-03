package com.manoj.movies.network

import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MoviesClient(baseUrl: String, apiKey: String) {

    private val service: MoviesService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(createHttpClient(apiKey))
                .build()

        service = retrofit.create(MoviesService::class.java)
    }

    private fun createHttpClient(apiKey: String): OkHttpClient {
        if (apiKey.isEmpty()) {
            throw IllegalArgumentException("The API key is missing. Please get one from http://www.omdbapi.com") as Throwable
        }
        return OkHttpClient.Builder()
                .addInterceptor(NetworkKeyInterceptor(apiKey))
                .build()
    }

    fun searchMovies(searchKey: String): Observable<SearchResult> =
            service.searchMovies(searchKey)

    fun getMovie(imdbId: String): Observable<Movie> =
            service.getMovie(imdbId)
}
