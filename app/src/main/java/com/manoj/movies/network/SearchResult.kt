package com.manoj.movies.network

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("Search") val search: List<Search>,
    @SerializedName("totalResults") val totalResults: String,
    @SerializedName("Response") val response: String)
