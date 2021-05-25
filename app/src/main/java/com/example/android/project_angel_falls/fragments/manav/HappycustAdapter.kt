package com.example.happycustomers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.happycustomer.view.*


class HappycustAdapter(val man: List<Happycust>):RecyclerView.Adapter<HappycustAdapter.custViewholder> (){
    class custViewholder(val view: View):RecyclerView.ViewHolder(view)
    {

    val textview1 : TextView= view.findViewById(R.id.txtreviewrv)
        val textview2 :TextView =view.findViewById(R.id.txtnamerv)
        val imageview1 : ImageView= view.findViewById(R.id.imgpicsrv)
        val textview3: TextView=view.findViewById(R.id.txtoccrv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): custViewholder {
        return custViewholder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.happycustomer,parent,false)
        )
    }

    override fun onBindViewHolder(holder: custViewholder, position: Int) {
        val pos= man[position]
        holder.textview1.text=pos.review
        holder.textview2.text=pos.name
        holder.textview3.text=pos.occ
        holder.imageview1.setImageResource(pos.pic)



    }

    override fun getItemCount()=man.size


}