package com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentProfileCh22Binding


class ProfileFragment_Ch_22 : Fragment() {
    private lateinit var binding : FragmentProfileCh22Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileCh22Binding.inflate(inflater)
        return binding.root
    }

}