package com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.myUtil

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Homework.view.fragment.SettingFragment_Ch_22
import com.learning.talentprogrammadvanced.R

fun Context.showToast(value : String){
    Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
}

fun FragmentActivity.replaceFragment(fragment : Fragment){
    this@replaceFragment.supportFragmentManager.beginTransaction().replace(R.id.fcHome, fragment).addToBackStack("").commit()
}