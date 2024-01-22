package com.mutsuddi_s.movieapplication.movielist.data.local.movie

import androidx.room.Database

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase {

    abstract val movieDao:MovieDao
}