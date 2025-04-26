package com.learning.talentprogrammadvanced.Ch_21_Fragments.Practice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.learning.talentprogrammadvanced.R


class FirstFragment : Fragment() {

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = "Hello Fragment One"
        val btNext = view.findViewById<Button>(R.id.btGoNext)
        btNext.setOnClickListener {
            val secondFragment = SecondFragment()
            val bundle = Bundle()
            bundle.putString("Username", "Ezekiel")
            secondFragment.arguments = bundle
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fcHome, secondFragment).addToBackStack("")
            transaction.commit()
        }
        return view
    }


}