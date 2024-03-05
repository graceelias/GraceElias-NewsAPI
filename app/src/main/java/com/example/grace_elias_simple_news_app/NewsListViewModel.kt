package com.example.grace_elias_simple_news_app

import androidx.lifecycle.ViewModel
import java.util.UUID

class NewsListViewModel : ViewModel() {

    val news_articles = mutableListOf<News>()

    init {
        for (i in 0 until 100) {
            val news = News(
                id = UUID.randomUUID(),
                title = "Crime #$i",
                author = "x",
                url = "x"
            )

            news_articles += news
        }
        /*
        if(business) {

            for (i in 0 until 100) {
                val news = News(
                    id = UUID.randomUUID(),
                    title = "Crime #$i",
                    author = "x",
                    url = "x"
                )

                news_articles += news
            }
        }
        else if(politics)
        {

        }
        else if(pop culture)
        {

        }
        else
        {

        }

         */
    }
}