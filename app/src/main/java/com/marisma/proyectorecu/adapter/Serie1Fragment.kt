package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marisma.proyectorecu.databinding.FragmentSerie1Binding

class Serie1Fragment : Fragment() {


    private var _binding : FragmentSerie1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_about1, container, false)

        _binding = FragmentSerie1Binding.inflate(inflater, container, false)

        return binding.root
    }


}