package com.victorino.hiltstudy.presentation

import com.victorino.hiltstudy.domain.CatEntity

object FamilyFriendsVOMapper {

    fun map(cats: List<CatEntity>): List<CatVO> {
        return cats.map {
            CatVO(it.name, it.image, it.origin, it.length)
        }
    }
}