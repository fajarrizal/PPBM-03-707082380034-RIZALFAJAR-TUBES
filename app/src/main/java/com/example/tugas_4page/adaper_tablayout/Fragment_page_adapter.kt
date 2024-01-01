package com.example.tugas_4page.adaper_tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tugas_4page.tablayout_fragment.F_announcement_notify
import com.example.tugas_4page.tablayout_fragment.F_system_notify

class Fragment_page_adapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle

): FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {

        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            F_system_notify()
        else
            F_announcement_notify()
    }
}

