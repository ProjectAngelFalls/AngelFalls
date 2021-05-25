package com.example.morescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.morescreen.databinding.FragmentMoreScreenBinding


class more_screen : Fragment() {
    lateinit var binding: FragmentMoreScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoreScreenBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
        return inflater.inflate(R.layout.fragment_more_screen, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val prof = manage_profile()
        binding.btnprof.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.flfragment, prof)
                addToBackStack(null)
                commit()
            }
        }
        val faq = Questions()
        binding.btnfaq.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.flfragment, faq)
                addToBackStack(null)
                commit()
            }
        }
        val tar = tariff()
        binding.btntarr.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.flfragment, tar)
                addToBackStack(null)
                commit()
            }
        }
        val feed = sharefeedback()
        binding.btnfeed.setOnClickListener{
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.flfragment, feed)
                addToBackStack(null)
                commit()
            }
        }


    }
}