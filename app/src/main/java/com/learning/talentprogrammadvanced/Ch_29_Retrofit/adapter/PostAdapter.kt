package com.learning.talentprogrammadvanced.Ch_29_Retrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostItem
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostModelDomain
import com.learning.talentprogrammadvanced.databinding.ListItemCh29Binding

class PostAdapter(val postList : List<PostItem>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostViewHolder = PostViewHolder(ListItemCh29Binding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(
        holder: PostViewHolder,
        position: Int
    ) {
        holder.binding.tvId.text = postList[position].id.toString()
        holder.binding.tvPost.text = postList[position].title
    }

    override fun getItemCount(): Int = postList.size

    class PostViewHolder(val binding : ListItemCh29Binding) : RecyclerView.ViewHolder(binding.root)
}