package com.victorino.hiltstudy.data

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1/cats")
    suspend fun getCats(
        @Query("family_friendly") familyFriendly: Int = 5
    ): List<Cat>
}