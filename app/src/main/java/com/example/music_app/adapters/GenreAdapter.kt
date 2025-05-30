package com.example.music_app.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.RoundedCorner
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.media3.common.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.music_app.SongsListActivity
import com.example.music_app.databinding.GenreItemRecylerRowBinding
import com.example.music_app.models.GenreModel

class GenreAdapter(private val GenreList: List<GenreModel>) :
    RecyclerView.Adapter<GenreAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: GenreItemRecylerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binddata(genre: GenreModel) {
            binding.nameTextView.text = genre.name
            Glide.with(binding.coverImageView).load(genre.coverUrl)
                .apply(
                    RequestOptions().transform(RoundedCorners(32))
                )
                .into(binding.coverImageView)
             val context = binding.root.context
            binding.root.setOnClickListener{
                SongsListActivity.genre = genre
                context.startActivity(Intent(context,SongsListActivity::class.java))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            GenreItemRecylerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return GenreList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binddata(GenreList[position])
    }
}