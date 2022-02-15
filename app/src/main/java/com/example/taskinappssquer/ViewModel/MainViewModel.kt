package com.example.countryapi

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskinappssquer.Model.ProductInfoModel


import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.Model.ProductsModels
import com.example.taskinappssquer.Reposatory.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    var myResponse: MutableLiveData<Response<ProductsModels>> = MutableLiveData()
    var PushmyResponse: MutableLiveData<Response<ProductModel>> = MutableLiveData()

    fun getProducts(){
        viewModelScope.launch {
            val response = repository.getProducts()
            Log.d("GetRespoceMessage",response.message())
            myResponse.value = response
            Log.d("response",response.message().toString())

        }
    }
    fun pushProduct(productModel: ProductModel){
        viewModelScope.launch {
            val response = repository.PushProduct(productModel)
            Log.d("PushData",response.message())
            PushmyResponse.value=response
        }

    }


    }




