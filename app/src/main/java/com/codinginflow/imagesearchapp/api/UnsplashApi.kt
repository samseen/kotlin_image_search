package com.codinginflow.imagesearchapp.api

import retrofit2.http.Query

interface UnsplashApi {
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): UnsplashResponse
}