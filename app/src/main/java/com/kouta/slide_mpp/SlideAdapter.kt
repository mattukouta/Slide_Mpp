package com.kouta.slide_mpp

import Slide
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kouta.slide_mpp.slideview.content.ContentFragment
import com.kouta.slide_mpp.slideview.cover.CoverFragment
import com.kouta.slide_mpp.slideview.door.DoorFragment

class SlideAdapter(fragmentActivity: FragmentActivity, private val slide: List<Slide>): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = slide.size

    override fun createFragment(position: Int): Fragment {
        val fragment =
            when(slide[position].SlideType) {
                "cover" -> CoverFragment.newInstance(slide[position])
                "door" -> DoorFragment.newInstance(slide[position])
                "content" -> ContentFragment.newInstance(slide[position])
                else -> CoverFragment.newInstance(slide[position])
            }

        return fragment
    }
}