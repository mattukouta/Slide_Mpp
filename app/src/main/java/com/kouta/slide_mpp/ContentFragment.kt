package com.kouta.slide_mpp

import Slide
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_content.*


class ContentFragment : Fragment() {

    companion object {
        lateinit var slide: Slide

        fun newInstance(slide: Slide): ContentFragment {
            val contentFragment = ContentFragment()
            this.slide = slide
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

        contentTitle.text = slide.Title

        subcontent_recyclerview.layoutManager = LinearLayoutManager(activity)

        val adapter = activity?.applicationContext?.let { SubContentAdapter(it, slide.subContents) }
        subcontent_recyclerview.adapter = adapter
    }
}