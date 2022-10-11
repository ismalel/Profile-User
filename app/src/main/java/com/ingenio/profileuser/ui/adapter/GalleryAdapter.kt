package com.ingenio.profileuser.ui.adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ingenio.profileuser.data.model.User
import com.ingenio.profileuser.databinding.FragmentGalleryBinding
import com.ingenio.profileuser.databinding.GalleryItemBinding
import com.ingenio.profileuser.ui.view.MainActivity


class GalleryAdapter(private val application: Application, private val users: List<User>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {


    inner class ViewHolder(private var binding: GalleryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(user: User) {
                // Glide for testing
                Glide.with(application.applicationContext)
                    .load(user.avatar)
                    .into(binding.imageResource)
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: GalleryAdapter.ViewHolder, position: Int) {
        holder.bind(users[position])
    }

}