package com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.model.CustomList
import com.learning.talentprogrammadvanced.databinding.ListItemViewPagerBinding

class CustomAdapter_Ch24(private val customList : List<CustomList>) : RecyclerView.Adapter<CustomAdapter_Ch24.CustomViewHolder>() {

    class CustomViewHolder(val binding : ListItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =  CustomViewHolder(
        ListItemViewPagerBinding.inflate(LayoutInflater.from(parent.context)))

    override fun getItemCount(): Int = customList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.apply {
            tvName.text = customList[position].name
            tvDescription.text = customList[position].description
            ivImage.setImageResource(customList[position].image)
        }
    }
}