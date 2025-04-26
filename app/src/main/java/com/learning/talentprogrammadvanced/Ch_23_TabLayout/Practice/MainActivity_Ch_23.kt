package com.learning.talentprogrammadvanced.Ch_23_TabLayout.Practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh23Binding

class MainActivity_Ch_23 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh23Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            var fragment : Fragment = OrderFragment_Ch23()
            replaceFragment(fragment)
            tlMain.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    when(tab?.position){
                        0 -> fragment = OrderFragment_Ch23()
                        1 -> fragment = FoodFragment_Ch_23()
                        2 -> fragment = DrinksFragment_Ch_23()
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