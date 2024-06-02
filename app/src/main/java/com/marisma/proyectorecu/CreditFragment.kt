package com.marisma.proyectorecu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.marisma.proyectorecu.databinding.FragmentCreditBinding

class CreditFragment {
    class CreditFragment : Fragment() {
        private var _binding: FragmentCreditBinding? = null
        private val binding
            get() = _binding!!

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {

            }
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            _binding = FragmentCreditBinding.inflate(inflater, container, false)
            return binding.root
        }

    }
}