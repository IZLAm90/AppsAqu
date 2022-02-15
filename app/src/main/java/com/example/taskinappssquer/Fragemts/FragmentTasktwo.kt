package com.example.taskinappssquer.Fragemts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskinappssquer.Adapter.PostAdapter
import com.example.taskinappssquer.Model.PostModel
import com.example.taskinappssquer.R
import com.example.taskinappssquer.databinding.FragmentTasktwoBinding

class FragmentTasktwo : Fragment() {

    private lateinit var binding: FragmentTasktwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentTasktwoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }

    private fun setRecycler() {
        var arrayList: ArrayList<PostModel> = arrayListOf()
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("King of the thing", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        val postAdapter = PostAdapter(arrayList)
        binding.recyclerView.adapter = postAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.setHasFixedSize(true)

    }

}