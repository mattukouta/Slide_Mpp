package com.kouta.slide_mpp.slideview.door

import Slide
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kouta.slide_mpp.R
import kotlinx.android.synthetic.main.fragment_door.*

class DoorFragment : Fragment() {

    companion object {
        lateinit var slide: Slide

        fun newInstance(slide: Slide): DoorFragment {
            val doorFragment = DoorFragment()
            Companion.slide = slide
            return doorFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_door, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        subTitle.text = slide.Title
    }
}