package com.qbra.filmbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qbra.filmbook.databinding.ActivityFilmDetailsBinding

class FilmDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilmDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val film = intent.getSerializableExtra("film") as Films

        binding.nameText.text = film.name
        binding.yearText.text = film.year.toString()
        binding.imageView.setImageResource(film.image)
    }
}