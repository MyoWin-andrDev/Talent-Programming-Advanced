package com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.myUtil.replaceFragment
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.myUtil.showToast
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.fragment.LogoutFragment_Ch_22
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.fragment.ProfileFragment_Ch_22
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.fragment.SettingFragment_Ch_22
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh22HomeworkBinding

class MainActivity_Ch22_Homework : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh22HomeworkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh22HomeworkBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            //Setting as Default Fragment
            supportFragmentManager.beginTransaction().replace(fcHome.id, ProfileFragment_Ch_22()).addToBackStack("").commit()
            tbMain.apply {
                title = "Sample"
                setNavigationIcon(R.drawable.ic_menu)
                //Toggle Listener
                setOnClickListener { dlMain.open() }
                //Nav Item Listener
                nvMain.setNavigationItemSelectedListener {
                    binding.apply {
                        when(it.itemId){
                            R.id.menu_profile -> {
                                replaceFragment(ProfileFragment_Ch_22())
                                dlMain.close()
                            }
                            R.id.menu_setting -> {
                                replaceFragment(SettingFragment_Ch_22())
                                dlMain.close()
                            }
                            R.id.menu_logout -> {
                                replaceFragment(LogoutFragment_Ch_22())
                                dlMain.close()
                            }
                        }
                    }
                    true
                }
            }
        }
    }
}