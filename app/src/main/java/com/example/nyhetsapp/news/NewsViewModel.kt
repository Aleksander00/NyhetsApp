package com.example.nyhetsapp.news
/*
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nyhetsapp.network.News
import com.example.nyhetsapp.network.NewsApi
import kotlinx.coroutines.launch
import java.lang.Exception

class NewsViewModel : ViewModel() {
    private val _response = MutableLiveData<String>()
    private val _news = MutableLiveData<List<News>>()

    val reponse: LiveData<String>
        get() = _response
    val news: LiveData<List<News>>
        get() = _news

    init { getNews() }

    private fun getNews() {
        viewModelScope.launch {
            try {
                _news.value = NewsApi.retrofitService.getNews()
                _response.value = "Success: news are read"
            } catch (e: Exception) {
                _response.value = "Error: ${e.message}"
            }
        }
    }
}*/