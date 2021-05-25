package com.example.morescreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PropsAdapter(val man: List<Props>): RecyclerView.Adapter<PropsAdapter.propsViewholder> () {
    class propsViewholder(val view: View):RecyclerView.ViewHolder(view)
    {

        val textview1 : TextView = view.findViewById(R.id.weekday)
        val textview2 : TextView =view.findViewById(R.id.weekend)
        val imageview1 : ImageView = view.findViewById(R.id.carpic)
        val textview3: TextView =view.findViewById(R.id.peakseason)
        val textview4: TextView =view.findViewById(R.id.extrakmcharge)
        val textview5: TextView =view.findViewById(R.id.carname)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): propsViewholder {
        return propsViewholder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rectariff,parent,false)
        )
    }
    override fun onBindViewHolder(holder: propsViewholder, position: Int) {
        val pos= man[position]
        holder.textview1.text=pos.weekdaypri
        holder.textview2.text=pos.weekendpri
        holder.textview3.text=pos.peakseapri
        holder.imageview1.setImageResource(pos.carim)
        holder.textview4.text=pos.extrakmpri
        holder.textview5.text=pos.name



    }
    override fun getItemCount()=man.size
}