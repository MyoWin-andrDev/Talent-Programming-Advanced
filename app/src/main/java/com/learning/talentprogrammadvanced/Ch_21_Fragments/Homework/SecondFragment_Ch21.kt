package com.learning.talentprogrammadvanced.Ch_21_Fragments.Homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.FragmentSecondCh21Binding


class SecondFragment_Ch21 : Fragment() {
    private lateinit var binding : FragmentSecondCh21Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondCh21Binding.inflate(inflater)
        binding.btGoNext.setOnClickListener {
            val thirdFragment = ThirdFragment_Ch21()
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fcMainActivity, thirdFragment.also { it.arguments = Bundle().also {
                it.putString("USER_INPUT", binding.etInput.text.toString())
            }}).addToBackStack("").commit() }
        return binding.root
    }


}