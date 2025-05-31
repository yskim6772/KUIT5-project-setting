package com.konkuk.kuitprojectsetting.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseHomeDto(
    val homeTitle: String,
    val homeSubTitle: String,
    val homeImage: Int
)
