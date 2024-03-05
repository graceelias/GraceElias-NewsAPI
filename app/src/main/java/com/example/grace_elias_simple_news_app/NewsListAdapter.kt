package com.example.grace_elias_simple_news_app

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.grace_elias_simple_news_app.databinding.ListItemNewsBinding

class NewsHolder(
    private val binding: ListItemNewsBinding
): RecyclerView.ViewHolder(binding.root)
{
    fun bind(news: News) {
        binding.newsTitle.text = news.title
        binding.newsAuthor.text = news.author

        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "${news.title} clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

class NewsListAdapter(
    private val news_articles: List<News>
) : RecyclerView.Adapter<NewsHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsHolder
    {
        val inflater = LayoutInflater.from(parent.context)

        val binding = ListItemNewsBinding.inflate(inflater, parent, false)
        return NewsHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val news = news_articles[position]

        holder.bind(news)
    }

    override fun getItemCount() = news_articles.size
}
