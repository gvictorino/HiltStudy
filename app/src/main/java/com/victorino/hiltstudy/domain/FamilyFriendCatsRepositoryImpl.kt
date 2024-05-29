package com.victorino.hiltstudy.domain

import android.util.Log
import com.victorino.hiltstudy.data.ApiService
import com.victorino.hiltstudy.data.Cat
import com.victorino.hiltstudy.data.FamilyFriendsCatsMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FamilyFriendCatsRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    FamilyFriendCatsRepository {

    override suspend fun getFamilyFriendCats(): List<CatEntity> {
        return try {
            FamilyFriendsCatsMapper.map(apiService.getCats())
        } catch (e: Exception) {
            // Log the error
            Log.e("CatRepository", "Error fetching cats", e)
            emptyList()
        }
    }
}