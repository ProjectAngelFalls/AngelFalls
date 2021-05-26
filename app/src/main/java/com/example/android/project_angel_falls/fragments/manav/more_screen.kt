package com.example.morescreen

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentManager
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.databinding.FragmentMoreScreenBinding




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
            parentFragmentManager.beginTransaction()?.apply {
                replace(R.id.flMore, prof)
                addToBackStack(null)
                commit()
            }
        }
        val faq = Questions()
        binding.btnfaq.setOnClickListener {
            parentFragmentManager.beginTransaction()?.apply {
                replace(R.id.flMore, faq)
                addToBackStack(null)
                commit()
            }
        }
        val tar = tariff()
        binding.btntarr.setOnClickListener {
            parentFragmentManager.beginTransaction()?.apply {
                replace(R.id.flMore, tar)
                addToBackStack(null)
                commit()
            }
        }
        val feed = sharefeedback()
        binding.btnfeed.setOnClickListener{
            childFragmentManager.beginTransaction()?.apply {
                replace(R.id.flMore, feed)
                addToBackStack(null)
                commit()
            }
        }


    }
}