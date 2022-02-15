package com.example.taskinappssquer.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.R
import com.example.taskinappssquer.databinding.ItemTask3Binding

class ProductAdapter(myList: ArrayList<ProductModel>) :
    RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    private lateinit var binding: ItemTask3Binding
    private var list = myList

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.itemName)
        var price: TextView = itemView.findViewById(R.id.itemprice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        binding = ItemTask3Binding.inflate(LayoutInflater.from(parent.context))
        return ProductHolder(binding.root)

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.name.text=list[position].name
        holder.price.text= "The Price" + list[position].price
    }

    override fun getItemCount(): Int {
        return list.size
    }
}