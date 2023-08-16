package com.qbra.filmbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbra.filmbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var filmList = ArrayList<Films>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val ladyBird : Films = Films("Lady Bird", 2017, R.drawable.ladybird)
        val francesHa : Films = Films("Frances Ha", 2012, R.drawable.francesha)
        val julieAndJulia : Films = Films("Julie and Julia", 2009, R.drawable.julieandjulia)

        filmList.add(ladyBird)
        filmList.add(francesHa)
        filmList.add(julieAndJulia)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = FilmAdapter(filmList)
        binding.recyclerView.adapter = adapter
    }
}