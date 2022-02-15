package com.example.taskinappssquer.Api

import com.example.taskinappssquer.Model.ProductInfoModel
import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.Model.ProductsModels
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface FetchApi {

@GET("products")
suspend fun getProducts():Response<ProductsModels>


@POST("products")
suspend fun postProducts(@Body productModel: ProductModel):Response<ProductModel>
}