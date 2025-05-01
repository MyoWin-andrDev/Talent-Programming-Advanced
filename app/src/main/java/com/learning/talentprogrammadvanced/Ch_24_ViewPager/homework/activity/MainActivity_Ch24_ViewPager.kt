package com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.fragment.AnimalFragment_Ch24_HW
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.fragment.PlanetFragment_Ch24_HW
import com.learning.talentprogrammadvanced.Ch_24_ViewPager.homework.fragment.PlantFragment_Ch24_HW
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh24ViewPagerBinding

class MainActivity_Ch24_ViewPager : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh24ViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh24ViewPagerBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            val tabTitleList = listOf("Plant", "Animal", "Planet")
            val tabIconList = mapOf<String, Int>(
                "Plant" to R.drawable.ic_plant,
                "Animal" to R.drawable.ic_animal,
                "Planet" to R.drawable.ic_planet
            )
            var fragment : Fragment = PlantFragment_Ch24_HW()
            vpMain.adapter = object : FragmentStateAdapter(this@MainActivity_Ch24_ViewPager){
                override fun createFragment(position: Int): Fragment {
                    when(position){
                        0 -> fragment = PlantFragment_Ch24_HW()
                        1 -> fragment = AnimalFragment_Ch24_HW()
                        2 -> fragment = PlanetFragment_Ch24_HW()
                    }
                    return fragment
                }

                override fun getItemCount(): Int = tabTitleList.size

            }
            TabLayoutMediator(tlMain, vpMain){tab , position ->
                val title = tabTitleList[position]
                tab.text = title
                tabIconList[title]?.let { tab.setIcon(it) }
            }.attach()
        }
    }
}