package com.example.android.project_angel_falls.RecyclerViews.CarSubscription

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.project_angel_falls.AffordableCars
import com.example.android.project_angel_falls.AffordableCarsAdapter
import com.example.android.project_angel_falls.R
import kotlinx.android.synthetic.main.car_subscription_item.view.*

class CarSubscriptionAdapter(val carSubscription: List<CarSubscription>): RecyclerView.Adapter<CarSubscriptionAdapter.CarSubscriptionViewHolder>() {
    class CarSubscriptionViewHolder(val view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarSubscriptionViewHolder {
        return CarSubscriptionViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.car_subscription_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CarSubscriptionViewHolder, position: Int) {
        val subscription = carSubscription[position]
        holder.view.txtTitle.text = subscription.title
        holder.view.txtSubTitle.text = subscription.subTitle
        holder.view.txtText.text = subscription.text
    }


    override fun getItemCount(): Int = carSubscription.size

}






