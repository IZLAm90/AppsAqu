package com.example.taskinappssquer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskinappssquer.Adapter.PostAdapter
import com.example.taskinappssquer.Model.PostModel
import com.example.taskinappssquer.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecycler()
    }


    private fun setRecycler() {
        var arrayList: ArrayList<PostModel> = arrayListOf()
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        arrayList.add(PostModel("soliman Ragab", "The user role determines the permissions that the SDK grants to a user, such as permission to send local streams, receive remote streams, and push streams to a CDN address. A live-streaming channel has two user roles: host and audience. A host can both send and receive streams, but an audience member can only receive stream. The default role is audience."))
        val postAdapter = PostAdapter(arrayList)
        binding.recyclerView.adapter = postAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)

    }

}