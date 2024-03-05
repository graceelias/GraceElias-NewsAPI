package com.example.grace_elias_simple_news_app.api
import com.example.grace_elias_simple_news_app.BuildConfig
import retrofit2.http.GET

private const val API_KEY = BuildConfig.API_KEY
interface NewsApi {
    @GET(
        "country=us" +
        "&category=business" +
        "&apiKey=$API_KEY")
    suspend fun fetchArticles(): NewsResponse
}