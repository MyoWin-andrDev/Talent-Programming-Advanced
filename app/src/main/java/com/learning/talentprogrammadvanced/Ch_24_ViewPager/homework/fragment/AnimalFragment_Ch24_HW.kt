package com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.adapter.CustomAdapter_Ch24
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.model.CustomList
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentAnimalCh24HWBinding

class AnimalFragment_Ch24_HW : Fragment(R.layout.fragment_animal__ch24__h_w) {
    private lateinit var binding : FragmentAnimalCh24HWBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentAnimalCh24HWBinding.bind(view)
        val animalList = listOf(
            CustomList(
                name = "Lion",
                description = "Known as the 'king of the jungle', lions are majestic big cats that live in prides across Africa.",
                image = R.drawable.img_lion
            ),
            CustomList(
                name = "Dolphin",
                description = "Highly intelligent marine mammals known for their playful behavior and complex communication skills.",
                image = R.drawable.img_dolphin
            ),
            CustomList(
                name = "Eagle",
                description = "Powerful birds of prey with exceptional eyesight, symbolizing strength and freedom in many cultures.",
                image = R.drawable.img_eagle
            ),
            CustomList(
                name = "Elephant",
                description = "The largest land animals on Earth, known for their intelligence, strong social bonds, and long memories.",
                image = R.drawable.img_elephant
            ),
            CustomList(
                name = "Penguin",
                description = "Flightless birds adapted to aquatic life, primarily living in the Southern Hemisphere's colder regions.",
                image = R.drawable.img_penguin
            )
        )
        binding.rvAnimal.adapter = CustomAdapter_Ch24(animalList)
        super.onViewCreated(view, savedInstanceState)
    }
}