package com.example.grace_elias_simple_news_app

import com.example.grace_elias_simple_news_app.api.NewsApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class ArticleRepository
{
    private val newsApi: NewsApi

    init{
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/top-headlines?")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        newsApi = retrofit.create()
    }

    suspend fun fetchArticles(): List<News> =
        newsApi.fetchArticles().articles.newsItems
}