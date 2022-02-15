package com.example.taskinappssquer.Api

import com.example.taskinappssquer.Constant.Conestant.Companion.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstace {
    private val clint = OkHttpClient.Builder().apply {
        addInterceptor(MyInterceptor())
    }.build()
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(clint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val inst: FetchApi by lazy {
        retrofit.create(FetchApi::class.java)
    }
}