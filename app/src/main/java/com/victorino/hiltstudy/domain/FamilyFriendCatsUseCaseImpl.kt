package com.victorino.hiltstudy.domain

import javax.inject.Inject

class FamilyFriendCatsUseCaseImpl @Inject constructor(private val repository: FamilyFriendCatsRepository) :
    FamilyFriendCatsUseCase {
    override suspend fun getFamilyFriendCats(): List<CatEntity> {
        return repository.getFamilyFriendCats()
    }
}