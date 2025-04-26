package com.learning.talentprogrammadvanced.Ch_21_Fragments.Homework.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh21Binding

class MainActivity_Ch_21 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh21Binding
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh21Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val firsFragment = FirstFragment_Ch21()
        supportFragmentManager.beginTransaction().add(R.id.fcMainActivity, firsFragment).commit()
    }
}