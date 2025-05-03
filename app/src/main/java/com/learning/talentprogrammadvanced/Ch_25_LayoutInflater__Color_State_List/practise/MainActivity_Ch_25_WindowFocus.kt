package com.learning.talentprogrammadvanced.Ch_25_LayoutInflater__Color_State_List.practise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh25WindowFocusBinding

class MainActivity_Ch_25_WindowFocus : AppCompatActivity() {
    private lateinit var customLayoutInflater: LayoutInflater
    private lateinit var customSecureView : View
    private lateinit var binding : ActivityMainCh25WindowFocusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh25WindowFocusBinding.inflate(layoutInflater)
        setContentView(binding.root)
        customLayoutInflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        customSecureView = layoutInflater.inflate(R.layout.custom_secure_view, binding.main , false)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(!hasFocus){
            binding.main.addView(customSecureView)
        }
        else{
            customSecureView.parent?.let {
                binding.main.removeView(customSecureView)
            }
        }
        super.onWindowFocusChanged(hasFocus)
    }
}