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
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import kotlinx.android.synthetic.main.fragment_rentals.*


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
        val practice = listOf(
                Practice("Yuvraj", "Sexy", R.drawable.carsubs3),
                Practice("Tanmay", "SuperSexy", R.drawable.carsubs2),
                Practice("Manav", "UltraSexy", R.drawable.carsubs3)

        )
   

        binding.recyclerViewCarSubscription.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewCarSubscription.adapter = CarSubscriptionAdapter(carSubscription)
        // Inflate the layout for this fragment

        val apiKey = "AIzaSyDAOM0af4AwLsku0PSByzNI_EF_FeSPtGM"
        val autocompleteFragment =
            childFragmentManager.findFragmentById(R.id.autocomplete_fragment)
                    as AutocompleteSupportFragment
        // Initialize the SDK
        context?.let { Places.initialize(it, apiKey) }

        // Create a new PlacesClient instance
        val placesClient = context?.let { Places.createClient(it) }


        // Specify the types of place data to return.
        autocompleteFragment.setPlaceFields(listOf(Place.Field.ID, Place.Field.NAME))

        // Set up a PlaceSelectionListener to handle the response.
        autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
            override fun onPlaceSelected(place: Place) {
                // TODO: Get info about the selected place.
                Log.i(TAG, "Place: ${place.name}, ${place.id}")
            }

            override fun onError(status: Status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: $status")
            }
        })

//


        return binding.root
    }

    }



