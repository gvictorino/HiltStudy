package com.victorino.hiltstudy.domain

interface FamilyFriendCatsRepository {
    suspend fun getFamilyFriendCats(): List<CatEntity>
}