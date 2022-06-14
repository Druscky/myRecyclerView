package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myrecyclerview.adapter.PeliculaAdapter
import com.example.myrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.recyclerPelicula.layoutManager = manager
        b.recyclerPelicula.addItemDecoration(decoration)
        b.recyclerPelicula.layoutManager = LinearLayoutManager(this)
        b.recyclerPelicula.adapter = PeliculaAdapter(PeliculaProvider.peliculasList)
    }
}