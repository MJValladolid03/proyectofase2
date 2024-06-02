package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.databinding.FragmentSerie2Binding

class Serie2Fragment : Fragment() {

    private var _binding: FragmentSerie2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSerie2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set click listener for the button using binding
        binding.btnMenu.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
        }

        return root // Return the root view from binding
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun closeFragment() {
        requireActivity().supportFragmentManager.popBackStack()
    }
}