package com.norm.mycachingpaging3compose.data.mappers

import com.norm.mycachingpaging3compose.data.local.BeerEntity
import com.norm.mycachingpaging3compose.data.remote.BeerDto
import com.norm.mycachingpaging3compose.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url,
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl,
    )
}