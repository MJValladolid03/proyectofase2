package com.marisma.proyectorecu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.marisma.proyectorecu.adapter.SerieAdapter
import com.marisma.proyectorecu.databinding.FragmentItemListBinding

class ItemListFragment : Fragment() {

    private var _binding: FragmentItemListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.item_list_title)

        iniciarRecyclerView()

        binding.btnPerfil.setOnClickListener {
            findNavController().navigate(R.id.action_itemListFragment_to_userInfoFragment)
        }

        binding.reciclerJuegos.adapter = SerieAdapter(SeriesProvider.seriesList) { datos ->
            onItemSelected(datos)
        }
    }

    private fun iniciarRecyclerView() {
        val layoutManager = GridLayoutManager(requireContext(), 1)
        binding.reciclerJuegos.layoutManager = layoutManager
    }

    private fun onItemSelected(datos: Series) {
        val bundle = Bundle().apply {
            putString("juegoNombre", datos.titulo)
            putString("juegoGenero", datos.genero)
            putString("juegoEstudio", datos.anio)
            putString("juegoFoto", datos.foto)
        }
        findNavController().navigate(R.id.action_itemListFragment_to_detailItemFragment, bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
