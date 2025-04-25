package com.learning.talentprogrammadvanced.Ch_21_Fragments.Homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentFirstCh21Binding


class FirstFragment_Ch21 : Fragment() {
    private lateinit var binding : FragmentFirstCh21Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstCh21Binding.inflate(inflater)
        binding.apply {
            btGoNext.setOnClickListener {
                val secondFragment = SecondFragment_Ch21()
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fcMainActivity, secondFragment).addToBackStack("").commit()
            }
        }
        return binding.root
    }


}