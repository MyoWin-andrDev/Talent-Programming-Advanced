package com.learning.talentprogrammadvanced.Ch_29_Retrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.talentprogrammadvanced.databinding.ListItemCh29Binding

class PostAdapter(val postList : List<String>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostViewHolder = PostViewHolder(ListItemCh29Binding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(
        holder: PostViewHolder,
        position: Int
    ) {
        holder.binding.tvPost.text = postList[position]
    }

    override fun getItemCount(): Int = postList.size

    class PostViewHolder(val binding : ListItemCh29Binding) : RecyclerView.ViewHolder(binding.root)
}