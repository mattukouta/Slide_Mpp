package com.kouta.slide_mpp

import Slide
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_cover.*


class ContentFragment : Fragment() {

    companion object {
        const val CONTENT_PAGE_KEY = "content_page"
        lateinit var slide: Slide

        fun newInstance(position: Int, slide: Slide): ContentFragment {
            val contentFragment = ContentFragment()
            this.slide = slide
            contentFragment.arguments = Bundle().apply {
                putInt(CONTENT_PAGE_KEY, position)
            }
            return contentFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        title.text = arguments?.getInt(CONTENT_PAGE_KEY).toString()
        title.text = slide.Title
    }
}