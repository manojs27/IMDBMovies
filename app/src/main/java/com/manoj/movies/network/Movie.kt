package com.manoj.movies.network

import com.google.gson.annotations.SerializedName

data class Movie(
        @SerializedName("imdbID") val imdbId: String,
        @SerializedName("Title") val title: String,
        @SerializedName("Actors") val actors: String,
        @SerializedName("Plot") val plot: String,
        @SerializedName("imdbRating") val imdbRating: String,
        @SerializedName("Poster") val poster: String)
