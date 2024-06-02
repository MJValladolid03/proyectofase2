package com.marisma.proyectorecu.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marisma.proyectorecu.Series
import com.marisma.proyectorecu.databinding.ItemseriesBinding

class SeriesViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val binding = ItemseriesBinding.bind(view)

    fun render(serieHolder: Series, onClickListener: (Series) -> Unit){
        binding.tvSeriesName.text = serieHolder.titulo
        binding.tv2.text = serieHolder.genero
        binding.tvSeriesGenero.text = serieHolder.anio
        Glide.with(binding.ivSeries.context).load(serieHolder.foto).into(binding.ivSeries)
        itemView.setOnClickListener{onClickListener(serieHolder)}

    }


}