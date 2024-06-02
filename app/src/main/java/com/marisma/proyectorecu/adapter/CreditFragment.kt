package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marisma.proyectorecu.databinding.FragmentCreditBinding

class CreditFragment : Fragment() {
    private var _binding: FragmentCreditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access views using binding
        binding.tvMessage.text = "Usuario gracias por usar la versión 1 de la aplicación."

        binding.Contactar.setOnClickListener {
            // Handle button click
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = CreditFragment()
    }
}
