package com.example.android.project_angel_falls.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.project_angel_falls.AffordableCars
import com.example.android.project_angel_falls.AffordableCarsAdapter
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.RecyclerViews.CarSubscription.CarSubscription
import com.example.android.project_angel_falls.RecyclerViews.CarSubscription.CarSubscriptionAdapter
import com.example.android.project_angel_falls.databinding.FragmentHomeBinding


class homeFragment : Fragment() {
    val sampleImage = intArrayOf(R.drawable.sscar1, R.drawable.sscar2, R.drawable.sscar3, R.drawable.sscar4)
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.carouselView.pageCount = sampleImage.size



        binding.carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImage[position])}
//        binding.carouselView.setImageListener { position, view: View ->
//            when(position){
//                0-> findNavController(view).navigate(R.id.action_homeFragment_to_rentFragment)
//                1-> findNavController(view).navigate(R.id.action_homeFragment_to_rentFragment)
//                2->findNavController(view).navigate(R.id.action_homeFragment_to_rentFragment)
//                3->findNavController(view).navigate(R.id.action_homeFragment_to_rentFragment)
//                else -> findNavController(view).navigate(R.id.action_homeFragment_to_buySellFragment)
//            }
//
//        }

        val carSubscription = listOf(
                CarSubscription("0","Sanitised Cars","@₹339/day","Min, 1 month extend anytime", ""),
                CarSubscription("1","Need a car","for few months","Min, 1 month extend anytime", ""),
                CarSubscription("2","Sanitised Cars","@₹339/day","Min, 1 month extend anytime", ""),
                CarSubscription("3","Sanitised Cars","@₹339/day","Min, 1 month extend anytime", ""),

        )

        binding.recyclerViewCarSubscription.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerViewCarSubscription.adapter = CarSubscriptionAdapter(carSubscription)
        // Inflate the layout for this fragment
        return binding.root




        return binding.root
    }

    }



