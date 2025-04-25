package com.learning.talentprogrammadvanced.Ch_21_Fragments.Homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentThirdCh21Binding


class ThirdFragment_Ch21 : Fragment() {
    private lateinit var binding : FragmentThirdCh21Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdCh21Binding.inflate(inflater)
        val userInput = arguments?.getString("USER_INPUT")
        if(!userInput.isNullOrEmpty()){
            binding.tvTitle.text = userInput
        }
        else{
            binding.tvTitle.text = "Welcome to Third Fragment."
        }
        return binding.root
    }

}