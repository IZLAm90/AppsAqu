package com.example.taskinappssquer.Reposatory

import com.example.taskinappssquer.Api.RetrofitInstace
import com.example.taskinappssquer.Model.ProductInfoModel
import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.Model.ProductsModels
import retrofit2.Response

class Repository {
    suspend fun getProducts(): Response<ProductsModels> {
        return RetrofitInstace.inst.getProducts()
    }
    suspend fun PushProduct(productModel: ProductModel):Response<ProductModel>{
        return RetrofitInstace.inst.postProducts(productModel)
    }
}