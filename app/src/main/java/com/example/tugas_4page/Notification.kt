package com.example.tugas_4page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.tugas_4page.adaper_tablayout.Fragment_page_adapter
import com.google.android.material.tabs.TabLayout

class Notification : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: Fragment_page_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        window.statusBarColor = this.resources.getColor(R.color.dark)

        val imageView = findViewById(R.id.link_notif_back_home) as ImageView
        imageView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        tabLayout = findViewById(R.id.tablayouttop)
        viewPager2 = findViewById(R.id.content_view_pager2)

        adapter = Fragment_page_adapter(supportFragmentManager, lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("System"))
        tabLayout.addTab(tabLayout.newTab().setText("Announcement"))

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager2.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

    }

}