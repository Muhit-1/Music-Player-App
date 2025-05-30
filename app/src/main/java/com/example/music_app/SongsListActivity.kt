package com.example.music_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.music_app.adapters.SongsListAdapter
import com.example.music_app.databinding.ActivityMainBinding
import com.example.music_app.databinding.ActivitySongsListBinding
import com.example.music_app.models.GenreModel

class SongsListActivity : AppCompatActivity() {

    companion object {
        lateinit var genre: GenreModel
    }

    lateinit var binding: ActivitySongsListBinding
    lateinit var songsListAdapter : SongsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongsListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.nameTextView.text = genre.name
        Glide.with(binding.coverImageView).load(genre.coverUrl)
            .apply(
                RequestOptions().transform(RoundedCorners(32))
            )
            .into(binding.coverImageView)

        setupSongListRecylerView()
    }

    fun setupSongListRecylerView(){
        songsListAdapter = SongsListAdapter(genre.songs)
        binding.songsListRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.songsListRecyclerView.adapter = songsListAdapter
    }
}