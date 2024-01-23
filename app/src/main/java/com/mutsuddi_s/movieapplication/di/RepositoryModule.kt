package com.mutsuddi_s.movieapplication.di

import com.mutsuddi_s.movieapplication.movielist.data.repository.MovieListRepositoryImpl
import com.mutsuddi_s.movieapplication.movielist.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository
}

