package com.example.android.project_angel_falls

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_affordable_cars.view.*

class AffordableCarsAdapter( val affordableCars: List<AffordableCars>):
    RecyclerView.Adapter<AffordableCarsAdapter.AffordableCarsViewHolder>() {


    class AffordableCarsViewHolder(val view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffordableCarsViewHolder {
        return AffordableCarsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_affordable_cars, parent, false)

        )
    }

    override fun onBindViewHolder(holder: AffordableCarsViewHolder, position: Int) {
        val affordableCar = affordableCars[position]
        holder.view.txtNameOfCar.text = affordableCar.name
        holder.view.txtSeatCapacity.text= affordableCar.seating_capacity
    }

    override fun getItemCount() = affordableCars.size

}