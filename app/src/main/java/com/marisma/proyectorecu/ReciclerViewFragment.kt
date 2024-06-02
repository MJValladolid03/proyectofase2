package com.marisma.proyectorecu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.marisma.proyectorecu.adapter.SerieAdapter
import com.marisma.proyectorecu.databinding.FragmentReciclerView2Binding


class ReciclerViewFragment : Fragment() {

    private var _binding: FragmentReciclerView2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReciclerView2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView() {
        val manager = GridLayoutManager(requireContext(), 1)
        binding.reciclerJuegos.layoutManager = manager

        // Obtener la lista de juegos desde JuegoProvider
        val listaJuegos = SeriesProvider.seriesList

        // Pasar la lista de juegos al adaptador
        binding.reciclerJuegos.adapter = SerieAdapter(listaJuegos) { Series ->
            onItemSelected(Series)
        }
    }



    private fun onItemSelected(datos: Series) {
        Toast.makeText(
            requireContext(),
            datos.titulo,
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
