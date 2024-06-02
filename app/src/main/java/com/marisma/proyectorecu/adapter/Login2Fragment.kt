package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.databinding.FragmentLogin2Binding

class Login2Fragment : Fragment() {
    private var _binding: FragmentLogin2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogin2Binding.inflate(inflater, container, false)
        val root: View = binding.root


        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_login2Fragment_to_viewPagerFragment)

        }

        return root
    }
}