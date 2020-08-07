package com.kouta.slide_mpp.slideview.cover

import Slide
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kouta.slide_mpp.R
import kotlinx.android.synthetic.main.fragment_cover.*


class CoverFragment : Fragment() {

    companion object {
        lateinit var slide: Slide

        fun newInstance(slide: Slide): CoverFragment {
            val coverFragment =
                CoverFragment()
            Companion.slide = slide
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

        title.text = slide.Title
    }
}