package com.example.recycle_view_arka

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter (private val animals : ArrayList<String>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_list, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.TextLine.text = animals[position]
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val TextLine : TextView = itemView!!.findViewById(R.id.textView)
    }
}




































