package com.learning.talentprogrammadvanced.Ch_29_Retrofit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.adapter.PostAdapter
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh29Binding

class MainActivity_Ch29 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh29Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh29Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            rvPost.adapter = PostAdapter(listOf(
                "Elderberry",
                "Fig",
                "Grape",
                "Honeydew",
                "Iceberg Lettuce",
                "Jackfruit",
                "Kiwi",
                "Lemon",
                "Mango",
                "Nectarine",
                "Orange",))
        }
    }
}