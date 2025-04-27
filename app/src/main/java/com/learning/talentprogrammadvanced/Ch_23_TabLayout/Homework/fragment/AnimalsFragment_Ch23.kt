package com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.adapter.CustomAdapter
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.model.CustomList
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentAnimalsCh23Binding

class AnimalsFragment_Ch23 : Fragment(R.layout.fragment_animals__ch23) {
    private lateinit var binding : FragmentAnimalsCh23Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentAnimalsCh23Binding.bind(view)
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
        binding.rvAnimal.adapter = CustomAdapter(animalList)
        super.onViewCreated(view, savedInstanceState)
    }
}