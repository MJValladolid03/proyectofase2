package com.marisma.proyectorecu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.marisma.proyectorecu.adapter.SerieAdapter
import com.marisma.proyectorecu.databinding.FragmentReciclerView2Binding

class ReciclerViewActivity : AppCompatActivity() {
    private lateinit var binding: FragmentReciclerView2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_recicler_view2)
        binding = FragmentReciclerView2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarRecyclerView()
    }
    fun iniciarRecyclerView(){
        val manager = GridLayoutManager(this,1)
        binding.reciclerJuegos.layoutManager = manager
        binding.reciclerJuegos.adapter = SerieAdapter(SeriesProvider.seriesList){
                datos ->  onItemSelected(
            datos
        )
        }


    }
    private fun onItemSelected(datos:Series){
        Toast.makeText(
            this,
            datos.titulo,
            Toast.LENGTH_SHORT
        ).show()
    }

}