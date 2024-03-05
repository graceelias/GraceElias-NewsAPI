package com.example.grace_elias_simple_news_app

import com.squareup.moshi.JsonClass
import java.util.UUID

@JsonClass(generateAdapter = true)
data class News (
    val id: UUID,
    val title: String,
    val author: String,
    val url: String
    )