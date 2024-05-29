package com.victorino.hiltstudy.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.victorino.hiltstudy.data.Cat
import com.victorino.hiltstudy.domain.CatEntity
import com.victorino.hiltstudy.domain.FamilyFriendCatsRepositoryImpl
import com.victorino.hiltstudy.domain.FamilyFriendCatsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val usecase: FamilyFriendCatsUseCase) :
    ViewModel() {
    private val _cats = MutableLiveData<List<CatVO>>()
    val cats: LiveData<List<CatVO>> get() = _cats

    init {
        viewModelScope.launch {
            _cats.value = FamilyFriendsVOMapper.map(usecase.getFamilyFriendCats())
        }
    }
}