package com.example.android.project_angel_falls.PracticeRecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.RecyclerViews.CarSubscription.CarSubscription
import kotlinx.android.synthetic.main.practice_item.view.*
import okio.Utf8.size

class PracticeAdapter(val practice: List<Practice>): RecyclerView.Adapter<PracticeAdapter.PracticeViewHolder>()
{
    class PracticeViewHolder(val view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracticeViewHolder {
        return PracticeViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.practice_item,parent,false))
    }

    override fun onBindViewHolder(holder: PracticeViewHolder, position: Int) {
        val practiceItem = practice[position]
        holder.view.txtTitlePractice.text = practiceItem.title
        holder.view.txtSubTitlePractice.text = practiceItem.subTitle
        holder.view.imgImagePractice.setImageResource(practiceItem.image)
    }

    override fun getItemCount() = practice.size

}

//class CarSubscriptionAdapter(val carSubscription: List<CarSubscription>): RecyclerView.Adapter<CarSubscriptionAdapter.CarSubscriptionViewHolder>() {
//    class CarSubscriptionViewHolder(val view: View): RecyclerView.ViewHolder(view)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarSubscriptionViewHolder {
//        return CarSubscriptionViewHolder(
//                LayoutInflater.from(parent.context)
//                        .inflate(R.layout.car_subscription_item, parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: CarSubscriptionViewHolder, position: Int) {
//        val subscription = carSubscription[position]
//        holder.view.txtTitle.text = subscription.title
//        holder.view.txtSubTitle.text = subscription.subTitle
//        holder.view.txtText.text = subscription.text
//        holder.view.imgCarSub.setImageResource(subscription.image)
//    }
//
//
//    override fun getItemCount(): Int = carSubscription.size
//
//}