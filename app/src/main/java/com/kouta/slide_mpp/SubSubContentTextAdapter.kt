package com.kouta.slide_mpp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subsubcontent_text_item.view.*

class SubSubContentTextAdapter(private val context: Context, private val subSubContentText: List<String>?) : RecyclerView.Adapter<SubSubContentTextAdapter.ContentHolder>() {
    class ContentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subSubContentText: TextView = itemView.sub_sub_content_text
        val subSubContentTextPoint: ImageView = itemView.sub_sub_content_text_point
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentHolder = ContentHolder(
        LayoutInflater.from(context).inflate(R.layout.subsubcontent_text_item, parent, false))

    override fun getItemCount(): Int = subSubContentText?.size ?: 0

    override fun onBindViewHolder(holder: ContentHolder, position: Int) {
        if (subSubContentText != null) {
            holder.subSubContentText.text = subSubContentText[position]
            holder.subSubContentTextPoint.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_navigate_next_24))
            Log.d("check", subSubContentText[position])
        }
    }
}