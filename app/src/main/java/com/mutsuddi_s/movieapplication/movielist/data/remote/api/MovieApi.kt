package com.mutsuddi_s.movieapplication.movielist.data.remote.api

import com.mutsuddi_s.movieapplication.movielist.data.remote.dto.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey:String= API_KEY

    ): MovieListDto

    companion object{
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
        const val API_KEY = "ed357d659652a60b4295b128bc76ba5c"
    }
}