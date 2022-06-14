package com.example.myrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.Pelicula
import com.example.myrecyclerview.R

class PeliculaAdapter(private val peliculasList: List<Pelicula>) :RecyclerView.Adapter<PeliculaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculaViewHolder(layoutInflater.inflate(R.layout.item_pelicula, parent, false))
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val item = peliculasList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = peliculasList.size
}