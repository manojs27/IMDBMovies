package com.manoj.movies.movielist.model

import com.manoj.movies.network.Movie
import com.manoj.movies.network.MoviesClient
import com.manoj.movies.roomDatabase.MoviesDatabase
import com.manoj.movies.roomDatabase.UserMovie
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single

open class MovieListModel(private val database: MoviesDatabase, private val client: MoviesClient) {

    companion object {
        private const val SEARCH_KEY: String = "friends"
    }

    /**
     * Performs an online search of movies with default parameters and stores them in cache with bookmark info.
     */
    fun searchMovies(): Observable<Movie> =
            getMoviesListBySearch(SEARCH_KEY)
                    .flatMapIterable { movies -> movies }
                    .flatMap { movie -> getMovieById(movie.imdbId) }
                    .flatMap { movie -> persistMovie(movie).toObservable() }

    /**
     * Loads movies with bookmark info from cache.
     */
    fun loadUserMovies(): Flowable<List<UserMovie>> =
            database.userMovieDao().loadAll()

    /**
     * Stores a movie on cache with its bookmark info.
     */
    private fun persistMovie(movie: Movie): Single<Movie> =
            database.bookmarkDao().loadByimdbId(movie.imdbId)
                    .isEmpty
                    .map { notBookmarked ->
                        database.userMovieDao().insert(UserMovie(
                                movie.imdbId, movie.title, movie.actors, movie.plot, movie.imdbRating,
                                movie.poster, !notBookmarked))
                        movie
                    }

    /**
     * Performs an online search of movies and converts the result into a list of incomplete movies.
     */
    private fun getMoviesListBySearch(searchKey: String): Observable<List<Movie>> =
            client.searchMovies(searchKey)
                    .map { searchResult -> searchResult.search }
                    .map { searches ->
                        val movies = mutableListOf<Movie>()
                        for (search in searches) {
                            movies.add(Movie(search.imdbID, search.title, "", "", "", search.poster))
                        }
                        movies
                    }

    /**
     * Retrieves complete information of a movie online.
     */
    private fun getMovieById(imdbId: String): Observable<Movie> =
            client.getMovie(imdbId)
}
