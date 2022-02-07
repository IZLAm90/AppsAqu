package com.example.taskinappssquer.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskinappssquer.Model.PostModel
import com.example.taskinappssquer.R
import com.example.taskinappssquer.databinding.RowItemsBinding

class PostAdapter(my :List<PostModel>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    lateinit var binding: RowItemsBinding
    private var myList = my
    class PostViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val name :TextView = itemView.findViewById(R.id.name)
        val post :TextView =itemView.findViewById(R.id.contentt)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        binding= RowItemsBinding.inflate(LayoutInflater.from(parent.context))
        return PostViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.name.text=myList[position].name
        holder.post.text=myList[position].post
    }

    override fun getItemCount(): Int {
       return myList.size
    }

}