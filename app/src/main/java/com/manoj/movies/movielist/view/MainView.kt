package com.manoj.movies.movielist.view

import com.manoj.movies.roomDatabase.UserMovie

interface MainView {

    fun showUserMovies(userMovies: List<UserMovie>)

    fun showNoUserMovies()

    fun showError()

    fun showLoading()
}
