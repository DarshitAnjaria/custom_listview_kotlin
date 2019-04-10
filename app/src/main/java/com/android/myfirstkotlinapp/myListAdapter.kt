package com.android.myfirstkotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myListAdapter(val ctx : Context, val resource : Int, val items : List<Nature>) : ArrayAdapter<Nature>(ctx, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater : LayoutInflater = LayoutInflater.from(ctx)
        val view : View = layoutInflater.inflate(resource, null)

        val imgView : ImageView = view.findViewById(R.id.ivNature)
        val tvName : TextView = view.findViewById(R.id.tvName)

        val nature : Nature = items[position]

        imgView.setImageDrawable(context.resources.getDrawable(nature.image))
        tvName.text = nature.name

        return view
    }
}