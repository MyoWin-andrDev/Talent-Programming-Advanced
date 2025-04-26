package com.learning.talentprogrammadvanced.Ch_22_Drawer_Layout.Practice

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.ui.onNavDestinationSelected
import com.learning.talentprogrammadvanced.R
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh22Binding

class MainActivity_Ch_22 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh22Binding
    private lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh22Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            toggle = ActionBarDrawerToggle(this@MainActivity_Ch_22, dlMain, R.string.open, R.string.close).also { it.syncState() }
            dlMain.addDrawerListener(toggle)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            nvMain.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.menu_profile -> {
                        Toast.makeText(
                            this@MainActivity_Ch_22,
                            "Profile Clicked",
                            Toast.LENGTH_LONG
                        ).show()
                        closeDrawer()
                    }
                }
                true
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    private fun closeDrawer(){
        binding.apply {
            if(dlMain.isDrawerOpen(nvMain)){
                dlMain.closeDrawers()
            }
        }
        }

}