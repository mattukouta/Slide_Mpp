package com.kouta.slide_mpp

import Slide
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_door.title

class DoorFragment : Fragment() {

    companion object {
        const val DOOR_PAGE_KEY = "door_page"
        lateinit var slide: Slide

        fun newInstance(position: Int, slide: Slide): DoorFragment {
            val doorFragment = DoorFragment()
            this.slide = slide
            doorFragment.arguments = Bundle().apply {
                putInt(DOOR_PAGE_KEY, position)
            }
            return doorFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_door, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        title.text = arguments?.getInt(DOOR_PAGE_KEY).toString()
        title.text = slide.Title
    }
}