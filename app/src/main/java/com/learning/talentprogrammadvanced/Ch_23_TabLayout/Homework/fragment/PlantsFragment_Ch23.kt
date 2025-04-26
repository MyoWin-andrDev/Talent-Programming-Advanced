package com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.adapter.CustomAdapter
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.model.CustomList
import com.learning.talentprogrammadvanced.R

class PlantsFragment_Ch23 : Fragment(R.layout.fragment_plants__ch23) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val customAdapter = CustomAdapter(
            CustomList()
        )
        super.onViewCreated(view, savedInstanceState)
    }
}