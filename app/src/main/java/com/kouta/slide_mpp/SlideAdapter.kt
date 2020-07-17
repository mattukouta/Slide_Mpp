package com.kouta.slide_mpp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SlideAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val fragment =
            when(position % 2) {
                0 -> CoverFragment.newInstance(position)
                1 -> DoorFragment.newInstance(position)
                else -> CoverFragment.newInstance(-1)
            }

        return fragment
    }
}