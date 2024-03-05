package com.example.grace_elias_simple_news_app.api

import com.example.grace_elias_simple_news_app.News
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticleResponse(
    @Json(name = "articles") val newsItems: List<News>
)