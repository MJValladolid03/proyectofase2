package com.marisma.proyectorecu.adapter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.buttonGame1.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_itemListFragment)
        }

        binding.buttonGame2.setOnClickListener {
            // Abrir la aplicación de correo electrónico
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("correo@example.com"))
            startActivity(intent)
        }

        binding.buttonGame3.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }

        binding.buttonBackToLogin.setOnClickListener {
            // Aquí puedes realizar la navegación al fragmento de LoginFragment
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }


        return root
    }
}
