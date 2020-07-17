package com.kouta.slide_mpp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_door.*

class DoorFragment : Fragment() {

    companion object {
        const val DOOR_PAGE_KEY = "door_page"

        fun newInstance(position: Int): DoorFragment {
            val doorFragment = DoorFragment()
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

        title.text = arguments?.getInt(DOOR_PAGE_KEY).toString()
    }
}