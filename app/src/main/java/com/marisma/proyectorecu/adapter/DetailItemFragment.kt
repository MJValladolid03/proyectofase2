package com.marisma.proyectorecu.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.databinding.FragmentDetailItemBinding

/**
 * A simple [Fragment] subclass.
 * Use the [DetailItemFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailItemFragment : Fragment() {
    private var _binding: FragmentDetailItemBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val juegoNombre = arguments?.getString("SerieNombre")
        val juegoGenero = arguments?.getString("SerieGenero")
        val juegoEstudio = arguments?.getString("SerieEstudio")
        val juegoNota = arguments?.getInt("SerieNota", 0) // Valor predeterminado en caso de que no haya un valor
        val juegoFoto = arguments?.getString("SerieFoto")

        // Actualizar las vistas con los detalles del juego
        juegoNombre?.let {
            binding.textViewJuego.text = "Nombre: $it"
        }
        juegoGenero?.let {
            binding.textViewGenero.text = "Género: $it"
        }
        juegoEstudio?.let {
            binding.textViewEstudio.text = "Fecha: $it"
        }
        juegoNota?.let {
            binding.textViewNota.text = "Foto: $it"
        }

        juegoFoto?.let {
            // Cargar la foto utilizando Glide o Picasso
            Glide.with(this)
                .load(juegoFoto)
                .placeholder(R.drawable.netflixsolon) // Opcional: establece una imagen de marcador de posición mientras se carga la imagen
                .error(R.drawable.netflixsolon) // Opcional: establece una imagen de error si la carga de la imagen falla
                .into(binding.ivSeries)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

