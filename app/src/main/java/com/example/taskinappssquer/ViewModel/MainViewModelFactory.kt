package com.example.retrofittest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.countryapi.MainViewModel
import com.example.taskinappssquer.Reposatory.Repository

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}