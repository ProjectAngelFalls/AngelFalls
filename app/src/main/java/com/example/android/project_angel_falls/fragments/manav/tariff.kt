package com.example.morescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.databinding.FragmentTariffBinding



class tariff : Fragment() {
    lateinit var binding: FragmentTariffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val  binding: FragmentTariffBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_tariff, container, false)
        val tariffval = listOf(
            Props("Ford Ecosport", "Rs 74/hr", "Rs 147/hr", "Rs 176/hr","Rs 13/km",R.drawable.sscar1),
            Props("Honda City", "Rs 129/hr", "Rs 181/hr", "Rs 215/hr","Rs 12/km", R.drawable.ss2car),
            Props("Hyundai Grand i10", "Rs 69/hr", "Rs 108/hr", "Rs 128/hr","Rs 9/km",R.drawable.ss3car),
            Props("Mahindra Scorpio", "Rs 95/hr", "Rs 153/hr", "Rs 182/hr","Rs 14/km",R.drawable.ss4car),
            Props("Mahindra XUV", "Rs 129/hr", "Rs 198/hr", "Rs 235/hr","Rs 14/km",R.drawable.ss5car),
            Props("Maruti Celerio", "Rs 59/hr", "Rs 90/hr", "Rs 108/hr","Rs 9/km",R.drawable.ss6car),
            Props("Maruti Baleno", "Rs 70/hr", "Rs 129/hr", "Rs 154/hr","Rs 11/km",R.drawable.ss7car),
            Props("Maruti Swift", "Rs 77/hr", "Rs 118/hr", "Rs 14-/hr","Rs 9/km",R.drawable.ss8car),
            Props("Maruti swift dzire", "Rs 85/hr", "Rs 130/hr", "Rs 155/hr","Rs 11/km",R.drawable.ss9car),
            Props("Honda Amaze", "Rs 85/hr", "Rs 130/hr", "Rs 155/hr","Rs 11/km",R.drawable.ss10car),
            Props("Maruti Ciaz", "Rs 114/hr", "Rs 157/hr", "Rs 187/hr","Rs 12/km",R.drawable.ss11car),
            Props("Maruti Ertiga", "Rs 89/hr", "Rs 145/hr", "Rs 173/hr","Rs 14/km",R.drawable.ss12car),
            Props("Hyundai Xcent", "Rs 85/hr", "Rs 130/hr", "Rs 155/hr","Rs 11/km",R.drawable.ss13car),
            Props("Toyota Innova Crysta", "Rs 175/hr", "Rs 261/hr", "Rs 311/hr","Rs 15/km",R.drawable.ss14car),
            Props("Maruti Ciaz AT", "Rs 127/hr", "Rs 177/hr", "Rs 210/hr","Rs 12/km",R.drawable.ss15car),
            Props("Volkswagen Vento", "Rs 122/hr", "Rs 168/hr", "Rs 200/hr","Rs 12/km",R.drawable.ss16car),
            Props("Hyundai Elite i20", "Rs 85/hr", "Rs 135/hr", "Rs 160/hr","Rs 11/km",R.drawable.ss17car),
            Props("Hyundai Creta", "Rs 113/hr", "Rs 175/hr", "Rs 209/hr","Rs 14/km",R.drawable.ss18car),
            Props("Mahindra KUV100", "Rs 58/hr", "Rs 107/hr", "Rs 129/hr","Rs 9/km",R.drawable.ss19car),
            Props("Maruti Alto K10", "Rs 54/hr", "Rs 85/hr", "Rs 101/hr","Rs 7/km",R.drawable.ss20car),
            Props("Maruti Brezza", "Rs 96/hr", "Rs 148/hr", "Rs 176/hr","Rs 13/km",R.drawable.ss21car),
            Props("Mahindra Marazzo", "Rs 105/hr", "Rs 168/hr", "Rs 200/hr","Rs 14/km",R.drawable.ss22car),
            Props("Hyundai Santro MT", "Rs 61/hr", "Rs 92/hr", "Rs 111/hr","Rs 8/km",R.drawable.ss23car),
            Props("Hyumdai Santro AT", "Rs 70/hr", "Rs 107/hr", "Rs 128/hr","Rs 8/km",R.drawable.ss24car),
            Props("Maruti Wagon R", "Rs 47/hr", "Rs 74/hr", "Rs 89/hr","Rs 8/km",R.drawable.ss25car),
            Props("Hyundai Verna AT", "Rs 118/hr", "Rs 169/hr", "Rs 203/hr","Rs 12/km",R.drawable.ss26car),
            Props("Hyundai Verna MT", "Rs 113/hr", "Rs 160/hr", "Rs 191/hr","Rs 12/km",R.drawable.ss27car),
            Props("Maruti Swift AT", "Rs 86/hr", "Rs 144/hr", "Rs 172/hr","Rs 9/km",R.drawable.ss28car),
            Props("Hyundai Creta AT", "Rs 143/hr", "Rs 224/hr", "Rs 266/hr","Rs 14/km",R.drawable.ss29car),
            Props("Maruti Brezza AT", "Rs 97/hr", "Rs 156/hr", "Rs 187/hr","Rs 13/km",R.drawable.ss30car),
            Props("Maruti Baleno AT", "Rs 83/hr", "Rs 153/hr", "Rs 182/hr","Rs 11/km",R.drawable.ss31car),
            Props("Hyundai Venue AT", "Rs 97/hr", "Rs 154/hr", "Rs 185/hr","Rs 13/km",R.drawable.ss32car),
            Props("Mahindra XUV300(P)", "Rs 77/hr", "Rs 125/hr", "Rs 152/hr","Rs 13/km",R.drawable.ss33car),
            Props("Mahindra XUV300", "Rs 85/hr", "Rs 136/hr", "Rs 163/hr","Rs 13/km",R.drawable.ss34car),
            Props("Hyundai Elite i20(p)", "Rs 74/hr", "Rs 117/hr", "Rs 139/hr","Rs 11/km",R.drawable.ss35car),
            Props("Maruti Baleno (P)", "Rs 67/hr", "Rs 126/hr", "Rs 151/hr","Rs 11/km",R.drawable.ss36car)




        )
        binding.recviewtariff.layoutManager=LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        binding.recviewtariff.adapter=PropsAdapter(tariffval)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}