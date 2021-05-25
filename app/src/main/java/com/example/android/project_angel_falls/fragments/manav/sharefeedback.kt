package com.example.morescreen

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.morescreen.databinding.FragmentMoreScreenBinding
import com.example.morescreen.databinding.FragmentSharefeedbackBinding


class sharefeedback : Fragment() {

    lateinit var binding: FragmentSharefeedbackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSharefeedbackBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
        return inflater.inflate(R.layout.fragment_sharefeedback, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnsubmit.setOnClickListener {
            binding.edtfeed.visibility=View.GONE


            val toast = Toast.makeText(activity,"Thanks for feedback",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0 ,0)
            toast.show()
        }

    }


}