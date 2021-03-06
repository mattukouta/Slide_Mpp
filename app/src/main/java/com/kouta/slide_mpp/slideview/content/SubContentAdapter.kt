package com.kouta.slide_mpp.slideview.content

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kouta.slide_mpp.R
import kotlinx.android.synthetic.main.subcontent_item.view.*

class SubContentAdapter(private val context: Context, private val subContents: List<Slide.SubContent>?) : RecyclerView.Adapter<SubContentAdapter.SubContentHolder>() {
    class SubContentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subContentTitle: TextView = itemView.sub_content_title
        val subContentTitlePoint: ImageView = itemView.sub_content_title_point
        val subSubContentRecyclerView: RecyclerView = itemView.subsubcontent_recyclerview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubContentHolder =
        SubContentHolder(
            LayoutInflater.from(context).inflate(
                R.layout.subcontent_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = subContents?.size ?: 0

    override fun onBindViewHolder(holder: SubContentHolder, position: Int) {
        if (subContents != null) {
            holder.subContentTitle.text = subContents[position].subContent.keys.first()

            holder.subContentTitlePoint.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_send_24))

            holder.subSubContentRecyclerView.layoutManager = LinearLayoutManager(context)
            val adapter =
                SubSubContentAdapter(
                    context,
                    subContents[position].subContent.values.first()
                )

            holder.subSubContentRecyclerView.adapter = adapter
        }
    }
}