package com.kouta.slide_mpp

import Slide
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SlideAdapter(fragmentActivity: FragmentActivity, private val slide: List<Slide>): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val fragment =
            when(slide[position].SlideType) {
                "cover" -> CoverFragment.newInstance(position, slide[position])
                "door" -> DoorFragment.newInstance(position, slide[position])
                "content" -> ContentFragment.newInstance(position, slide[position])
                else -> CoverFragment.newInstance(-1, slide[position])
            }

        return fragment
    }
}