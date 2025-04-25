package com.learning.talentprogrammadvanced.Ch_21_Fragments.Practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.learning.talentprogrammadvanced.R


class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.tvSecondFrag)
        val username = arguments?.getString("Username")
        tvTitle.text = username
        return view
    }


}