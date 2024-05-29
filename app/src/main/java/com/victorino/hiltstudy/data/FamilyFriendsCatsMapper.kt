package com.victorino.hiltstudy.data

import com.victorino.hiltstudy.domain.CatEntity

object FamilyFriendsCatsMapper {

    fun map(cats: List<Cat>): List<CatEntity> {
        return cats.map { CatEntity(it.name, it.image_link, it.origin, it.length) }
    }
}