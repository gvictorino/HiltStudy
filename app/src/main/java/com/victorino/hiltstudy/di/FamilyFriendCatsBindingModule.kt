package com.victorino.hiltstudy.di

import com.victorino.hiltstudy.domain.FamilyFriendCatsRepository
import com.victorino.hiltstudy.domain.FamilyFriendCatsRepositoryImpl
import com.victorino.hiltstudy.domain.FamilyFriendCatsUseCase
import com.victorino.hiltstudy.domain.FamilyFriendCatsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface FamilyFriendCatsBindingModule {

    @Binds
    @Singleton
    fun providesFamilyFriendCatsUseCase(familyFriendCatsUseCaseImpl: FamilyFriendCatsUseCaseImpl): FamilyFriendCatsUseCase

    @Binds
    @Singleton
    fun providesFamilyFriendCatsRepository(familyFriendCatsRepositoryImpl: FamilyFriendCatsRepositoryImpl) : FamilyFriendCatsRepository
}
