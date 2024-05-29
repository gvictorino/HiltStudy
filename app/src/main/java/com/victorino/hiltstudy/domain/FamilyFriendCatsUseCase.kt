package com.victorino.hiltstudy.domain


interface FamilyFriendCatsUseCase {
    suspend fun getFamilyFriendCats(): List<CatEntity>
}