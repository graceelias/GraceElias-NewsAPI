package com.example.grace_elias_simple_news_app.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsResponse(
    val articles: ArticleResponse
)