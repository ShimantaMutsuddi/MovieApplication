package com.mutsuddi_s.movieapplication.movielist.presentation

sealed interface MovieListUiEvent{
    data class Paginate(val category: String): MovieListUiEvent
    object Navigate: MovieListUiEvent
}