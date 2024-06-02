package com.marisma.proyectorecu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marisma.proyectorecu.R
import com.marisma.proyectorecu.Series

class SerieAdapter(private val juegosLista:List<Series>, private val onClickListener: (Series) -> Unit) : RecyclerView.Adapter<SeriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SeriesViewHolder(layoutInflater.inflate(R.layout.itemseries,parent,false))
    }

    override fun getItemCount(): Int = juegosLista.size

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        holder.render(juegosLista[position], onClickListener)

    }

}