package com.kouta.slide_mpp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_cover.*


class CoverFragment : Fragment() {

    companion object {
        const val COVER_PAGE_KEY = "cover_page"

        fun newInstance(position: Int): CoverFragment {
            val coverFragment = CoverFragment()
            coverFragment.arguments = Bundle().apply {
                putInt(COVER_PAGE_KEY, position)
            }
            return coverFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_cover, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.text = arguments?.getInt(COVER_PAGE_KEY).toString()
    }
}