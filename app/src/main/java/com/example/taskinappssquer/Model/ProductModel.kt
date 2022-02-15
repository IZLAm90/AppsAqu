package com.example.taskinappssquer.Model

data class ProductModel(
    var id:Int,
    var name :String,
    var price:Int,
    var quantity:Int,
    var restaurant_id:Int,
    var image:String
    )

data class ProductInfoModel(
    var status:Boolean,
    var message:String,
    var productlist:List<ProductModel>,
    var count:Int
    )
data class ProductsModels(var data :ArrayList<ProductInfoModel>,var status: Boolean, var message: String)