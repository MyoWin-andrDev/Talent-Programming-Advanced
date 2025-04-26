package com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.fragment.AnimalsFragment_Ch23
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.fragment.PlanetsFragment_Ch23
import com.learning.talentprogrammadvanced.Ch_23_TabLayout.Homework.fragment.PlantsFragment_Ch23
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh23HomeworkBinding

class MainActivity_Ch23_Homework : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh23HomeworkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh23HomeworkBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            var fragment : Fragment = PlantsFragment_Ch23()
            replaceFragment(fragment)
            tlMain.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    when(tab?.position){
                        0 -> fragment = PlantsFragment_Ch23()
                        1 -> fragment = AnimalsFragment_Ch23()
                        2 -> fragment = PlanetsFragment_Ch23()
                    }
                    replaceFragment(fragment)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {}
                override fun onTabReselected(tab: TabLayout.Tab?) {}
            })
        }
    }
    private fun replaceFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fcMain, fragment).addToBackStack("").commit()
    }
}