package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Apply window insets for edge-to-edge support
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.us_dze_main_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tabLayout = findViewById<TabLayout>(R.id.us_dze_tab_layout)
        val viewPager = findViewById<ViewPager2>(R.id.us_dze_view_pager)

        // Set vertical orientation based on surname
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewPager.adapter = ViewPagerAdapter(this)

        // Connect TabLayout and ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Input"
                    tab.setIcon(android.R.drawable.ic_menu_edit)
                }
                1 -> {
                    tab.text = "Analytics"
                    tab.setIcon(android.R.drawable.ic_menu_compass)
                }
                2 -> {
                    tab.text = "Profile"
                    tab.setIcon(android.R.drawable.ic_menu_myplaces)
                }
            }
        }.attach()
    }
}