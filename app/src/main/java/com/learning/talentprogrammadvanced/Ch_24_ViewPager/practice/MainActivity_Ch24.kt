package com.learning.talentprogrammadvanced.Ch_24_ViewPager.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh24Binding

class MainActivity_Ch24 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh24Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val tabList = hashMapOf<String, Int>(
            "Order" to R.drawable.ic_list,
            "Food" to R.drawable.ic_food,
            "Drink" to R.drawable.ic_drink
        )
        var fragment : Fragment = OrderFragment_Ch24()
        binding.vpMain.adapter = object : FragmentStateAdapter(this){
            override fun createFragment(position: Int): Fragment {
                when(position){
                    0 -> fragment = OrderFragment_Ch24()
                    1 -> fragment = FoodFragment_Ch24()
                    2 -> fragment = DrinkFragment_Ch24()
                }
                return fragment
            }
            override fun getItemCount(): Int = 3
        }
        val tabKeys = tabList.keys.toList()
        binding.apply {
            TabLayoutMediator(tlMain, vpMain){ tab, position ->
                val title  = tabKeys[position]
                tab.text = title
                tabList[title]?.let { tab.setIcon(it) }
            }.attach()
        }
    }
}