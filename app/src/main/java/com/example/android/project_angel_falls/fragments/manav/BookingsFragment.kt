package com.example.android.project_angel_falls.fragments.manav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.databinding.FragmentBookingsBinding
import com.example.android.project_angel_falls.databinding.FragmentRentalsBinding
import java.util.*

lateinit var binding: FragmentBookingsBinding
class BookingsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentBookingsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_bookings, container, false)



        val today = Calendar.getInstance()
        binding.datePicker1.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->
            val month = month + 1
            val msg = "You Selected: $day/$month/$year"
            Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
        }
        return inflater.inflate(R.layout.fragment_bookings, container, false)
    }


}