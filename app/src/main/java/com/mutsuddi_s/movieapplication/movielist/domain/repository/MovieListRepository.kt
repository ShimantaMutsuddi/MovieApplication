package com.mutsuddi_s.movieapplication.movielist.domain.repository

import com.mutsuddi_s.movieapplication.movielist.domain.model.Movie
import com.mutsuddi_s.movieapplication.movielist.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ) : Flow<Resource<List<Movie>>>

    suspend fun getMovie(id:Int): Flow<Resource<Movie>>
}