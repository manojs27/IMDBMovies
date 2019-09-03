package com.manoj.movies.movielist

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.manoj.movies.R
import com.manoj.movies.roomDatabase.UserMovie
import com.manoj.movies.movielist.presenter.MainPresenter
import com.manoj.movies.movielist.view.MainView
import com.manoj.movies.movielist.view.MoviesAdapter
import com.manoj.movies.moviedetails.MovieDetailsActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MoviesAdapter.OnMovieClicked, MainView {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var emptyTextView: TextView
    private lateinit var errorTextView: TextView
    private lateinit var indeterminateBar: ProgressBar

    private lateinit var mMoviesAdapter: MoviesAdapter

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.recycler_view)
        emptyTextView = findViewById(R.id.empty)
        errorTextView = findViewById(R.id.error)
        indeterminateBar = findViewById(R.id.indeterminateBar)

        mMoviesAdapter = MoviesAdapter(this, this)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = mMoviesAdapter

        presenter.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override fun showUserMovies(userMovies: List<UserMovie>) {
        mMoviesAdapter.setData(userMovies)
        emptyTextView.visibility = View.INVISIBLE
        errorTextView.visibility = View.INVISIBLE
        indeterminateBar.visibility = View.INVISIBLE
        mRecyclerView.visibility = View.VISIBLE
    }

    override fun showNoUserMovies() {
        mRecyclerView.visibility = View.INVISIBLE
        errorTextView.visibility = View.INVISIBLE
        indeterminateBar.visibility = View.INVISIBLE
        emptyTextView.visibility = View.VISIBLE
    }

    override fun showError() {
        mRecyclerView.visibility = View.INVISIBLE
        emptyTextView.visibility = View.INVISIBLE
        indeterminateBar.visibility = View.INVISIBLE
        errorTextView.visibility = View.VISIBLE
    }

    override fun showLoading() {
        mRecyclerView.visibility = View.INVISIBLE
        emptyTextView.visibility = View.INVISIBLE
        errorTextView.visibility = View.INVISIBLE
        indeterminateBar.visibility = View.VISIBLE
    }

    override fun onClick(userMovie: UserMovie) {
        val intent = Intent(this, MovieDetailsActivity::class.java)
        intent.putExtra(MovieDetailsActivity.EXTRA_USER_MOVIE, userMovie)
        startActivity(intent)
    }
}
