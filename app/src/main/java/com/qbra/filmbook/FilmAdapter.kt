package com.qbra.filmbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qbra.filmbook.databinding.RecyclerRowBinding

class FilmAdapter(val filmList: ArrayList<Films>) : RecyclerView.Adapter<FilmAdapter.FilmHolder>() {
    class FilmHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilmHolder(binding)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.binding.textView.text = filmList[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, FilmDetailsActivity::class.java)
            intent.putExtra("film", filmList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}