package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.databinding.FragmentUserInfoBinding

/**
 * A simple [Fragment] subclass.
 * Use the [UserInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserInfoFragment : Fragment() {
    private var _binding: FragmentUserInfoBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFavoritos.setOnClickListener {
            findNavController().navigate(R.id.action_userInfoFragment_to_favItemListFragment)
        }

    }
}
