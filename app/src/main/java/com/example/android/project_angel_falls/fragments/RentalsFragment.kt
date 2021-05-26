package com.example.android.project_angel_falls.fragments

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.project_angel_falls.PracticeRecycleView.Practice
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.RecyclerViews.CarSubscription.CarSubscription
import com.example.android.project_angel_falls.RecyclerViews.CarSubscription.CarSubscriptionAdapter
import com.example.android.project_angel_falls.databinding.FragmentRentalsBinding


class RentalsFragment : Fragment() {
    val sampleImage = intArrayOf(R.drawable.sscar1, R.drawable.sscar2, R.drawable.sscar3, R.drawable.sscar4)
    lateinit var binding: FragmentRentalsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentRentalsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_rentals, container, false)

        binding.carouselView.pageCount = sampleImage.size
        binding.carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImage[position])}





        val carSubscription = listOf(
                CarSubscription(R.drawable.carsubs1, "Sanitised Cars", "@₹339 /day", "Min, 1 month extend anytime.\nOnly Rs.5000 refundable deposit\nDoorstep delivery in 2 days."),
                CarSubscription(R.drawable.carsubs2, "Need a car", "for few months", "Min 1 month,\nextend anytime"),
                CarSubscription(R.drawable.carsubs3, "Drive a car with", "no loan liability", "Only Rs5000\nrefundable deposit."),
                CarSubscription(R.drawable.carsubs4, "Need a car", "urgently?", "Doorstep delivery\nin two days"),

                )



        binding.recyclerViewCarSubscription.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewCarSubscription.adapter = CarSubscriptionAdapter(carSubscription)
        // Inflate the layout for this fragment

        return binding.root
    }

    }



