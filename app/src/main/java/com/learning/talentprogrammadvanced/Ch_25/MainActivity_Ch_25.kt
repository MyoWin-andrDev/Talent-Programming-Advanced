package com.learning.talentprogrammadvanced.Ch_25

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.talentprogrammadvanced.R

class MainActivity_Ch_25 : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_ch25)
        val llMain = findViewById<LinearLayout>(R.id.llMain)
        val btClick = findViewById<Button>(R.id.btClick)
        val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater.inflate(R.id.childView, llMain, false)

        btClick.setOnClickListener {
            llMain.addView(view)
        }
    }
}