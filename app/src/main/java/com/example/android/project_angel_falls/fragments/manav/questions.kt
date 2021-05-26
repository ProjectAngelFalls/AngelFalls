package com.example.morescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.project_angel_falls.R
import com.example.android.project_angel_falls.databinding.FragmentQuestionsBinding



class Questions : Fragment() {
    lateinit var binding: FragmentQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionsBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
        return inflater.inflate(R.layout.fragment_questions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var counta = 1
        var countb=1
        var countc=1
        var countd=1
        var counte=1
        binding.btnque1.setOnClickListener {
            if (counta == 1) {
                binding.txtkm.visibility = View.VISIBLE
                counta=2
            }
            else
            {
                binding.txtkm.visibility = View.GONE
                counta=1
            }
        }
        binding.btnque2.setOnClickListener {
            if (countb == 1) {
                binding.txtlia.visibility = View.VISIBLE
                countb=2
            }
            else
            {
                binding.txtlia.visibility = View.GONE
                countb=1
            }
        }
        binding.btnque3.setOnClickListener {
            if (countc == 1) {
                binding.txttoll.visibility = View.VISIBLE
                countc=2
            }
            else
            {
                binding.txttoll.visibility = View.GONE
                countc=1
            }
        }
        binding.btnque4.setOnClickListener {
            if (countd == 1) {
                binding.txtdoc.visibility = View.VISIBLE
                countd=2
            }
            else
            {
                binding.txtdoc.visibility = View.GONE
                countd=1
            }
        }
        binding.btnque5.setOnClickListener {
            if (counte == 1) {
                binding.txtnot.visibility = View.VISIBLE
                counte=2
            }
            else
            {
                binding.txtnot.visibility = View.GONE
                counte=1
            }
        }

    }
}