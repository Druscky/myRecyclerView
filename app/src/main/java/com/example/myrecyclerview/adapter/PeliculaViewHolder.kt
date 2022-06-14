package com.example.myrecyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myrecyclerview.Pelicula
import com.example.myrecyclerview.R
import com.example.myrecyclerview.databinding.ItemPeliculaBinding

class PeliculaViewHolder (view:View):RecyclerView.ViewHolder(view){
    val b = ItemPeliculaBinding.bind(view)
    fun render(peliculaModel: Pelicula){
        b.tvTitulo.text = peliculaModel.titulo
        b.tvDirector.text = peliculaModel.director
        b.tvDescripcion.text = peliculaModel.descripcion
        b.tvYear.text = peliculaModel.year
        Glide.with(b.ivCartel.context)
            .load(peliculaModel.imagenPelicula)
            .error(R.drawable.shhhh).into(b.ivCartel)
        b.ivCartel.setOnClickListener {
            Toast.makeText(b.ivCartel.context, peliculaModel.imagenPelicula, Toast.LENGTH_SHORT).show()
        itemView.setOnClickListener {
            Toast.makeText(b.ivCartel.context, peliculaModel.imagenPelicula, Toast.LENGTH_SHORT).show()
        }
        }
    }
}