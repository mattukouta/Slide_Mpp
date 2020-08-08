package com.kouta.slide_mpp.slideview.content

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kouta.slide_mpp.R
import kotlinx.android.synthetic.main.subsubcontent_item.view.*

class SubSubContentAdapter(private val context: Context, private val subSubContents: List<Slide.SubContent.SubSubContent>?) : RecyclerView.Adapter<SubSubContentAdapter.SubSubContentHolder>() {

    class SubSubContentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subSubContentTitle: TextView = itemView.sub_sub_content_title
        val subSubContentTitlePoint: ImageView = itemView.sub_sub_content_title_point
        val subSubContentTextRecyclerView: RecyclerView = itemView.sub_sub_content_title_recyclerview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubSubContentHolder =
        SubSubContentHolder(
            LayoutInflater.from(context).inflate(
                R.layout.subsubcontent_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = subSubContents?.size ?: 0

    override fun onBindViewHolder(holder: SubSubContentHolder, position: Int) {
        if (subSubContents != null) {
            holder.subSubContentTitle.text = subSubContents[position].subSubContent.keys.first().toString()
            Log.d("check", subSubContents[position].subSubContent.keys.first().toString())
            holder.subSubContentTitlePoint.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_play_arrow_24))

            holder.subSubContentTextRecyclerView.layoutManager = LinearLayoutManager(context)
            val adapter =
                SubSubContentTextAdapter(
                    context,
                    subSubContents[position].subSubContent.values.first()
                )

            holder.subSubContentTextRecyclerView.adapter = adapter
        }
    }
}