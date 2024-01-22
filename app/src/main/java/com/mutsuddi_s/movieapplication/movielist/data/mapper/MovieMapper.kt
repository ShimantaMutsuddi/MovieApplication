package com.mutsuddi_s.movieapplication.movielist.data.mapper

import com.mutsuddi_s.movieapplication.movielist.data.local.movie.MovieEntity
import com.mutsuddi_s.movieapplication.movielist.data.remote.dto.MovieDto
import com.mutsuddi_s.movieapplication.movielist.domain.model.Movie


fun MovieDto.toMovieEntity(
    category: String
): MovieEntity{
    return MovieEntity(
        adult= adult ?: false,
        backdropPath = backdropPath?:"",
        originalLanguage = originalLanguage?:"",
        overview = overview?:"",
        posterPath = posterPath?: "",
        releaseDate = releaseDate?:"",
        title = title?:"",
        voteAverage = voteAverage?:0.0,
        popularity = popularity?:0.0,
        voteCount = voteCount ?: 0,
        id= id?: -1,
        originalTitle = originalTitle?: "",
        video = video?:false,
        category = category,
        genreIds = try {
            genreIds?.joinToString (",") ?:"-1,-2"
        }catch (e:Exception){
            "-1,-2"
        },


    )
}
fun MovieEntity.toMovie(
    category: String
) : Movie{
    return Movie(
        adult= adult ?: false,
        backdropPath = backdropPath?:"",
        originalLanguage = originalLanguage?:"",
        overview = overview?:"",
        posterPath = posterPath?: "",
        releaseDate = releaseDate?:"",
        title = title?:"",
        voteAverage = voteAverage?:0.0,
        popularity = popularity?:0.0,
        voteCount = voteCount ?: 0,
        id= id?: -1,
        originalTitle = originalTitle?: "",
        video = video?:false,
        category = category,
        genreIds = try {
            genreIds?.split (",")?.map{ it.toInt() }
        }catch (e:Exception){
            listOf(-1,-2)
        }
    )
}