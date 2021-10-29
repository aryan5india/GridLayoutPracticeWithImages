package com.ajaykumar.gridlayoutpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator


class GridViewAdapter(val cardTitle: Array<String>,
                      val cardImage: Array<String>) : RecyclerView.Adapter<GridViewAdapter.MyGridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_item_view, parent, false)
        return MyGridViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyGridViewHolder, position: Int) {
        holder.cardTitle.text = cardTitle[position]
        Picasso.get().load(cardImage[position]).into(holder.cardImage)

    }

    override fun getItemCount(): Int = cardTitle.size


    class MyGridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle = itemView.findViewById<TextView>(R.id.textViewTitle)
        val cardImage = itemView.findViewById<ImageView>(R.id.imageView)
    }
}

private fun RequestCreator.into(cardImage: ImageView?) {

}

//
//