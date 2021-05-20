package com.example.android.project_angel_falls.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.project_angel_falls.AffordableCars
import com.example.android.project_angel_falls.AffordableCarsAdapter
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.databinding.FragmentSubscriptionsBinding


class SubscriptionsFragment : Fragment() {
    lateinit var binding: FragmentSubscriptionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSubscriptionsBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_subscriptions,container,false)
        val affordableCars = listOf(
            AffordableCars(1,"","6","Tata Safari 1") ,
            AffordableCars(2,"","6","Tata Safari 2") ,
            AffordableCars(3,"","6","Tata Safari 3") ,
            AffordableCars(4,"","6","Tata Safari 4") ,
            AffordableCars(5,"","6","Tata Safari 5") ,
            AffordableCars(6,"","6","Tata Safari 6") ,
            AffordableCars(7,"","6","Tata Safari 7") ,
            AffordableCars(8,"","6","Tata Safari 8") ,)
        binding.recyclerViewAffordableCars.layoutManager = LinearLayoutManager(activity)
        binding.recyclerViewAffordableCars.adapter = AffordableCarsAdapter(affordableCars)
        // Inflate the layout for this fragment
        return binding.root
    }



}

