package com.learning.talentprogrammadvanced.Ch_21_Fragments.Practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.learning.talentprogrammadvanced.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fcHome, firstFragment)
        transaction.commit()
    }
}